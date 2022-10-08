package mqtt_practice;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MqttPublisher_API implements MqttCallback{ // implement callback 추가 & 필요한 메소드 정의
	static MqttClient sampleClient;// Mqtt Client 객체 선언
	
    public static void main(String[] args) {
    	MqttPublisher_API obj = new MqttPublisher_API();//클래스 객체를 만듬 
    	obj.run();//현재 클래스의 run 메소드 실행 -> run메소드에 여러가지 메소드를 포함 
    }
    public void run() {    	
    	connectBroker(); // //브로커 서버 접속 메소드 실행 
    	try { // 여기 추가
    		sampleClient.subscribe("led");//클라이언트 객체가 led를 구독한다. 
		} catch (MqttException e1) {
			
			e1.printStackTrace();
		}
    	while(true) {//주기적으로 발행(publish)하고 싶으면 
    		try {
    			String[] weather_data  = get_weather_data(); // 공공 API
    	       	String pm_data = get_pm_data(); // 공공 API
    	       	publish_data("tmp", "{\"tmp\": "+weather_data[0]+"}"); // 온도 데이터 발행
    	       	publish_data("humi", "{\"humi\": "+weather_data[1]+"}"); // 습도 데이터 발행
    	       	publish_data("pm", "{\"pm\": "+pm_data+"}"); // 미세먼지 데이터 발행
    	       	//api가 업데이트 되는 시간단위로 sleep 사용 -> 여기서는 1시간 단위임 
    	       	Thread.sleep(5000); // 5초마다 publish 를 발생시킴 
    		}catch (Exception e) {

    			try {
    				sampleClient.disconnect();
				} catch (MqttException e1) {
					e1.printStackTrace();
				}
    			e.printStackTrace();
    	        System.out.println("Disconnected");
    	        System.exit(0);
			}
    	}
    }
    
    public void connectBroker() {//브로커와 연결 
        String broker = "tcp://127.0.0.1:1883"; //브로커 서버의 아이피 주소 ,1883:브로커 서버 포트번호
        String clientId = "practice"; // 클라이언트의 ID
        MemoryPersistence persistence = new MemoryPersistence();
        try {
        	//브로커가 누구와 연결할지 client ID로 결정된다. 
            sampleClient = new MqttClient(broker, clientId, persistence);// Mqtt Client 객체 초기화
            MqttConnectOptions connOpts = new MqttConnectOptions(); // 접속시 접속의 옵션을 정의하는 객체 생성
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker);
            sampleClient.connect(connOpts); // 브로커서버에 접속
            //메시지가 오면 callback이 일어난다. 
            sampleClient.setCallback(this);// Call back option 추가 -> callback 기능을 활성화 시킴 
            System.out.println("Connected");
        } catch(MqttException me) {//브로커 서버 접속에 오류가 났을떄 
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        }
    }
    
    public void publish_data(String topic_input, String data) { // @@@@@ 스태틱 제거
        String topic = topic_input; //토픽을 설정 
        int qos = 0; // QoS level
        try {
            System.out.println("Publishing message: "+data);
            //토픽, 전달할 데이터, Qos, false
            sampleClient.publish(topic, data.getBytes(), qos, false);//연결된 client에 맞게 topic 설정
            System.out.println("Message published");
        } catch(MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        }
    }
    
    public String[] get_weather_data() { //API : 기상청_동내예보_조회서비스
    	// 현재 시간 확인해서 날짜, 시간 저장
    	Date current = new Date(System.currentTimeMillis());
    	SimpleDateFormat d_format = new SimpleDateFormat("yyyyMMddHHmmss"); 
    	//System.out.println(d_format.format(current));
    	String date = d_format.format(current).substring(0,8); // 오늘 날짜 저장
    	String time = d_format.format(current).substring(8,10); //오늘 시간 저장 
       	
    	//날씨정보를 공공데이터 사이트에서 가져오기 위해 url를 만들어준다.
    	//데이터는 html 파일 형식으로 url이 가지고있다. 
    	String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtNcst"
    			+ "?serviceKey=X7VbxDZo%2F8scobmS5QUIF2h6s%2F2FVu4HbJ%2BSa2x31kXEuRx8j48OX79kZ4kGJ9F6jl7ef6Haq4SD2sK8t3Entw%3D%3D" // api 키값
    			+ "&pageNo=1"
    			+ "&numOfRows=10"
    			+ "&dataType=XML"
    			+ "&base_date="+date//실시간 데이터를 받기 위해 사용 -> 날짜
    			+ "&base_time="+time+"00"//시간
    			+ "&nx=73"
    			+ "&ny=134";
    	
    	//데이터를 저장할 변수 초기화
		String temp = "-99";
		String humi = "-99";
				
    	Document doc = null;
		
    	// Jsoup으로 API 데이터 가져오기파싱
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(doc);
		
		Elements elements = doc.select("item");//item에 각각의 데이터가 저장되어있음 
		for (Element e : elements) {
			if (e.select("category").text().equals("T1H")) { // 기온데이터
				temp = e.select("obsrValue").text();
			}
			if (e.select("category").text().equals("REH")) { // 습도
				humi = e.select("obsrValue").text();
			}
		}
		String[] out = {temp, humi};//데이터들을 배열로 만들어 리턴함 
    	return out;
    }
    
    
    public String get_pm_data() { //api : 한국환경공단_에어코리아_대기오염정보
    	//가져올 데이터가 있는 html 파일의 주소 
    	String url = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/"
    			+ "getCtprvnRltmMesureDnsty"
    			+ "?serviceKey=X7VbxDZo%2F8scobmS5QUIF2h6s%2F2FVu4HbJ%2BSa2x31kXEuRx8j48OX79kZ4kGJ9F6jl7ef6Haq4SD2sK8t3Entw%3D%3D"
    			+ "&returnType=xml"
    			+ "&numOfRows=100"
    			+ "&pageNo=1"
    			+ "&sidoName=%EA%B0%95%EC%9B%90" // 강원
    			+ "&ver=1.0"; //크롤링할 url지정
		String value = "";
    	Document doc = null;
    	
    	// 2.파싱 -> Jsoup으로 url에 있는 정보 결과를 다 가져온다. 
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(doc);
		Elements elements = doc.select("item");//item에는 각각의 동에 대해서 저장되어있음 
		for (Element e : elements) {//모든 동 데이터를 하나씩 꺼내옴 
			if (e.select("stationName").text().equals("옥천동")) {//stationName : 내가 원하는 동의 이름 
				value = e.select("pm10Value").text();//미세먼지 정보를 가지고 있는것
			}
		}
    	return value;//미세먼지 데이터 리턴 
    }
    
    ///MQTTCALLBACK -> 인터페이스를 사용하면 다음 3개의 메소드를 무조건 정의해줘야함.
    // 이중 중요한것은 messageArrived 이다. 
	@Override
	public void connectionLost(Throwable arg0) {//연결이 끊어지면 어떤것을 할 것인지 
		// TODO Auto-generated method stub
		System.out.println("Connection lost");
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {//
		// TODO Auto-generated method stub
	}

	@Override
	public void messageArrived(String topic, MqttMessage msg) throws Exception {
		//구독한 topic에 대해 메시지가 도착했을 경우
		// TODO Auto-generated method stub
		if (topic.equals("led")){//토픽이 led이면 실행 
			System.out.println("--------------------Actuator Function--------------------");
			System.out.println("LED Display changed");
			System.out.println("LED: " + msg.toString());
			System.out.println("---------------------------------------------------------");
		}		
	}
}

// written by Sang-woo Lee (http://210.115.227.106:8080/cv_sw)
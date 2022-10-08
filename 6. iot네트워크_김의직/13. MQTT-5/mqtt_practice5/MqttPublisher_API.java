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

public class MqttPublisher_API implements MqttCallback{ // implement callback �߰� & �ʿ��� �޼ҵ� ����
	static MqttClient sampleClient;// Mqtt Client ��ü ����
	
    public static void main(String[] args) {
    	MqttPublisher_API obj = new MqttPublisher_API();//Ŭ���� ��ü�� ���� 
    	obj.run();//���� Ŭ������ run �޼ҵ� ���� -> run�޼ҵ忡 �������� �޼ҵ带 ���� 
    }
    public void run() {    	
    	connectBroker(); // //���Ŀ ���� ���� �޼ҵ� ���� 
    	try { // ���� �߰�
    		sampleClient.subscribe("led");//Ŭ���̾�Ʈ ��ü�� led�� �����Ѵ�. 
		} catch (MqttException e1) {
			
			e1.printStackTrace();
		}
    	while(true) {//�ֱ������� ����(publish)�ϰ� ������ 
    		try {
    			String[] weather_data  = get_weather_data(); // ���� API
    	       	String pm_data = get_pm_data(); // ���� API
    	       	publish_data("tmp", "{\"tmp\": "+weather_data[0]+"}"); // �µ� ������ ����
    	       	publish_data("humi", "{\"humi\": "+weather_data[1]+"}"); // ���� ������ ����
    	       	publish_data("pm", "{\"pm\": "+pm_data+"}"); // �̼����� ������ ����
    	       	//api�� ������Ʈ �Ǵ� �ð������� sleep ��� -> ���⼭�� 1�ð� ������ 
    	       	Thread.sleep(5000); // 5�ʸ��� publish �� �߻���Ŵ 
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
    
    public void connectBroker() {//���Ŀ�� ���� 
        String broker = "tcp://127.0.0.1:1883"; //���Ŀ ������ ������ �ּ� ,1883:���Ŀ ���� ��Ʈ��ȣ
        String clientId = "practice"; // Ŭ���̾�Ʈ�� ID
        MemoryPersistence persistence = new MemoryPersistence();
        try {
        	//���Ŀ�� ������ �������� client ID�� �����ȴ�. 
            sampleClient = new MqttClient(broker, clientId, persistence);// Mqtt Client ��ü �ʱ�ȭ
            MqttConnectOptions connOpts = new MqttConnectOptions(); // ���ӽ� ������ �ɼ��� �����ϴ� ��ü ����
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker);
            sampleClient.connect(connOpts); // ���Ŀ������ ����
            //�޽����� ���� callback�� �Ͼ��. 
            sampleClient.setCallback(this);// Call back option �߰� -> callback ����� Ȱ��ȭ ��Ŵ 
            System.out.println("Connected");
        } catch(MqttException me) {//���Ŀ ���� ���ӿ� ������ ������ 
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        }
    }
    
    public void publish_data(String topic_input, String data) { // @@@@@ ����ƽ ����
        String topic = topic_input; //������ ���� 
        int qos = 0; // QoS level
        try {
            System.out.println("Publishing message: "+data);
            //����, ������ ������, Qos, false
            sampleClient.publish(topic, data.getBytes(), qos, false);//����� client�� �°� topic ����
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
    
    public String[] get_weather_data() { //API : ���û_��������_��ȸ����
    	// ���� �ð� Ȯ���ؼ� ��¥, �ð� ����
    	Date current = new Date(System.currentTimeMillis());
    	SimpleDateFormat d_format = new SimpleDateFormat("yyyyMMddHHmmss"); 
    	//System.out.println(d_format.format(current));
    	String date = d_format.format(current).substring(0,8); // ���� ��¥ ����
    	String time = d_format.format(current).substring(8,10); //���� �ð� ���� 
       	
    	//���������� ���������� ����Ʈ���� �������� ���� url�� ������ش�.
    	//�����ʹ� html ���� �������� url�� �������ִ�. 
    	String url = "http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtNcst"
    			+ "?serviceKey=X7VbxDZo%2F8scobmS5QUIF2h6s%2F2FVu4HbJ%2BSa2x31kXEuRx8j48OX79kZ4kGJ9F6jl7ef6Haq4SD2sK8t3Entw%3D%3D" // api Ű��
    			+ "&pageNo=1"
    			+ "&numOfRows=10"
    			+ "&dataType=XML"
    			+ "&base_date="+date//�ǽð� �����͸� �ޱ� ���� ��� -> ��¥
    			+ "&base_time="+time+"00"//�ð�
    			+ "&nx=73"
    			+ "&ny=134";
    	
    	//�����͸� ������ ���� �ʱ�ȭ
		String temp = "-99";
		String humi = "-99";
				
    	Document doc = null;
		
    	// Jsoup���� API ������ ���������Ľ�
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(doc);
		
		Elements elements = doc.select("item");//item�� ������ �����Ͱ� ����Ǿ����� 
		for (Element e : elements) {
			if (e.select("category").text().equals("T1H")) { // ��µ�����
				temp = e.select("obsrValue").text();
			}
			if (e.select("category").text().equals("REH")) { // ����
				humi = e.select("obsrValue").text();
			}
		}
		String[] out = {temp, humi};//�����͵��� �迭�� ����� ������ 
    	return out;
    }
    
    
    public String get_pm_data() { //api : �ѱ�ȯ�����_�����ڸ���_����������
    	//������ �����Ͱ� �ִ� html ������ �ּ� 
    	String url = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/"
    			+ "getCtprvnRltmMesureDnsty"
    			+ "?serviceKey=X7VbxDZo%2F8scobmS5QUIF2h6s%2F2FVu4HbJ%2BSa2x31kXEuRx8j48OX79kZ4kGJ9F6jl7ef6Haq4SD2sK8t3Entw%3D%3D"
    			+ "&returnType=xml"
    			+ "&numOfRows=100"
    			+ "&pageNo=1"
    			+ "&sidoName=%EA%B0%95%EC%9B%90" // ����
    			+ "&ver=1.0"; //ũ�Ѹ��� url����
		String value = "";
    	Document doc = null;
    	
    	// 2.�Ľ� -> Jsoup���� url�� �ִ� ���� ����� �� �����´�. 
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(doc);
		Elements elements = doc.select("item");//item���� ������ ���� ���ؼ� ����Ǿ����� 
		for (Element e : elements) {//��� �� �����͸� �ϳ��� ������ 
			if (e.select("stationName").text().equals("��õ��")) {//stationName : ���� ���ϴ� ���� �̸� 
				value = e.select("pm10Value").text();//�̼����� ������ ������ �ִ°�
			}
		}
    	return value;//�̼����� ������ ���� 
    }
    
    ///MQTTCALLBACK -> �������̽��� ����ϸ� ���� 3���� �޼ҵ带 ������ �����������.
    // ���� �߿��Ѱ��� messageArrived �̴�. 
	@Override
	public void connectionLost(Throwable arg0) {//������ �������� ����� �� ������ 
		// TODO Auto-generated method stub
		System.out.println("Connection lost");
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {//
		// TODO Auto-generated method stub
	}

	@Override
	public void messageArrived(String topic, MqttMessage msg) throws Exception {
		//������ topic�� ���� �޽����� �������� ���
		// TODO Auto-generated method stub
		if (topic.equals("led")){//������ led�̸� ���� 
			System.out.println("--------------------Actuator Function--------------------");
			System.out.println("LED Display changed");
			System.out.println("LED: " + msg.toString());
			System.out.println("---------------------------------------------------------");
		}		
	}
}

// written by Sang-woo Lee (http://210.115.227.106:8080/cv_sw)
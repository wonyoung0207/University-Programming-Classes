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
import java.util.Random;

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
    //å �����͸� ������ �迭 
	String[] author = new String[10];
	String[] title = new String[10];
	String[] type = new String[10];
	
    public void run() {
    	connectBroker(); // //���Ŀ ���� ���� �޼ҵ� ���� 

    	int i = 0;
    	while(i < 10) {//�ֱ������� ����(publish)�ϰ� ������ 
    		try {
    	       	get_book_data();//å ������ ���� 
    	       	
    	       	publish_data("author", "{\"author\": "+ "\"" + author[i] + "\"" +"}"); // �۰� ������ ����
    	       	publish_data("title", "{\"title\": "+ "\"" + title[i] + "\"" +"}");; // ���� ������ ����
    	       	publish_data("type", "{\"type\": "+ "\"" + type[i] + "\"" +"}");; // åŸ�� ������ ����
    	       	
    	       	Thread.sleep(3000); // 5�ʸ��� publish �� �߻���Ŵ 
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
    
    public void publish_data(String topic_input, String data) { //
        String topic = topic_input; //������ ���� 
        int qos = 0; // QoS level
        try {
            System.out.println("Publishing message: "+data);
            //����, ������ ������, Qos, false
            sampleClient.publish(topic, data.getBytes(), qos, false);//����� client�� �°� topic �����Ǵ� ���� 
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
    
    public void get_book_data() { //API : �����߾ӵ����� ��õ����
    	// ���� �ð� Ȯ���ؼ� ��¥, �ð� ����
    	String[] book_type = {"11","6","5","4"};
    	Random r = new Random();
    	String bt = book_type[r.nextInt(4)];//å�� Ÿ���� �����ϰ� �����ؼ� �����´�. 
    	
    	Date current = new Date(System.currentTimeMillis());
    	SimpleDateFormat d_format = new SimpleDateFormat("yyyyMMdd"); 
    	String date = d_format.format(current).substring(0,8); // ���� ��¥ ����

    	//�����ʹ� html ���� �������� url�� �������ִ�. 
    	String url = "https://nl.go.kr/NL/search/openApi/saseoApi.do"
    			+ "?key=da37d369eb8c3047f55b17eddc77094d12ee1535f30712678b25b2bf8143935d" // api Ű��
    			+ "&startRowNumApi=1"
    			+ "&endRowNumApi=10"
    			+ "&start_date=20210101"
    			+ "&nd_date="+date//���ó�¥���� 
    			+ "&drCode=" + bt;
    	
    	Document doc = null;
		
    	// Jsoup���� API ������ ���������Ľ�
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements elements = doc.select("item");//item�� ������ �����Ͱ� ����Ǿ����� 
		int i = 0;
		for (Element e : elements) {
			author[i] = e.select("recomauthor").text();
			title[i] = e.select("recomtitle").text();
			type[i] = e.select("drCodeName").text();
			i++;
		}
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
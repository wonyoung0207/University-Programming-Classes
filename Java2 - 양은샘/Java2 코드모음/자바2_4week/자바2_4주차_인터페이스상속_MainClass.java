package �ڹ�2_4week;

public class �ڹ�2_4����_�������̽����_MainClass {

	public static void main(String[] args) {
		�ڹ�2_4����_�������̽����_implementClass impl = new �ڹ�2_4����_�������̽����_implementClass();
		
		�ڹ�2_4����_�������̽����_interfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); -> �Ұ���, 
		//�������̽�A�� �������̽�B�� ���� ���Ѵ�. A��B�� �ƴ°��� �� ���� ��ӹ��� �������̽�C �� �˼� �ִ�. 
		System.out.println();
		
		�ڹ�2_4����_�������̽����_interfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		�ڹ�2_4����_�������̽����_interfaceC ic = impl;
		ic.methodC();
		ic.methodA();
		ic.methodB();
		System.out.println();
	}

}

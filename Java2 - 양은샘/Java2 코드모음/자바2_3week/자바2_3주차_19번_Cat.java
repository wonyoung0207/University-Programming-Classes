package �ڹ�2_3week;

public class �ڹ�2_3����_19��_Cat extends �ڹ�2_3����_19��_Animal{
	
	public String toString() {
		return getName() + "�����";
	}
	public �ڹ�2_3����_19��_Cat()	{
		this("Anonymous");
	}
	public �ڹ�2_3����_19��_Cat(String cat_name)	{
		setName(cat_name);//super(cat_name) // �̰͵� ���� 
	}
	public void sound() {//�������̵� -> ����Ŭ������ Ÿ�԰� �Ű����� ���ƾ���. 
		System.out.print(" ��~��");		
	}

}

package �ڹ�2_3week;

public abstract class �ڹ�2_3����_19��_Animal {
	private String name;
	
	public String reaction(�ڹ�2_3����_19��_Animal cat_dog) {//������ �̿�
		//cat_dog ��ü�� "�ڹ�2_3����_19��_Cat" �ȿ��� ������ ��ü��?
		if (cat_dog instanceof �ڹ�2_3����_19��_Cat) {//�Ű������� �� ��ü�� CatŬ������ ��ü��� ����
			return "����������";			
		}
		else {//�Ű������� �� ��ü�� DogŬ������ ��ü��� ����
			return "�����ø���";
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}


	
	//�߻� �޼ҵ�� ������ �������� �ʴ´�. ����Ŭ�������� �����Ұ��̱� ������
	public abstract void sound();
	
}

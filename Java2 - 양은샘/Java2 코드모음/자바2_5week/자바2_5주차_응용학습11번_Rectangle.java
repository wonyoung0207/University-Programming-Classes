package �ڹ�2_5week;

public class �ڹ�2_5����_�����н�11��_Rectangle implements �ڹ�2_5����_�����н�11��_IGraphics {
	private int length,width;
	
	public �ڹ�2_5����_�����н�11��_Rectangle() {//����Ʈ ������ 
		this.length = 0;
		this.width = 0;
		
	}
	
	public void setvalue(int l,int w) {
		this.length = l;
		this.width = w;
	}
	
	public int getArea() {
		return this.length * this.width;//������ ���� 
	}
	
	public void draw() {//����Ʈ �޼ҵ� ������ 
		System.out.println("�簢���� �׸��ϴ�. ");
	}

}

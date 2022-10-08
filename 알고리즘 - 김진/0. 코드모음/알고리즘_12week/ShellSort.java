package �˰���_12week;


public class ShellSort {
	
	public void shellSort(int []array)
	{
		int interval = array.length; //�迭�� ���̸� �б�� ���������� interval ���� ���� �� �ʱ�ȭ
		while(interval>1)//�迭�� ���̰� 2�̻��϶�
		{
			interval = 1+interval/3;//�迭�� ������ ����
			for(int i=0; i<interval; i++)
			{
				intervalSort(array,i,interval);//�� �б⺰�� �������� ����
			}
		}
	}
	
	public void intervalSort(int []a,int i,int interval)
	{
		//���긮��Ʈ�� ���� ���ķ� �����ϴ� shellSort()�� �����Լ� 
		int j = i+interval; //
		while(j< a.length)
		{
			int n = a[j]; //���긮��Ʈ�� ���ο� ����
			int k = j; //n���� ū ���Ҵ� interval��ŭ ���������� �̵�
			boolean move = true; 
			while(move)
			{
				if(a[k-interval]<=n)
					move = false;
				else
				{
					a[k]=a[k-interval];
					k=k-interval;
					if(k==i) 
						move = false; 
				}
			}
			a[k]=n;//�̵��ؼ� ���� �ڸ��� ����
			j=j+interval;//���� ���긮��Ʈ ������ �ε���
		}
	}
}

import java.util.*;

public class chorusCalculate{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for(int i=0;i<num;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println( calculateNum(a,num) );
		sc.close();
	}
	
	public static int calculateNum(int[] a,int num)
	{
		//����left��right����
		//left[i]��ʾ���ȵ�ǰԪ��iС��Ԫ�صĸ���
		//right[i]��ʾ�Ҳ�ȵ�ǰԪ��iС��Ԫ�ظ���
		int[] left = new int[num]; //�������鲢��ʼ��ΪĬ��ֵ,int��Ϊ0 
		int[] right = new int[num]; //�������鲢��ʼ��ΪĬ��ֵ,int��Ϊ0 
		//�ȼ���left����
		//�ȱ���
		for(int i=0;i<num/*��ֹj+1Խ��*/;i++)
		{
			//�ٷ����飬�����Ԫ�رȽϣ����µ�ǰԪ��left[i]ֵ
			for(int j=i-1;j>=0;j--)
			{
				if(left[i]<=left[j] && a[i]>a[j])
				{
					left[i] = left[j] + 1;
				}				
			}
		}
		
		
		//�ټ���right����
		//���������
		for(int i=num-1;i>=0;i--)
		{
			//�ٷ����飬���Ҳ�Ԫ�رȽϣ����µ�ǰԪ��right[i]ֵ
			for(int j=i+1;j<num/*��ֹj+1Խ��*/;j++)
			{
				if(right[i]<=right[j] && a[i]>a[j])
				{
					right[i] = right[j] + 1;
				}					
			}
		}		
		
		//��left[i]+right[i]�����ֵ
		int max = left[0] + right[0];
		for(int i=0;i<num;i++)
		{
			if(max<left[i]+right[i])
			{
				max = left[i] + right[i];
			}
		}
		
		//�޳�����������Ӧ��Ϊ��num-(max+1)
		return num-(max+1);
		
		
		//���䣺�������пɸ��ݶ��������ҵݼ��г�
	}
	
}




















import java.util.*;

public class calculateSeven{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		
		//�����ڼ�ⷶΧ�ڵ�����
		for(int i=7;i<=n;i++)
		{
			//�Կ��Ա�7���������7�����ֽ��м���
			if( i%7 == 0 || Integer.toString(i).indexOf('7')>=0 )
			{
				num++;
			}
		}
		
		System.out.println(num);
		sc.close();
	}
}




















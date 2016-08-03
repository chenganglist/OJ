import java.util.*;

public class calculateSeven{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		
		//遍历在检测范围内的数字
		for(int i=7;i<=n;i++)
		{
			//对可以被7整除或包含7的数字进行计数
			if( i%7 == 0 || Integer.toString(i).indexOf('7')>=0 )
			{
				num++;
			}
		}
		
		System.out.println(num);
		sc.close();
	}
}




















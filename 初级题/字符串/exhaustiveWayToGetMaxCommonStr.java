import java.util.*;

public class exhaustiveWayToGetMaxCommonStr{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		System.out.println( getMaxCommonNum(s1,s2) );
		
		sc.close();
	}
	
	
	public static int getMaxCommonNum(String s1,String s2)
	{
		if(s1.length()>s2.length())
		{
			String tmp = s1;
			s1 = s2;
			s2 = tmp;
		}
		int num = 1;
		int len = s1.length();
		for(int start=0;start<len;start++)
		{
			for(int end=len;end>start;end--)
			{
				String tmp = s1.substring(start,end);
				if(s2.indexOf( tmp )>=0 )
				{
					num = tmp.length();
					return num;
				}
			}
		}
		return num;
	}
}





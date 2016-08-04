import java.util.*;
//Arrays.sort(),从小到大排序
public class beautyNumOfStr{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i=0;i<n;i++)
		{
			s[i] = sc.next();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(getMaxBTNum(s[i]));
		}		
		

		sc.close();
	}
	
	public static int getMaxBTNum(String s)
	{
		int num = 0;
		int[] a = new int[26];
		int length = s.length();
		s = s.toLowerCase();
		for(int i=0;i<length;i++)
		{
			a[s.charAt(i)-'a']++;
		}
		
		Arrays.sort(a);
		
		for(int i=25;i>=0;i--)
		{
			num = num + (i+1)*a[i];
		}
		
		return num;
	}
}





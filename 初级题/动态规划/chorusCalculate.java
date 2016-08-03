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
		//设置left和right数组
		//left[i]表示左侧比当前元素i小的元素的个数
		//right[i]表示右侧比当前元素i小的元素个数
		int[] left = new int[num]; //创建数组并初始化为默认值,int型为0 
		int[] right = new int[num]; //创建数组并初始化为默认值,int型为0 
		//先计算left数组
		//先遍历
		for(int i=0;i<num/*防止j+1越界*/;i++)
		{
			//再反向检查，与左侧元素比较，更新当前元素left[i]值
			for(int j=i-1;j>=0;j--)
			{
				if(left[i]<=left[j] && a[i]>a[j])
				{
					left[i] = left[j] + 1;
				}				
			}
		}
		
		
		//再计算right数组
		//先逆向遍历
		for(int i=num-1;i>=0;i--)
		{
			//再反向检查，与右侧元素比较，更新当前元素right[i]值
			for(int j=i+1;j<num/*防止j+1越界*/;j++)
			{
				if(right[i]<=right[j] && a[i]>a[j])
				{
					right[i] = right[j] + 1;
				}					
			}
		}		
		
		//求left[i]+right[i]的最大值
		int max = left[0] + right[0];
		for(int i=0;i<num;i++)
		{
			if(max<left[i]+right[i])
			{
				max = left[i] + right[i];
			}
		}
		
		//剔除的最少人数应该为：num-(max+1)
		return num-(max+1);
		
		
		//补充：最优序列可根据顶点向左右递减列出
	}
	
}




















import java.util.*;

public class reverseString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(new StringBuilder(s).reverse().toString());
		sc.close();
	}  
}
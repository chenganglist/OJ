import java.util.*;

public class lastWordLenOfString{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] a = s.split(" ");
        System.out.println( a[a.length -1 ].length() );
    }
}
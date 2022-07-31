import java.lang.*;
import java.util.*;

public class prec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        int x=0,count=0;
        if(s1.length()>s2.length())
        {
            x = s2.length();
        }
        else{
            x = s1.length();
        }

        for(int i=0; i<x-1 ; i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                if(s1.charAt(i+1)==s2.charAt(i+1))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
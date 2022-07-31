import java.lang.*;
import java.util.*;

public class Prec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     String s1[] = new String[a];
     String s2[] = new String[a];

     for(int i=0;i<a;i++)
     {
         s1[i] = sc.next();
     }

     String s3 = sc.next();

     int n=0;
     for(int i=0;i<a;i++)
     {
         if(!s1[i].contains(s3))
         {
             s2[n]=s1[i];
             n++;
         }
     }

     for(int i=0;i<n;i++)
     {
         System.out.println(s2[i]);
     }

    }

}

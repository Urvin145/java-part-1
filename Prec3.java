

import java.lang.*;
import java.util.*;

public class Prec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        int a,b,c;
        x = sc.nextInt();
        y = sc.nextInt();

        if(x==(y%10))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
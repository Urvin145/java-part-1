// Urvin Thummar 
// 21ce145
import java.lang.*;
import java.util.*;
public class Prec2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char z;

        String name = sc.next();

        if (name.startsWith("oz")) {
            System.out.println("oz");
        }
        else 
        {
            if (name.startsWith("o")) {
                System.out.println("o");
            } else if (name.charAt(1) == 'z') {
                System.out.println("z");
            }
        }
    }
}

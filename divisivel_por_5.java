package lista3_see_comparadorlogico;
import java.util.Scanner;
public class divisivel_por_5 {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite x numero");
        int x1 = 5;
        int x = sm.nextInt();
        int mod = x%5;
        if (mod == 0){
            System.out.println("  é divisivel por 5");
        }
        else if (mod != 0 ){
            System.out.println("  n divisivel por 5");
        }
        sm.close();
    }
}

package lista3_see_comparadorlogico;
import java.util.Scanner;
public class maior_de_tres_numeros {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        int x , x2, x3;
        System.out.println("digite x numero");
        x = sm.nextInt();
        System.out.println("digite x numero");
          x2 = sm.nextInt();
        System.out.println("digite x numero");
          x3 = sm.nextInt();
        if (x > x2 && x > x3){
            System.out.println("O primeiro numero é maior: " + x);
        }
        if (x2 > x && x2 > x3){
            System.out.println("o segundo numero é maior : " + x2);
        }
        else if (x3 > x && x3 > x2){
            System.out.println("o terceiro numero é maior" + x3);
        }
        sm.close();
    }
}

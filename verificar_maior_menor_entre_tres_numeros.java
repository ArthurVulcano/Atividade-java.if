package lista3_see_comparadorlogico;
import java.util.Scanner;

public class verificar_maior_menor_entre_tres_numeros {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("digite x numero");
        int x = sm.nextInt();
        System.out.println("digite x numero");
        int x2 = sm.nextInt();
        System.out.println("digite x numero");
        int x3 = sm.nextInt();
        if (x > x2 && x > x3 ){
            System.out.println("O primeiro numero é maior");
        } else if (x2 > x && x2 > x3) {
            System.out.println("O segundo numero é maior");

        }
        else {
            System.out.println("O terceiro é maior");
        }
        if (x < x2 && x < x3){
            System.out.println("O primeiro numero é menor");
        } else if (x2 < x && x2 < x3) {
            System.out.println("O segundo numero é menor");
        }
        else {
            System.out.println("O terceiro numero é menor");
        }
    }
}

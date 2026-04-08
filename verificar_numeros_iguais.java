package lista3_see_comparadorlogico;
import java.util.Scanner;

public class verificar_numeros_iguais {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite x numero");
        int x = sm.nextInt();
        System.out.println("Digite x numero");
        int x2 = sm.nextInt();
        if (x == x2){
            System.out.println("São iguais");
        }
        else {
            System.out.println("Não iguais");
        }

    }
}

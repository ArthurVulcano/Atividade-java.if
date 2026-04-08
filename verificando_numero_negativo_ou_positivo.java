package lista3_see_comparadorlogico;
import java.util.Scanner;

public class verificando_numero_negativo_ou_positivo {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite x numero");
        int x = sm.nextInt();
        if (x < 0){
            System.out.println("seu numero é negativo");
        }
        else {
            System.out.println("Seu numero é positivo");
        }
        sm.close();
    }
}

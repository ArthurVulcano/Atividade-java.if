package lista3_see_comparadorlogico;
import java.util.Scanner;

public class aprovado_e_reprovado {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite sua nota");
        int x = sm.nextInt();
        if (x >= 7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}

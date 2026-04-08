package lista3_see_comparadorlogico;
import java.util.Scanner;

public class verificacao_de_temperatura {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite a temperatura atual");
        double x = sm.nextDouble();
        if (x > 40){
            System.out.println("Temperatura extremamente alta: " + x + " graus");
        }
        else {
            System.out.println("Temperatura dentro dos limites");
        }

    }
}

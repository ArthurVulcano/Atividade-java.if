package lista3_see_comparadorlogico;
import java.util.Scanner;

public class verificacao_de_temperatura2 {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite a temperatura atual");
        int x = sm.nextInt();
        if (x < 15){
            System.out.println("temperatura baixa");
        }
        if (x > 15 && x < 25){
            System.out.println("Temperatura agradavel");
        } else if (x > 25){
            System.out.println("temperatura quente");
        }
        sm.close();
    }
}

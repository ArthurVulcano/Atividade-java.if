package lista3_see_comparadorlogico;
import java.util.Scanner;

public class verificacao_de_faixa_etaria {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int x = sm.nextInt();

        if (x > 13 && x < 17){
            System.out.println("Adolescente");
        }
        if (x > 18 && x < 64){
            System.out.println("Adulto");
        }
        if (x > 64){
            System.out.println("Idoso");
        } else if (x <= 12) {
            System.out.println("Criança");
        }
        {

        }
        sm.close();

    }
}

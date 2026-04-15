package lista3_see_comparadorlogico;
import java.util.Scanner;
public class verificacao_de_idade {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int x = sm.nextInt();
        if ( x >= 18 ){
            System.out.println("Maior de idade: " + x);
        }
        else {
            System.out.println("Menorde idade: " + x );
        }
         sm.close();
    }
}

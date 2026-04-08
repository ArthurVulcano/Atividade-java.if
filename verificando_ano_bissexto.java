package lista3_see_comparadorlogico;
import java.util.Scanner;
public class verificando_ano_bissexto {
    public static void main(String[] args) {
        int x;
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite um ano");
         x = sm.nextInt();
        int mod = x%400;
        if ((x %400 ==0 ) || ((x % 4 == 0 ) && (x % 100 != 0))){
            System.out.println("Ano  bissexto");
        }
        else {
            System.out.println("Ano não bissexto");
        }
        sm.close();
    }
}

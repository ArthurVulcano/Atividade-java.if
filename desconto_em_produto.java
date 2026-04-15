package lista3_see_comparadorlogico;
import java.util.Scanner;
public class desconto_em_produto {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("digite o preço do produto");
        double x = sm.nextInt();
        double desc =  x * 0.1;
        if (x < 100.00){
            System.out.println("seu desconto foi de : " + desc + " Preço com desconto: " + (x - desc ));
        }
        else {
            System.out.println("Sem desconto: " + x);
        }
        sm.close();

    }
}

package lista3_see_comparadorlogico;
import java.util.Scanner;

public class varificar_triangulo {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite x numero");
        int x = sm.nextInt();
        System.out.println("Digite x numero");
        int x2 = sm.nextInt();
        System.out.println("Digite x numero");
        int x3 = sm.nextInt();
        if (x + x2 > x3){
            System.out.println("Pode-se formar um triangulo" );
        }
        else {
            System.out.println("Não se pode formar");
        }
    }
}

package lista3_see_comparadorlogico;

import java.util.Scanner;
public class verificando_Salário1 {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("digite seu salario");
        double x = sm.nextDouble();

        if (x > 2000){
            System.out.println("salario Alto " + x);
        }
        else {
            System.out.println("Salario Baixo: " + x);
        }
        sm.close();
    }
}

package lista3_see_comparadorlogico;
import java.util.Scanner;

public class verificacao_de_voto {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int x = sm.nextInt();
        if (x >= 16){
            System.out.println("Pode votar!!");
        }
        else{
            System.out.println("Não pode votar!!");
        }
        sm.close();
    }

}

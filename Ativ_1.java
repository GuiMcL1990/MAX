package AtividadeMAX;
import java.util.Scanner;
public class Ativ_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero positivo ou negativo ");
        int x = sc.nextInt();
        int Result = Positivo_Negativo(x);
        sc.close();
    }

    public static int Positivo_Negativo(int x) {
        if (x > 0) {
            System.out.println("O numero  é positivo");
        } else {
            if (x < 0) ;
            System.out.println("O numero é negativo");
        }
        return x;
    }
}







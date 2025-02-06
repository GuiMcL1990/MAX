package AtividadeMAX;
import java.util.Scanner;
public class Ativ_1_8_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char x = sc.next().toLowerCase().charAt(0);
        int Result = vogal(x);
        showResult(Result, x);
        sc.close();
    }
    public static int vogal(int x){
        int aux;
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            aux = 0;
        } else {
            aux = 1;
        }
        return aux;
    }
        public static void showResult(int value, char x) {
            if (value == 0) {
                System.out.println("A letra " + x + " é uma vogal");
            } else {
                System.out.println("A letra " + x + " não é uma vogal");
            }
        }
    }



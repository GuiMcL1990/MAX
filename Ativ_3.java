package AtividadeMAX;

import java.util.Scanner;

public class Ativ_3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero ");
            int x = sc.nextInt();
            System.out.println("Digite um numero");
            int v = sc.nextInt();
            int Result = MaiorNumero(x,v);
            sc.close();
        }
        public static int MaiorNumero(int x, int v) {
            if (x > v) {
                System.out.println("O numero "+ x+" é maior que "+ v);
            } else {
                if (x < v) ;
                System.out.println("O numero "+ v+" é maior que "+ x);
            }
            return x;
        }
    }
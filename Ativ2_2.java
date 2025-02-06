package AtividadeMAX;

import java.util.Scanner;

public class Ativ2_2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno");
        a = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno");
        b = sc.nextDouble();
        c = (a + b / 2);
        int Result = MaiorNumero(a, b, c);
        sc.close();
    }

    public static int MaiorNumero(double a, double b, double c) {
        if (c >= 7) {
            System.out.println("o aluno esta aprovado com nota " + c);
        } else if (c == 5) {
            System.out.println("o aluno esta de recuperação com nota " + c);
        } else {
            System.out.println("o aluno esta reprovado com nota " + c);

        }
        return c;
    }
}


package one.digitalinnovation.basecamp;
import java.util.Scanner;

public class Main {

    //Encaixa ou não Encaixa

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean C;

        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Insira o valor de A: ");
            String A = scan.next();
            System.out.print("Insira o valor de B: ");
            String B = scan.next();
            C = A.endsWith(B);

            System.out.println(C);
            if (C == true) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }

        }
    }
}

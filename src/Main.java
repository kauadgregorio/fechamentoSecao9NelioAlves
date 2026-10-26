import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder name: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        double inicialDeposit = 0;
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            inicialDeposit = sc.nextDouble();
            conta = new Conta(number, holder, inicialDeposit);
        } else {
            conta = new Conta(number, holder);
        }

        System.out.println();
        System.out.println("Enter account data: ");
        System.out.println(conta);

        System.out.println("Do you want to add some value (y/n)?");
        char response2 = sc.next().charAt(0);

        if (response2 == 'y') {
            System.out.println();
            System.out.print("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            conta.deposit(depositValue);
            System.out.print("Updated account data: ");
            System.out.println(conta);
        }

        System.out.println("Do you want to remove some value (y/n)?");
        char response3 = sc.next().charAt(0);

        if (response3 == 'y') {
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();
            conta.withdraw(withdrawValue);
            System.out.print("Updated account data: ");
            System.out.println(conta);
        }

        sc.close();
    }
}
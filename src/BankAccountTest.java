import java.io.IOException;
import java.util.Scanner;

public class BankAccountTest {
    public static int Menu() {
        Scanner entrada = new Scanner(System.in);
        int option;
        System.out.println("[1] saldo");
        System.out.println("[2] retirar");
        System.out.println("[3] depositar");
        System.out.println("[0] salir");
        option = entrada.nextInt();
        return 0;
    }

    public static void main(String[] args) throws IOException {
        int option = 4;
        BankAccountTest account = new BankAccountTest(

        );
        do {
            option = Menu();
            if(option == 1){
                System.out.println(" tu saldo es : " + account.getBalance());
                account.getBalance();}
                if(option == 2){
                    System.out.println(" cantidad a retirar: " +);
                }

        }while(option != 0);
        System.out.println("la opcion seleccionada es = " + option);

    }

}

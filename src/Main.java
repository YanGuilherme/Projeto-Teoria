import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("Bem vindo(a)");
        System.out.print("1.AFD\n2.AFN\nEscolha uma opção: ");
        escolha = scanner.nextInt();
        scanner.close();
        switch (escolha){
            case 1:
                Automato af1 = new Automato();
                break;
            default:
                System.out.println("Ok");
                break;
        }   



    }
}
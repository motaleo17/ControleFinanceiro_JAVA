import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Leonardo Mota";
        String tipoConta = "Corrente";
        double saldo = 5000.99;
        int opcao = 0;

        System.out.println("*****************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("*****************");

        String menu = """
                ** Digite sua Opcao **
                1 - Saldo Atual
                2 - Transferencia
                3 - Deposito
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while ( opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo atual é: " + saldo);
            }else if (opcao == 2){
                System.out.println("Informe o valor da transferencia: ");
                double transferencia = leitura.nextDouble();
                if (transferencia > saldo){
                    System.out.println("Voce nao possui saldo sulficiente para transferir: R$ " + transferencia + "\nSeu saldo é de R$ " + saldo);
                }else{
                    saldo -= transferencia;
                    System.out.println("Seu saldo atualizado é: " + saldo);
                }
            }else if (opcao == 3){
                System.out.println("Informe o valor do deposito: ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Seu saldo atualizado e: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opcao Invalida!!!");
            }
        }
    }
}
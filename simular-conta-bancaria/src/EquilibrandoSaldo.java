import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo atual da conta: ");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        System.out.println("Digite o valor a ser sacado: ");
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual += valorDeposito - valorRetirada;

     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo atualizado na conta: " + saldoAtual);
    }
}
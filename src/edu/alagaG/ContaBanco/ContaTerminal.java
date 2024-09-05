package edu.alagaG.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ContaCliente conta = pedirNovaConta();
        imprimirNovaConta(conta);
    }

    private static ContaCliente pedirNovaConta() {
        System.out.println("Para abrir a sua conta siga os seguintes passos:");
        System.out.print("Digite o Número da Conta (0000): ");
        int contaNumero = scan.nextInt();

        System.out.print("Digite o Identificador da Agência (000-0): ");
        String contaAgencia = scan.next();

        System.out.print("Digite o Nome do Cliente dono da conta: ");
        String contaClienteNome = scan.next() + scan.nextLine();

        System.out.print("Digite o Saldo da conta: R$");
        double contaSaldo = scan.nextDouble();

        return new ContaCliente(contaNumero, contaAgencia, contaClienteNome, contaSaldo);
    }

    private static void imprimirNovaConta(ContaCliente conta) {
        System.out.println("Olá "+conta.clienteNome+
                ", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+
                ", conta "+conta.numero+" e seu saldo "+conta.saldo+" já está disponível para saque");
    }

    private static class ContaCliente {

        public final int numero;
        public final String agencia;
        public final String clienteNome;
        public final double saldo;

        private ContaCliente(int numero, String agencia, String clienteNome, double saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.clienteNome = clienteNome;
            this.saldo = saldo;
        }

    }

}

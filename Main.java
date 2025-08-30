public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco DIO");

        Cliente ana = new Cliente("Ana Silva");
        Cliente joao = new Cliente("João Souza");
        banco.adicionarCliente(ana);
        banco.adicionarCliente(joao);

        IConta ccAna = new ContaCorrente(ana);
        IConta cpAna = new ContaPoupanca(ana);
        IConta ccJoao = new ContaCorrente(joao);

        ccAna.depositar(1000.00);
        ccAna.transferir(250.00, cpAna);
        ccAna.transferir(100.00, ccJoao);
        ccJoao.sacar(50.00);

        ccAna.imprimirExtrato();
        System.out.println();
        cpAna.imprimirExtrato();
        System.out.println();
        ccJoao.imprimirExtrato();
    }
}

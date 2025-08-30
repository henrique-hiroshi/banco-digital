public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) return;
        if (saldo < valor) throw new IllegalArgumentException("Saldo insuficiente");
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) return;
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número:  %d", numero));
        System.out.println(String.format("Saldo:   R$ %.2f", saldo));
    }
}
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();

    public Banco(String nome) { this.nome = nome; }

    public void adicionarCliente(Cliente c) { clientes.add(c); }
    public List<Cliente> getClientes() { return clientes; }
    public String getNome() { return nome; }
}
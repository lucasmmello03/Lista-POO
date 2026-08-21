package Ex05;

public class ItemPedido {

    private String nome;
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;

        if (!validarItem()) {
            throw new IllegalArgumentException("Item inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean validarItem() {
        return precoUnitario > 0 && quantidade > 0;
    }

    public double subTotal() {
        if (!validarItem())
            return 0.0;

        return precoUnitario * quantidade;
    }

}
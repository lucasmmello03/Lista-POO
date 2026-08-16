package Ex03;

public class EstoqueProduto {

    String nome;
    int qtd;

     
    public EstoqueProduto (String nome, int qtd) {

        this.nome = nome;
        this.qtd = qtd;

    }

    public boolean entrada (int quantidade) {

        if (quantidade <= 0) {
            return false;
        }

        qtd += quantidade;
        return true;

    }

    public boolean saida (int quantidade) {

        if (quantidade <= 0) {
            return false;
        }

        if (quantidade > qtd) {
            return false;
        }

        qtd -= quantidade;

        return true;
    }

    public int quantidadeAtual() {
        return qtd;
    }

    public String nome() {
        return nome;
    }

}

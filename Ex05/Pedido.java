package Ex05;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public int quantidadeDeItens() {
        return itens.size();
    }

    public double total() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.subTotal();
        }

        return total;

    }

}
package Ex01;

public class CofreDigital {

    /*
     * Não usar System.out.println() dentro das classes (classes não fazem UI).
     * Validar entradas conforme regras (o objeto mantém consistência).
     * Métodos que falham devem ignorar a ação ou retornar boolean (quando
     * indicado).
     * A implementação deve permitir que o Main rode sem alterações.
     */

    private int saldo = 0;

    public int saldo() {
        return saldo;
    }

    public boolean depositar(int valor) {

        if (valor <= 0)
            return false;

        saldo += valor;

        return true;

    }

    public boolean sacar(int valor) {

        if (valor <= 0)
            return false;

        if (saldo < valor)
            return false;

        saldo -= valor;

        return true;

    }

}

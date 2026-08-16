package Ex01;

public class teste {
    public static void main(String[] args) {
        CofreDigital cofre = new CofreDigital();

        cofre.depositar(100);
        System.out.println("Saldo esperado = 100 | Saldo atual = " + cofre.saldo());

        boolean ok1 = cofre.sacar(30);
        boolean ok2 = cofre.sacar(500); // deve falhar
        System.out.println("Saque 30 ok? " + ok1 + " | Saque 500 ok? " + ok2);

        System.out.println("Saldo esperado = 70 | Saldo atual = " + cofre.saldo());

    }
    
}

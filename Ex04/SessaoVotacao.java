package Ex04;

public class SessaoVotacao {

    private int votosSim = 0;
    private int votosNao = 0;
    public boolean statusSessao = false;

    public void abrir() {
        statusSessao = true;
    }

    public void fechar() {
        statusSessao = false;
    }

    public boolean votarSim() {
        if(statusSessao == true) {
            votosSim++;
            return true;
        }

        return false;
    }

    public boolean votarNao() {
        if (statusSessao == true) {
            votosNao++;
            return true;
        }
        return false;
    }

    public int sim() {
        return votosSim;
    }

    public int nao() {
        return votosNao;
    }

    public int total() {
        int total = votosSim + votosNao;
        return total;
    }

    public boolean estaAberta() {
        if(statusSessao == true) {
            return true;
        }

        return false;
    }

}

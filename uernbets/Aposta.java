package uernbets;

public class Aposta {
    double valor;
    Resultado bet;
    Evento fase;

    Aposta(Evento fase, Resultado bet, int valor) {
        this.valor = valor;
        this.bet = bet;
        this.fase = fase;
    }

    double getvalor() {
        return valor;
    }

    Evento getfase() {
        return fase;
    }

    public double calculaLucro(Evento fase) {
        double lucro = 0.0;
        if(fase.getResultado() == Resultado.EMPATE) {
            double valorComOdd = valor * fase.getMultEMPATE();
            lucro = valor - valorComOdd;
            return lucro;
        }
        if(fase.getResultado() == Resultado.TIME1) {
            double valorComOdd = valor * fase.getMultTIME1();
            lucro = valor - valorComOdd;
            return lucro;
        }
        else {
            double valorComOdd = valor * fase.getMultTIME2();
            lucro = valor - valorComOdd;
            return lucro;
        }
    }

    public Resultado getResultado() {
        return bet;
    }

}
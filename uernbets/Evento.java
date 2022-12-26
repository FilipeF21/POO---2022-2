package uernbets;

public class Evento {
    String fase, TIME1, TIME2;
    double odd1, odd2, EMPATE;

    Evento(String fase, String TIME1, String TIME2, double odd1, double EMPATE, double odd2) {
        this.fase = fase;
        this.TIME1 = TIME1;
        this.TIME2 = TIME2;
         
        this.odd1 = odd1;
        this.odd2 = odd2;
        this.EMPATE = EMPATE;
    }

    Resultado bet;

    Resultado getResultado() {
        return bet;
    }

    void setResultado(Resultado EMPATE) {
        this.bet = EMPATE;
    }

    double getMultEMPATE() {
        return EMPATE;
    }

    void setMultEmpate(double EMPATE) {
        this.EMPATE = EMPATE;
    }

    double getMultTIME1() {
        return odd1;
    }

    void setMultTIME1(double odd1) {
        this.odd1 = odd1;
    }

    double getMultTIME2() {
        return odd2;
    }

    void setMultTIME2(double odd2) {
        this.odd2 = odd2;
    }
}
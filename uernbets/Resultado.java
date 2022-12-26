package uernbets;

public class Resultado {
    public static Resultado TIME1;
    public static Resultado EMPATE;
    public static Resultado TIME2;
    String bet;

    Resultado(String bet) {
        this.bet = bet;
    }

    String getEMPATE() {
        return bet;
    }
}

import utils.List;

public class Scanner {
    private Token aktuellesToken;
    private List<Token> tokenliste;
    private boolean fehler;
    private String eingabe;
    public Scanner() {
        fehler = true;
        eingabe ="";
        aktuellesToken = new Token();
        tokenliste= new List<Token>();
    }
    public void scanne() {
    }

    private void ausgabe(boolean pFehler){

    }

    public utils.List<Token> getTokenliste () {

    }
}
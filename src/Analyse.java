import utils.List;

import java.util.Scanner;

public class Analyse {

    private String eingabe;
    private Parser parser;
    private Scanner scanner;
    private List<Token> tokenliste;

    public Analyse(String pEingabe){
        eingabe = pEingabe;
        parser = new Parser();
        tokenliste = new List<Token>();
        scanner = new Scanner(pEingabe, tokenliste);
    }
    public void analysiere(){
        scanner.scanne();
        if(tokenliste.hasAccess()){

        }

    }
}
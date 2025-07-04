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
        scanner = new Scanner();
        tokenliste = new List<Token>();
    }
      public void analysiere(){

      }
}
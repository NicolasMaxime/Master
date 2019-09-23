package model;

import java.util.Observable;

public class Model extends Observable {
    private Nombre res;
    private Nombre valeur;
    private OperationEntiere operation;
    public static final int PLUS = -100;
    public static final int MINUS = -200;
    public static final int EQUAL = -400;

    public Model(){
        res = new NombreEntier(0);
        valeur = new NombreEntier(0);
        operation = null;
    }

    public void addDigit(int digit){
        valeur.addDigit(digit);
        update();
    }

    public void setAction(int digit) {
        if (digit == EQUAL) {
            operation.setDroit(new NombreEntier(valeur.calculer()));
            res.setValue(operation.calculer());
            calculer();
            valeur = new NombreEntier(0);
        }
        else if (digit == PLUS){
            res = valeur;
            valeur.setValue(0);
            operation = new Addition(new NombreEntier(valeur.calculer()), null);
        }
        else if (digit == MINUS){
            res = valeur;
            valeur.setValue(0);
            operation = new Soustraction(new NombreEntier(valeur.calculer()), null);
        }
        update();
    }


    public void calculer(){
        System.out.println("Resultat = " + operation.calculer());
    }

    public void update(){
        setChanged();
        notifyObservers();
    }

    public String stringExampleView() {
        StringBuilder sb = new StringBuilder("");
        sb.append(valeur.toString());
        return sb.toString();
    }
}

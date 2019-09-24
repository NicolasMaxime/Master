package model;

import model.operation.*;
import view.ExampleView;

import java.util.Observable;

public class Modele extends Observable {
    private Nombre res;
    private Nombre valeur;
    private OperationEntiere operation;

    public Modele(){
        res = new NombreEntier(0);
        valeur = new NombreEntier(0);
        operation = null;
    }

    public void addDigit(int digit){
        valeur.addDigit(digit);
        update();
    }

    public void setAction(int digit) {
        if (!valeur.isNull())
            res = valeur;
        if (digit == ExampleView.EQUAL) {
            operation.setDroit(new NombreEntier(valeur));
            res = new NombreEntier(operation.calculer());
            operation = null;
        }
        else {
            if (operation != null){
                setAction(ExampleView.EQUAL);
            }
            switch (digit){
                case ExampleView.PLUS:
                    operation = new Addition(new NombreEntier(res), null);
                break;
                case ExampleView.MINUS:
                    operation = new Soustraction(new NombreEntier(res), null);
                break;
                case ExampleView.MULT:
                    operation = new Multiplication(new NombreEntier(res), null);
                break;
                default:
                    operation = new Division(new NombreEntier(res), null);
            }
            res = valeur;
        }
        valeur.setValue(0);
        update();
    }


    public void printRes(){
        System.out.println("Resultat = " + operation.calculer());
    }

    private void update(){
        setChanged();
        notifyObservers();
    }

    public String stringExampleView() {
        StringBuilder sb = new StringBuilder("");
        if (operation == null){
            if (valeur.isNull())
                sb.append(res);
            else
                sb.append(valeur);
        }
        else{
            sb.append(operation).append(valeur);
        }
        return sb.toString();
    }
}

package model;

import java.util.Observable;

public class Model extends Observable {
    private int res;
    private int value;
    private int operande;
    public static final int PLUS = -100;
    public static final int MINUS = -200;
    public static final int EQUAL = -400;

    public Model(){
        res = 0;
        value = 0;
        operande = 0;
    }

    public void addition(){
        res = res + value;
    }

    public void soustraction(){
        res = res - value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addDigit(int digit){
        value = value * 10 + digit;
        update();
    }

    public void setOperande(int digit) {
        if (digit == EQUAL) {
            calculer();
            this.operande = 0;
            value = 0;
        }
        else {
            makeRes();
            this.operande = digit;
        }
        update();
    }

    private void makeRes() {
        this.res = this.value;
        this.value = 0;
    }

    public void calculer(){
        if (operande == PLUS){
            addition();
        }
        else if (operande == MINUS){
            soustraction();
        }
        value = 0;
        System.out.println("Resultat = " + getRes());
    }

    public int getRes(){
        return res;
    }

    public int getValue(){
        return value;
    }

    public String getOperande(){
        String ret = "";
        if (operande == PLUS)
            ret = "+";
        else if (operande == MINUS)
            ret = "-";
        else if (operande == EQUAL)
            return "=";
        return ret;
    }

    public void update(){
        setChanged();
        notifyObservers();
    }

    public String stringExampleView() {
        StringBuilder sb = new StringBuilder("");
        if (operande == EQUAL) {
            sb.append(getRes());
        }
        else{
            sb.append(getOperande()).append(" ").append(getValue());
        }
        return sb.toString();
    }
}

package model;

public class Soustraction extends OperationEntiere {
    public Soustraction(Nombre gauche, Nombre droit){
        super(gauche, droit);
    }

    @Override
    public String getSymbole() {
        return "-";
    }

    @Override
    public int calculer() {
        return (int)gauche.calculer() - (int)droit.calculer();
    }
}

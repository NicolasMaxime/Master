package model.operation;

public class Addition extends OperationEntiere {
    public Addition(Nombre gauche, Nombre droit){
        super(gauche, droit);
    }

    @Override
    public String getSymbole() {
        return "+";
    }

    @Override
    public int calculer() {
        return ((int)gauche.calculer() + (int)droit.calculer());
    }
}

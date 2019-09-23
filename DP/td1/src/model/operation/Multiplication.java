package model.operation;

public class Multiplication extends OperationEntiere {
    public Multiplication(Nombre gauche, Nombre droit) {
        super(gauche, droit);
    }

    @Override
    public String getSymbole() {
        return "x";
    }

    @Override
    public int calculer() {
        return (int)gauche.calculer() * (int)droit.calculer();
    }
}

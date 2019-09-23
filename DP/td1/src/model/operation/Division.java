package model;

public class Division extends OperationEntiere {
    public Division(Nombre gauche, Nombre droit) {
        super(gauche, droit);
    }

    @Override
    public String getSymbole() {
        return "/";
    }

    @Override
    public int calculer() {
        int ret = 0;
        int droitCalc = (int)droit.calculer();
        if (droitCalc != 0)
            ret = (int)gauche.calculer() / droitCalc;
        return ret;
    }
}

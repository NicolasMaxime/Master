package model;

public abstract class OperationEntiere {
    protected Nombre gauche;
    protected Nombre droit;

    public OperationEntiere(Nombre gauche, Nombre droit){
        this.gauche = gauche;
        this.droit = droit;
    }

    public void setGauche(Nombre gauche) {
        this.gauche = gauche;
    }

    public void setDroit(Nombre droit){
        this.droit = droit;
    }

    public abstract String getSymbole();
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        if (gauche != null)
            sb.append(gauche);
        sb.append(" ").append(getSymbole()).append(" ");
        return sb.toString();
    }
    public abstract int calculer();
}

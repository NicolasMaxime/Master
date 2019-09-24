package humain;

import matiere.Matiere;

public class Enseignant extends Humain {
    private double salaireAnnuel;
    private int heureTravail;
    private boolean intervenant;
    private Matiere matiere;
    public final static int HONORAIRE = 30;
    
    public Enseignant(String nom, String prenom, String matiere, int heure, boolean estInterv){
        super(nom, prenom);
        this.intervenant = estInterv;
        this.matiere = new Matiere(matiere);
        this.matiere.addEnseignant(this);
        setHeureTravail(heure);
    }

    private void setHeureTravail(int h){
        heureTravail = h;
        calculerSalaireAnnuel();
    }

    public Matiere getMatiere() {
        return matiere;
    }

    private void calculerSalaireAnnuel(){
        double res = 0;
        if (!intervenant){
            res = 2000 * 12;
            if (heureTravail > 200){
                res = (heureTravail - 200) * HONORAIRE + res;
            }
        }
        else {
            res = HONORAIRE * heureTravail;
            if (heureTravail > 200){
                res = (heureTravail - 200) * HONORAIRE + res;
            }
        }
        this.salaireAnnuel = res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(prenom).append(" ").append(nom).append(" ");
        sb.append("en ").append(matiere.getNom()).append(", salaire = ").append(salaireAnnuel);
        return sb.toString();
    }
}

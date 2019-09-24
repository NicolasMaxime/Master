package matiere;

import humain.Enseignant;

import java.util.ArrayList;

public class Matiere {
    protected String nom;
    private ArrayList<Enseignant> enseignants;

    public Matiere(String nom){
        this.nom = nom;
        enseignants = null;
    }

    public void addEnseignant(Enseignant ens){
        if (enseignants == null)
            enseignants = new ArrayList<Enseignant>();
        this.enseignants.add(ens);
    }

    public String getNom(){
        return nom;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append("Les intervenants en ").append(nom).append(" :\n");
        for (Enseignant ens : enseignants){
            sb.append("\t").append(ens).append("\n");
        }
        return sb.toString();
    }
}

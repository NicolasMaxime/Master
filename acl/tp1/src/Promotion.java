import humain.Enseignant;
import humain.Etudiant;
import matiere.Matiere;

import java.util.ArrayList;

public class Promotion {
    private String nom;
    private ArrayList<Etudiant> etudiants;
    private ArrayList<Enseignant> enseignants;
    private ArrayList<Matiere> matieres;

    public Promotion(String nom) {
        this.nom = nom;
        etudiants = null;
        enseignants = null;
        matieres = null;
    }

    public void addEtudiant(Etudiant et){
        if (etudiants == null)
            etudiants = new ArrayList<Etudiant>();
        etudiants.add(et);
    }

    public void addEnseignant(Enseignant ens) {
        if (enseignants == null)
            enseignants = new ArrayList<Enseignant>();
        enseignants.add(ens);
        if (matieres == null)
            matieres = new ArrayList<Matiere>();
        if (!matieres.contains(ens.getMatiere()))
            matieres.add(ens.getMatiere());
    }

    public String ensAllMatieres(){
        StringBuilder sb = new StringBuilder("");
        sb.append(nom).append(":\n");
        if (matieres != null) {
            for (Matiere mat : matieres)
                sb.append(mat);
        }
        return sb.toString();
    }

    public String ensMatiere(String nom){
        boolean find = false;
        StringBuilder sb = new StringBuilder("");
        if (matieres != null) {
            for (Matiere mat : matieres) {
                if (mat.getNom().equals(nom)) {
                    sb.append("Matiere : ").append(nom).append(" :\n");
                    sb.append(mat);
                    find = true;
                }
            }
        }
        if (!find){
            sb.append("Matiere \"").append(nom).append("\"non trouvée");
        }
        return sb.toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append(nom).append(":\n");
        sb.append("Les etudiants :\n");
        for (Etudiant et : etudiants){
            sb.append("\t").append(et).append("\n");
        }
        sb.append("Les intervanants :\n");
        for (Enseignant ens : enseignants){
            sb.append("\t").append(ens).append("\n");
        }
        return sb.toString();
    }

}

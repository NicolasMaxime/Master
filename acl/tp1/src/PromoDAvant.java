import humain.Enseignant;
import humain.Etudiant;

public class PromoDAvant {
    private Promotion promotion;

    public PromoDAvant(){
        promotion = new Promotion("Master 1 2012-2013");
        promotion.addEtudiant(new Etudiant("Dubois", "Thierry", 12, 23));
        promotion.addEtudiant(new Etudiant("Martin", "Claire", 25, 25));
        promotion.addEnseignant(new Enseignant("Levy", "Jean", "Math", 200, false));
        promotion.addEnseignant(new Enseignant("Bedo", "Martine", "Info", 202, true));

        System.out.println(promotion.ensAllMatieres());
        System.out.println("===============");
        System.out.println(promotion.ensMatiere("Info"));
    }

    public static void main(String[] args) {
        PromoDAvant pa = new PromoDAvant();
    }
}

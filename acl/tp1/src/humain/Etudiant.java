package humain;

public class Etudiant extends Humain {
    private int age;
    private int noEt;

    public Etudiant(String nom, String prenom, int noEt, int age){
        super(nom, prenom);
        this.age = age;
        this.noEt = noEt; // a changer;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setNoEt(int noEt) {
        this.noEt = noEt;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append("Etudiant ").append(prenom).append(" ");
        sb.append(nom).append(" ").append("(noEt=").append(noEt);
        sb.append(") ").append(age).append(" ans");
        return sb.toString();
    }
}

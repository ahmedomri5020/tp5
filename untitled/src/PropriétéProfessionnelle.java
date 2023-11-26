public class PropriétéProfessionnelle extends Propriété{
    int nbEmployés;
    boolean estEtatique;
    public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, responsable, adresse, surface);
        this.nbEmployés = nbEmployes;
        this.estEtatique = estEtatique;
    }
    @Override
    double calculImpot() {
        if(estEtatique){
            return 0;
        }
        else{
            return this.surface*1+nbEmployés*30;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre d'employés: " + nbEmployés + ", Est étatique: " + estEtatique;
    }
}

public class
PropriétéPrivée extends Propriété{
    int nbPiéces;
    PropriétéPrivée(int id, Personne responsable, String adresse, double surface, int nbPieces) {
        super(id, responsable, adresse, surface);
        this.nbPiéces = nbPieces;
    }
    PropriétéPrivée(){}
    @Override
    double calculImpot() {
        return this.surface*0.5+10*nbPiéces;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de pièces: " + nbPiéces;
    }
}

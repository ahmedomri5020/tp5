public class Appartement extends PropriétéPrivée{
    int numEtage;
Appartement(int Id,Personne responsable,String adresse,double surface,int nbPiéces,int numEtage){
super(Id,responsable,adresse,surface,nbPiéces);
this.numEtage=numEtage;
}

    @Override
    public String toString() {
        return super.toString() + ", Numéro d'étage: " + numEtage;
    }
}

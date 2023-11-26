public class Villa extends PropriétéPrivée{
    boolean avecPiscine;
    Villa(int id, Personne responsable, String adresse, double surface,int nbpiéces, boolean avecPiscine) {
        super(id,responsable,adresse,surface,nbpiéces);
        this.avecPiscine=avecPiscine;
}

    @Override
    public String toString() {
        return super.toString() + ", Avec piscine: " + avecPiscine;
    }

    @Override
    double calculImpot() {
        if(avecPiscine){
        return super.calculImpot()+200;}
        else {
            return super.calculImpot();
        }

    }
}

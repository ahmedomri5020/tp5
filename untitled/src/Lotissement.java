public class Lotissement implements GestionPropriete {
    protected Propriété tabProb[];
    protected int nombre=0;
    Lotissement(int capacité){
        if(capacité<=MAX_PROPRIETES)
        tabProb=new Propriété[capacité];
    }
    Propriété getpropriétéByIndice (int i){
        if(i>0 && i<tabProb.length){
            return tabProb[i];
        }
        else{
            return null;
        }
    }
    public int getNbPieces() {
        int totalPieces = 0;
        for (Propriété p : tabProb) {
            if (p instanceof PropriétéPrivée) {
                totalPieces+=((PropriétéPrivée) p).nbPiéces;
            }
        }
        return totalPieces;
    }
    public void afficherPropriétés() {
        for (Propriété p : tabProb) {
            if (p != null) {
                System.out.println(p.toString());
                System.out.println(p.calculImpot());
            }
            //else break;
        }
    }
    void moins(Propriété tabProb[]){
    double moins=0;
    int indice =0;
        for(int i=0;i<tabProb.length;i++){
        if(tabProb[i] instanceof PropriétéPrivée){
            if(tabProb[i].calculImpot()<moins){
                moins=tabProb[i].calculImpot();
                indice=i;
            }
        }
        System.out.println(tabProb[indice]);
    }}

    @Override
    public boolean ajouter(Propriété p) {
        if (nombre < tabProb.length) {
            tabProb[nombre++] = p;
            return true;
        }
        return false;
    }

    @Override
    public boolean supprimer(Propriété p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProb[i] != null && tabProb[i].equals(p)) {
               // for()
                tabProb[i] = null;
                nombre--;
                return true;
            }
        }
        return false;
    }
}

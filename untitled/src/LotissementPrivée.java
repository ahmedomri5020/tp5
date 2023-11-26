public class LotissementPrivée extends Lotissement {

    LotissementPrivée(int capacité){
        super(capacité);
    }

    public boolean ajouter(Propriété p){
    return ajouter(p);
    }
    public PropriétéPrivée getpropriétéByIndice (int i){
        return getpropriétéByIndice(i);
    }
    public int  getnbPiéces  (){
    return getNbPieces();
    }

}

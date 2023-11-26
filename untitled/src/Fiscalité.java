public class Fiscalité {
    public static void main(String[] args) {
        Personne p1=new Personne(125893,"Omri","Ahmed");
        Personne p2=new Personne(178963,"Welfeki","Amine");
        Personne p3=new Personne(123854,"Belgasmi","Ismail");
        Lotissement tabProb=new Lotissement(10);
        PropriétéPrivée pp=new PropriétéPrivée(1,p1,"Corniche",350,4);
        Villa v=new Villa(2,p2,"Dar chaabane",400,6,true);
        Appartement ap=new Appartement(3,p2,"Hammamet",1200,8,3);
        PropriétéProfessionnelle pro=new PropriétéProfessionnelle(4,p3,"Korba",1000,50,true);
        PropriétéProfessionnelle pro2=new PropriétéProfessionnelle(5,p1,"Bir Bouragba",2500,400,false);
        tabProb.ajouter(pp);
        tabProb.ajouter(v);
        tabProb.ajouter(ap);
        tabProb.ajouter(pro);
        tabProb.ajouter(pro2);
        tabProb.afficherPropriétés();
        System.out.println("NB piéces : " +tabProb.getNbPieces());
        tabProb.moins(tabProb.tabProb);
        tabProb.supprimer(ap);
        System.out.println("------------------------------------");
        for(int i=0;i<tabProb.tabProb.length;i++){
            System.out.println(tabProb.tabProb[i]);
            System.out.println(tabProb.tabProb[i].calculImpot());
        }
        Lotissement lt= new LotissementPrivée(10);


    }
    }

abstract public class Propriété {
    int Id;
    Personne responsable;
    String adresse;
    double surface;

    Propriété(int id,Personne responsable,String adresse,Double surface){
        this.Id=id;
        this.responsable=responsable;
        this.adresse=adresse;
        this.surface=surface;
    }
    Propriété(){}

    @Override
    public String toString() {
        return "Propriété{" +
                "Id=" + Id +
                ", responsable=" + responsable +
                ", adresse='" + adresse + '\'' +
                ", surface=" + surface +
                '}';
    }
    abstract double calculImpot();
}

package tp;
public  class Cuisiniere extends Appareil implements inerface{
    
    private int Nbrfoyer;
    public Cuisiniere (){
        this.Nbrfoyer=0;
}
    public Cuisiniere (int Nbrfoyer){
        this.Nbrfoyer=Nbrfoyer;
}

     public int getNbrfoyer(){
            return this.Nbrfoyer;
        }
    public void setNbrfoyer( int Nbrfoyer){
            this.Nbrfoyer=Nbrfoyer;
        }

    public void cuisiner (){
        System.out.println("Je cuisine");
    }
}


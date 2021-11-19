package tp;

public  class Appareil implements inerface {
    
    private String Nom ;
    private int prix;
    public Appareil (){
        this.Nom="";
        this.prix=0;
      
    }
    public Appareil (String Nom, int prix){
        this.Nom=Nom;
        this.prix=prix;
      
    }

    public String getNom(){
            return this.Nom;
        }
    public void setNom( String Nom){
             this.Nom=Nom;
        }
         public int getprix(){
            return this.prix;
        }
        public void setprix(int prix){
             this.prix=prix;
        }
    public void Aide (){
        System.out.println("J'aide les gens en facilitant l'accomplissement de leur quotidienne ");
    }

}




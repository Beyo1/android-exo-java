package tp;
public abstract class Frigo extends Appareil implements inerface {
    
    private String Style;
    private int puissance;
   
    public Frigo (String Style, int puissance){
        this.Style=Style;
        this.puissance=puissance;
}

    public String getStyle(){
            return this.Style;
        }
    public void setStyle( String Style){
            this.Style=Style;
        }
    public int getpuissance(){
            return this.puissance;
        }
    public void setpuissance( int puissance){
            this.puissance=puissance;
        }
    
    public void conserver(){
        System.out.println ("Je conserve les aliments");
    }
}
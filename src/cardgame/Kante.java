
package cardgame;


public class Kante extends Footballer{
    int powerPoint;
    boolean kullanildiMi;
    
     public Kante(){
        
    }
     public Kante( String footballerName,String Tip,int powerPoint){
         super(footballerName,Tip);
     
     }
     @Override
     public int powerPointGoster(){
         return this.powerPoint ;
     }

    public void setPowerPoint(int powerPoint) {
        this.powerPoint = powerPoint;
    }

    public int getPowerPoint() {
        return powerPoint;
    }
    
}

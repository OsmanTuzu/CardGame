
package cardgame;


public class Muslera extends Footballer{
    int powerPoint;
    
     boolean kullanildiMi;
    
     public Muslera(){
        
    }
     public Muslera( String footballerName,String Tip,int powerPoint){
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

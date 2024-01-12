
package cardgame;


public class Mbappe extends Footballer {
    int powerPoint;
  boolean kullanildiMi;
    
     public Mbappe(){
        
    }
     public Mbappe( String footballerName,String Tip,int powerPoint){
         super(footballerName,Tip);
     
     }
     @Override
     public int powerPointGoster(){
         return this.powerPoint ;
     }

    public int getPowerPoint() {
        return powerPoint;
    }

    public void setPowerPoint(int powerPoint) {
        this.powerPoint = powerPoint;
    }
    
}

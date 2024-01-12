
package cardgame;


public class Icardi extends Footballer{
    int powerPoint;
 boolean kullanildiMi;
    
     public Icardi(){
        
    }
     public Icardi( String footballerName,String Tip,int powerPoint){
         super(footballerName,Tip);
     
     }
     @Override
     public int powerPointGoster(){
          // System.out.println("zubat hasar puani "+hasarPuani);
         return this.powerPoint ;
       
     }
    
    public void setPowerPoint(int powerPoint) {
        this.powerPoint = powerPoint;
    }

    public int getPowerPoint() {
        return powerPoint;
    }
    
    
}

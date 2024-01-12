
package cardgame;

class Messi extends Footballer{
     int powerPoint;
    boolean kullanildiMi;
    
     public Messi(){
        
    }
     public Messi( String footballerName,String Tip,int powerPoint){
         super(footballerName,Tip);
     
     }

    @Override
     public int powerPointGoster(){
        // System.out.println("Bulbasaur "+this.hasarPuani );
         return this.powerPoint ;
     }

    public void setPowerPoint(int powerPoint) {
        this.powerPoint = powerPoint;
    }

    public int getPowerPoint() {
        return powerPoint;
    }
    
    
    
}

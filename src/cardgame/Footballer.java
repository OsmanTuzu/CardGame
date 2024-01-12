package cardgame;



public class Footballer {
    private  int footballerID;
    private   String footballerName;
    private  String Tip;
    public Footballer(){
        
    }
     public Footballer(String footballerName,String Tip ){
         
        this.footballerName = footballerName;
        this.Tip = Tip;

    }
     public int powerPointGoster(){
         return 0 ;
     }


    public void setFootballerID(int footballerID) {
        this.footballerID = footballerID;
    }

    public void setFootballerName(String footballerName) {
        this.footballerName = footballerName;
    }

    public void setTip(String Tip) {
        this.Tip = Tip;
    }


    public int getFootballerID() {
        return footballerID;
    }

    public String getFootballerName() {
        return footballerName;
    }

    public String getTip() {
        return Tip;
    }
    
    
}

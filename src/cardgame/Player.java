package cardgame;


public class Player {
    int oyuncuID;
    String oyuncuAdi;
    int skor;
    int [] kartListesi=new int[5];
    public Player(){
        
    }
    
      public Player( int oyuncuID,String oyuncuAdi,int  skor){
          this.oyuncuAdi=oyuncuAdi;
          this.oyuncuID=oyuncuID;
          this.skor=skor;

          
        
    }
    public void SkorGoster (){
    
    }
    public void kartSecim(){
        
        
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }
    
    
}

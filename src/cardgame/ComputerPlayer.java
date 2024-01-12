
package cardgame;

class ComputerPlayer extends Player {
    int [] kartListesi=new int[5];
    
    public ComputerPlayer(){
        
    }
       public ComputerPlayer( int oyuncuID,String oyuncuAdi,int skor){
           super(oyuncuID, oyuncuAdi, skor);
           
        
    }
    
    
    
    public void setKartListesi(int[] kartListesi) {
        this.kartListesi = kartListesi;
    }

    public int[] getKartListesi() {
        return kartListesi;
    }
     @Override
     public void kartSecim(){
        
    }
    
    
}

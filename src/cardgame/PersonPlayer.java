
package cardgame;


public class PersonPlayer extends Player {
    int[] kartListesi=new int[5];
    public PersonPlayer(){
        
    }

    PersonPlayer(int i, String osman_, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); 
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

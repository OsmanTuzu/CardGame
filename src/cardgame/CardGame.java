
package cardgame;
import java.util.Random;
import java.util.Scanner;
public class CardGame {

    
    public static void main(String[] args) {
        int secim = 0;
        System.out.println("SİZ Mİ OYNAYACAKSINIZ  1");
        System.out.println("BİLGİSAYARLAR MI OYNASIN 2");
        
        Ronaldo ronaldo = new Ronaldo();
        ronaldo.setFootballerID(1);
        ronaldo.setFootballerName("ronaldo");
        ronaldo.setTip("Sumptuous");
        ronaldo.powerPoint = 90;
        
        Messi messi = new Messi();
        messi.setFootballerID(2);
        messi.setFootballerName("messi");
        messi.setTip("Sumptuous");
        messi.powerPoint = 91;
        
        Mbappe mbappe = new Mbappe();
        mbappe.setFootballerID(3);
        mbappe.setFootballerName("mbappe");
        mbappe.setTip("Sumptuous");
        mbappe.powerPoint = 94;
        
        Muslera muslera = new Muslera();
        muslera.setFootballerID(4);
        muslera.setTip("Legendary");
        muslera.powerPoint = 86;
        
        Icardi icardi = new Icardi();
        icardi.setFootballerID(5);
        icardi.setFootballerName("icardi");
        icardi.setTip("Legendary");
        icardi.powerPoint = 87;
        
        Neymar neymar = new Neymar();
        neymar.setFootballerID(6);
        neymar.setFootballerName("neymar");
        neymar.setTip("Legendary");
        neymar.powerPoint = 89;
        
        Oliveira oliveira = new Oliveira();
        oliveira.setFootballerID(7);
        oliveira.setFootballerName("oliveira");
        oliveira.setTip("Legendary");
        oliveira.powerPoint = 80;
        
        Ibrahimovic ibrahimovic = new Ibrahimovic();
        ibrahimovic.setFootballerID(8);
        ibrahimovic.setFootballerName("ibrahimovic");
        ibrahimovic.setTip("Epic");
        ibrahimovic.powerPoint = 84;
        
        Fernandes fernandes = new Fernandes();
        fernandes.setFootballerID(9);
        fernandes.setFootballerName("fernandes");
        fernandes.setTip("Epic");
        fernandes.powerPoint = 93;
        
        
        Kante kante = new Kante();
        kante.setFootballerID(10);
        kante.setFootballerName("kante");
        kante.setTip("Epic");
        kante.powerPoint = 96;
        
        Random rnd = new Random();
        int RastgeleSayi;
        RastgeleSayi = (int) (Math.random()* 10)+1;
        int[] sayilar = new int[10];
        sayilar[0] = RastgeleSayi;
        for (int i = 1; i < sayilar.length; i++) {
            RastgeleSayi = (int) (Math.random()* 10)+1;
            for (int j = 0; j < i; j++  )
{
if (sayilar[j] == RastgeleSayi) {
                    i--;
                    break;
                } else {
                    sayilar[i] = RastgeleSayi;
                }
            }
        }
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);            
        }
        Scanner input = new Scanner(System.in);
        secim = input.nextInt();

        if (secim == 1) {
           // BilgisayarOyuncusu pcoyuncusu=

        }
        
        
        
    }
    
}

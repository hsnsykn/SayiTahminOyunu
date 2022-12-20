package oyun;
import javax.swing.JOptionPane;

/**
 *
 * @author soyka
 */
public class sayıtahminoyunu {
    public static void main(String[] args) {
      boolean oyunDevam = true;
      int skor = 0; // tüm oyun genel puanı
      int rs,tur = 1;// rastgele sayı ve tur sayısı
      while(oyunDevam) { // oyun genel döngüsü
          rs = (int)(Math.random()*100)+1 ;
          System.out.println("Rastgele Sayı 0 " + rs);
          int hak =10,puan = 0;
          for (;hak <=10 ;hak--){
              String s = JOptionPane.showInputDialog(hak + "hakkınız var !\nSayıyı tahmin edin");
              String sayı = null;
          int tahmin = Integer.parseInt(sayı);
          if (tahmin == rs){
              puan = hak*10 ;
               JOptionPane.showMessageDialog(null, " !!!Bravo !!! \n Puanınız = " + puan);
               break;// bildiği için döngüden çıkartıyoruz
          }else if (tahmin > rs){
           JOptionPane.showMessageDialog(null, "Bilemedin.Büyük tahmin ettin!");
           
          }else{
            JOptionPane.showMessageDialog(null,"Bilemedin.Küçük tahmin ettin") ;  
          }
          }//  tur döngüsü bitti
          int cevap = JOptionPane.showConfirmDialog(null, "TUR PUANINIZ = "+ puan +"\nTekrar oynamak istermisiniz");
          if (cevap != 0)  oyunDevam = false; //while döngüsü bitti
      skor += puan;
      }
      JOptionPane.showMessageDialog(null, " !!! Oyun Bitti !!!");

      
          }
        }

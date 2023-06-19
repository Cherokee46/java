/*
ex:4b_Aşağıdaki sınıf öntanımlı (default) kurucu yerine bir aşkın (overload) kurucu tanımlamaktadır.  
main() içinde aynı kurucu metodu ile iki farklı nesne yaratılmaktadır. 
Bunlardan birisinin yarıçapı 7 ötekinin 9 dur. 
Her ikisine de ana bellekte birbirlerinden farklı birer yer ayrılır.
*/

public class Daire4b 
{
       static int yarıçap;
       static double çevre;
       static double alan;
       final static double pi = 3.14;
  
      // Kurucu metodunun tanımı
       public Daire4b( int r )
       {
          yarıçap = r ;
       };

       public static void main (String args[]) 
       {
 
         Daire4b d1 = new Daire4b(7);             //Birinci nesneyi yaratıyor
         d1.alan    = pi * yarıçap * yarıçap;
         d1.çevre   = 2 * pi * yarıçap;

         System.out.println ("ilk Dairenin Yarıçapi : " + d1.yarıçap);
         System.out.println ("ilk Dairenin Alanı    : " + d1.alan);
         System.out.println ("ilk Dairenin Çevresi  : " + d1.çevre);
         System.out.println();

         Daire4b d2 = new Daire4b(9);             //İkinci nesneyi yaratıyor
         d2.alan = pi * yarıçap * yarıçap;
         d2.çevre = 2 * pi * yarıçap;

         System.out.println ("ikinci Dairenin Yarıçapi : " + d1.yarıçap);
         System.out.println ("ikinci Dairenin Alanı    : " + d2.alan);
         System.out.println ("ikinci Dairenin Çevresi  : " + d2.çevre);
         System.out.println();

         System.out.println ("ilk Dairenin Yarıçapi : " + d1.yarıçap);
         System.out.println ("ilk Dairenin Alanı    : " + d1.alan);
         System.out.println ("ilk Dairenin Çevresi  : " + d1.çevre);
         System.out.println();
       }     
}



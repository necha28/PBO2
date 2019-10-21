/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author necha
 */
public class UjiBusPraktikum {
public static void main(String[] args) {
        TugasPraktikum1 bus = new TugasPraktikum1(250);
        bus.cetakpenumpang();
        
        //penambahan penumpang 
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
         bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambhan penumpang 
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahan penumpang
        System.out.println("\n");
        bus.getpenumpang(24);//password
        bus.cetakpenumpang();
        
        //penambahab penumpang
        System.out.println("\n");
        bus.getpenumpang(14);//password
        bus.cetakpenumpang();
        
        System.out.println("Rata-rata penumpang : " + bus.getAverge() + "kg.");
        System.out.println("Jumlah penumpang sekarang : " + bus.counter());
    }
}
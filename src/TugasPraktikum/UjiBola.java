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
public class UjiBola {
    public static void main(String[] args) {
        double jarijari = 14;
        TugasPraktikumBola Objekbola = new TugasPraktikumBola(7);
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaan();
        Objekbola.showVolume();
        System.out.println("\n");
        Objekbola.setjarijari(jarijari);
        Objekbola.showDiameter();
        Objekbola.showLuasPermukaan();
        Objekbola.showVolume();
    }
}
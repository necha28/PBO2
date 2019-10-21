/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.Latihan3;

import pbo2.Latihan3.EncapSiswa;

/**
 *
 * @author necha
 */
public class TestSiswa {
    public static void main(String[] args) {
        
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Necha");
        siswa.setAge(15);
        siswa.setAddress("Malang");
        
        System.out.println("Nama    :"+siswa.getName());
        System.out.println("Age     :"+siswa.getAge());
        System.out.println("Address :"+siswa.getAddress());
    }
}

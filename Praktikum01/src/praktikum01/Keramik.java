/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum01;

/**
 *
 * @author EfaSetiyani
 */
public class Keramik {
    //membuat atribut
     int ukuranP;
     int ukuranL;
     int hargaPerBox;
     int isiPerBox;
     
    //membuat method      
    double hitungLuasKeramik(int ukuranP, double ukuranL){
        double luas;
        luas = (ukuranP * ukuranL)/ 10000;
        System.out.println("Luas Keramik adalah " + luas + " meter persegi per pcs");
        return luas;    
    }

    double hitungKebutuhan(double luas, int isiPerbox){
        double jumlahBox;
        jumlahBox = (100/ luas) / isiPerBox;
        System.out.println("Kebutuhan keramik adalah " + Math.ceil(jumlahBox) + " box");
        return jumlahBox;
    }

    double hitungTotal(double jumlahBox, double hargaPerBox){
        double total;
        total = jumlahBox * hargaPerBox;
        System.out.println("Harga totalnya adalah " + Math.ceil(total) + " rupiah");
        return total;  
    }
}

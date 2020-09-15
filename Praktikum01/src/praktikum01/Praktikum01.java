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
public class Praktikum01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        /* membuat obyek */
        Keramik A = new Keramik ();
        A.ukuranP = 30;
        A.ukuranL = 30;
        A.isiPerBox = 10;
        A.hargaPerBox = 54000;
        A.hitungLuasKeramik(30,30);
        A.hitungKebutuhan(0.09, 10);
        A.hitungTotal(112, 54000);
        
        Keramik B = new Keramik ();
        B.ukuranP = 40;
        B.ukuranL = 40;
        B.isiPerBox = 5;
        B.hargaPerBox = 65000;
        B.hitungLuasKeramik(40,40);
        B.hitungKebutuhan(0.16, 5);
        B.hitungTotal(125, 65000);
      
        Keramik C = new Keramik ();
        C.ukuranP = 30;
        C.ukuranL = 40;
        C.isiPerBox = 8;
        C.hargaPerBox = 60000;
        C.hitungLuasKeramik(30, 40);
        C.hitungKebutuhan(0.12, 8);
        C.hitungTotal(105, 60000);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author user
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Induk Segitiga = new Induk();
        Anak PersegiPanjang = new Anak();
        
        Segitiga.hitung(20, 10);
        
        PersegiPanjang.hitung(20, 10);
        
    }
    
}

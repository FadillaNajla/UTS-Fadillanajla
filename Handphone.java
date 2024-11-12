/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsfadilla;

/**
 *
 * @author BELLA
 */
public class Handphone {
    String Merk;
    String Warna;
    int Tahun;
    
   public Handphone(String Merk, String Warna,int Tahun){
    this.Merk = Merk;
    this.Warna = Warna;
    this.Tahun = Tahun;
    }
   
   void tampilkanInformasiHandphone(){ 
    System.out.println("Merk Handphone: " + Merk);
    System.out.println("Warna Handphone: " + Warna);
    System.out.println("Tahun Terbit: " + Tahun);  
    }
}

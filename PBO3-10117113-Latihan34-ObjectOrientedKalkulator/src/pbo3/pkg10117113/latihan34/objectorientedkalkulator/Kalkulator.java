/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan34.objectorientedkalkulator;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program kalkulator
 * 
 */
public class Kalkulator {
    public double value1;
    public double value2;
   
    
    public double tambahBilangan(){ 
        return value1+value2;
    }
    public double kurangBiangan(){
        return value1-value2;
    }
    public double kaliBilangan(){
        return value1*value2;
    }
    public double bagiBilangan(){ 
        return value1/value2;
    }
    public double sisaBilangan(){
        return value1%value2;
    }
}

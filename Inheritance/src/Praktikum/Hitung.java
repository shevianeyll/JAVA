/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
public class Hitung {
    public static void main (String [] args){
        Identitas pegawai = new Identitas ();
        pegawai.intro ();
        
        Gaji karyawan = new Gaji();
        karyawan.nama ();
        karyawan.gender ();
        karyawan.jabatan();
        karyawan.gaji();
        karyawan.bonus();
    }
    }


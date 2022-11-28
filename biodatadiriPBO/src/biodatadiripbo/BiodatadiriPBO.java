/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatadiripbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class BiodatadiriPBO {

    public static void main(String[] args) {
        String nama, tempatlahir, jeniskelamin, alamatdimalang, mottohidup;
        int nis, tanggal_lahir;
        Scanner biodata = new Scanner(System.in);

        System.out.println("Masukkan data data anda");
        System.out.print("Nama: ");
        nama = biodata.nextLine();

        System.out.print("Nis: ");
        String nis_ = biodata.nextLine();

        System.out.print("Tempat lahir: ");
        String tempat_lahir = biodata.nextLine();
        
        System.out.print("Tanggal lahir: ");
        String Tanggal_lahir = biodata.nextLine();

        System.out.print("Jenis kelamin: ");
        String jenis_kelamin = biodata.nextLine();

        System.out.print("Alamat di malang: ");
        String alamat_di_malang = biodata.nextLine();

        System.out.print("Motto hidup: ");
        String motto_hidup = biodata.nextLine();


    }
}
    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package pengukuran_kayu;
    //import java.util.ArrayList; // Array dinamis 
    import Frame.FrameUtama;

    /**
     *
     * @author Vivobook
     */
    public class Pengukuran { //membuat class bernama pengukuran

        /**
         * @param args the command line arguments
         */ 
        public static void main(String[] args) { //baris 16 methode utama
            // TODO code application logic here
            // Membuat objek 'tes' dari class Rekap
            //membuat objek bernama 'tes' dari class rekap

//            // Mengisikan data (Sama seperti tes.setNamaKaryawan)
//            tes.setNamaKayu("Kayu Mahoni");
//            tes.setNoKayu(12);
//            tes.setDUjung(20);    // cm
//            tes.setDPangkal(26);  // cm
//            tes.setPanjang(4.5);  // meter
//
//            //mengisi data rekap
//            tes.setJumlahKayu(1);
//            tes.setKeterangan("Kayu siap digunakan");
//
//
//            //pakai constructure klo mau rapi
//            //Rekap tes = new Rekap("Kayu Mahoni", 12, 20, 26, 2.0);
//
//            // Menampilkan hasil volume kayu ke layar
//            // volumeTotal() memanggil dari class Rekap
//            tes.tampilData();

//            tes.inputDataNama("Kayu Mahoni");
//            tes.inputDataNama("Kayu Jati");
//            tes.inputDataNama("Kayu Meranti");
//            tes.inputDataNama("Kayu Ulin");
//            
//            tes.getIndexData(2);
//            
//            tes.searchData("Kayu Jati");

            // ===== INPUT DATA KAYU (ArrayList dari Kayu, diakses via Rekap) =====
//            tes.inputDataNama("Kayu Mahoni");
//            tes.inputDataNama("Kayu Jati");
//            tes.inputDataNama("Kayu Meranti");
//            tes.inputDataNama("Kayu Ulin");
//
//            tes.inputDataNoKayu(1);
//            tes.inputDataNoKayu(2);
//            tes.inputDataNoKayu(3);
//            tes.inputDataNoKayu(4);
//
//            tes.inputDataPanjang(4.5);
//            tes.inputDataPanjang(3.0);
//            tes.inputDataPanjang(5.0);
//            tes.inputDataPanjang(6.0);
//
//            tes.inputDataDiameterUjung(20.0);
//            tes.inputDataDiameterUjung(18.0);
//            tes.inputDataDiameterUjung(22.0);
//            tes.inputDataDiameterUjung(25.0);
//
//            tes.inputDataDiameterPangkal(26.0);
//            tes.inputDataDiameterPangkal(24.0);
//            tes.inputDataDiameterPangkal(28.0);
//            tes.inputDataDiameterPangkal(30.0);
//
//            // ===== INPUT DATA REKAP (ArrayList milik Rekap sendiri) =====
//            tes.inputDataVolume(0.145);
//            tes.inputDataVolume(0.098);
//            tes.inputDataVolume(0.212);
//            tes.inputDataVolume(0.318);
//
//            tes.inputDataJumlahKayu(10);
//            tes.inputDataJumlahKayu(8);
//            tes.inputDataJumlahKayu(15);
//            tes.inputDataJumlahKayu(5);
//
//            tes.inputDataKeterangan("Siap digunakan");
//            tes.inputDataKeterangan("Perlu pengeringan");
//            tes.inputDataKeterangan("Siap digunakan");
//            tes.inputDataKeterangan("Kualitas premium");
//
//            // ===== TAMPIL SEMUA DATA =====
//            System.out.println(tes.listDataNama());
//            System.out.println(tes.listDataNoKayu());
//            System.out.println(tes.listDataPanjang());
//            System.out.println(tes.listDataDiameterUjung());
//            System.out.println(tes.listDataDiameterPangkal());
//            System.out.println(tes.listDataVolume());
//            System.out.println(tes.listDataJumlahKayu());
//            System.out.println(tes.listDataKeterangan());
//
//            // ===== SEARCH DATA =====
//            // getIndexData dari Kayu — mencari posisi/index
//            int i = tes.getIndexData("Kayu Ulin");
//            System.out.println("Index Kayu Ulin : " + i);
//
//            // searchData dari Kayu — tampil data Kayu saja
//            tes.searchData("Kayu Jati");
//
//            // searchDataRekap dari Rekap — tampil data lengkap termasuk volume dll
//            tes.searchDataRekap("Kayu Jati");

            // ===== CONTOH PAKAI CONSTRUCTOR ISI =====
    //        Rekap tes2 = new Rekap("Kayu Mahoni", 12, 20, 26, 4.5, 3, "Siap digunakan");
    //        tes2.tampilData();
    //        System.out.println("Volume: " + tes2.volumeTotal());

            
          new Frame.FrameUtama().setVisible(true);

        }

    }

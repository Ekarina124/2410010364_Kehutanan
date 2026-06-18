/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengukuran_kayu;
import java.util.ArrayList; 
import javax.swing.JOptionPane;

/**
 *
 * @author Vivobook
 */
public class Rekap extends Kayu {

    // Atribut baru milik Rekap saja
    private double volume;
    private double diameterRata;
    private int    jumlahKayu;
    private String keterangan;

    // ArrayList baru milik Rekap saja
    private ArrayList<Double>  dataVolume;
    private ArrayList<Double>  dataDiameterRata;
    private ArrayList<Integer> dataJumlahKayu;
    private ArrayList<String>  dataKeterangan;

    // Constructor kosong
    public Rekap() {
        this.dataVolume       = new ArrayList<>();
        this.dataDiameterRata = new ArrayList<>();
        this.dataJumlahKayu   = new ArrayList<>();
        this.dataKeterangan   = new ArrayList<>();
    }

    // Constructor isi (overload constructor)
    public Rekap(String nama, int no, double dU, double dP, double p,
                 int jumlah, String ket) {
        super(nama, no, dU, dP, p);
        this.jumlahKayu = jumlah;
        this.keterangan = ket;

        this.dataVolume       = new ArrayList<>();
        this.dataDiameterRata = new ArrayList<>();
        this.dataJumlahKayu   = new ArrayList<>();
        this.dataKeterangan   = new ArrayList<>();
    }

    // ===================== INPUT DATA =====================
    public void inputDataVolume(Double data)       { this.dataVolume.add(data); }
    public void inputDataDiameterRata(Double data) { this.dataDiameterRata.add(data); }
    public void inputDataJumlahKayu(Integer data)  { this.dataJumlahKayu.add(data); }
    public void inputDataKeterangan(String data)   { this.dataKeterangan.add(data); }

    // ===================== LIST DATA =====================
    public ArrayList<Double>  listDataVolume()     { return this.dataVolume; }
    public ArrayList<Double>  listDataDiameterRata(){ return this.dataDiameterRata; }
    public ArrayList<Integer> listDataJumlahKayu() { return this.dataJumlahKayu; }
    public ArrayList<String>  listDataKeterangan() { return this.dataKeterangan; }

    // ===================== SETTER =====================
    public void setVolume(double volume)           { this.volume       = volume; }
    public void setDiameterRata(double dRata)      { this.diameterRata = dRata; }
    public void setJumlahKayu(int jumlah)          { this.jumlahKayu   = jumlah; }
    public void setKeterangan(String ket)          { this.keterangan   = ket; }

    // ===================== GETTER =====================
    public double getVolume()       { return volume; }
    public double getDiameterRata() { return diameterRata; }
    public int    getJumlahKayu()   { return jumlahKayu; }
    public String getKeterangan()   { return keterangan; }

    // ===================== FUNGSI HITUNG =====================
    public double hitungDiameterRata() {
        diameterRata = (getDUjung() + getDPangkal()) / 2.0;
        return diameterRata;
    }

    public double hitungVolume() {
        volume = (0.7854 * hitungDiameterRata() * hitungDiameterRata() * getPanjang()) / 10000;
        return volume;
    }

    public double volumeTotal() {
        return hitungDiameterRata() + hitungVolume();
    }

    // ===================== SEARCH DATA REKAP =====================
    // Menampilkan data tambahan milik Rekap saja
    public void searchDataRekap(String nama) {
        int i = getIndexData(nama);
        if (i < 0) return;

        // Panggil searchData dari Kayu untuk tampil data dasar
        searchData(nama);

        // Tampil data tambahan milik Rekap saja
        double vol  = this.dataVolume.get(i);
        double dRata= this.dataDiameterRata.get(i);
        int jumlah  = this.dataJumlahKayu.get(i);
        String ket  = this.dataKeterangan.get(i);

        String pesan = "===== DATA REKAP ====="
                     + "\nDiameter Rata    : " + dRata + " cm"
                     + "\nVolume           : " + vol   + " m³"
                     + "\nJumlah Kayu      : " + jumlah
                     + "\nKeterangan       : " + ket;

        JOptionPane.showMessageDialog(null, pesan);
    }
}

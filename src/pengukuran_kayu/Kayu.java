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
public class Kayu {

    // Encapsulation (private)
    private String namaKayu;
    private int noKayu;
    private double panjang, diameterUjung, diameterPangkal;

    // ArrayList dinamis milik Kayu
    private ArrayList<String> dataNamaKayu;
    private ArrayList<Integer> dataNoKayu;
    private ArrayList<Double> dataPanjang;
    private ArrayList<Double> dataDiameterUjung;
    private ArrayList<Double> dataDiameterPangkal;

    // Constructor kosong
    public Kayu() {
        this.dataNamaKayu       = new ArrayList<>();
        this.dataNoKayu         = new ArrayList<>();
        this.dataPanjang        = new ArrayList<>();
        this.dataDiameterUjung  = new ArrayList<>();
        this.dataDiameterPangkal= new ArrayList<>();
    }

    // Constructor isi (OVERLOADING)
    public Kayu(String nama, int no, double dUjung, double dPangkal, double panjang) {
        this.namaKayu       = nama;
        this.noKayu         = no;
        this.diameterUjung  = dUjung;
        this.diameterPangkal= dPangkal;
        this.panjang        = panjang;

        this.dataNamaKayu       = new ArrayList<>();
        this.dataNoKayu         = new ArrayList<>();
        this.dataPanjang        = new ArrayList<>();
        this.dataDiameterUjung  = new ArrayList<>();
        this.dataDiameterPangkal= new ArrayList<>();
    }

    // ===================== INPUT DATA =====================
    public void inputDataNama(String data)          { this.dataNamaKayu.add(data); }
    public void inputDataNoKayu(Integer no)         { this.dataNoKayu.add(no); }
    public void inputDataPanjang(Double data)       { this.dataPanjang.add(data); }
    public void inputDataDiameterUjung(Double data) { this.dataDiameterUjung.add(data); }
    public void inputDataDiameterPangkal(Double data){ this.dataDiameterPangkal.add(data); }

    // ===================== LIST DATA =====================
    public ArrayList<String>  listDataNama()           { return this.dataNamaKayu; }
    public ArrayList<Integer> listDataNoKayu()         { return this.dataNoKayu; }
    public ArrayList<Double>  listDataPanjang()        { return this.dataPanjang; }
    public ArrayList<Double>  listDataDiameterUjung()  { return this.dataDiameterUjung; }
    public ArrayList<Double>  listDataDiameterPangkal(){ return this.dataDiameterPangkal; }

    // ===================== SETTER =====================
    public void setNamaKayu(String nama)    { this.namaKayu       = nama; }
    public void setNoKayu(int no)           { this.noKayu         = no; }
    public void setDUjung(double dUjung)    { this.diameterUjung  = dUjung; }
    public void setDPangkal(double dPangkal){ this.diameterPangkal= dPangkal; }
    public void setPanjang(double panjang)  { this.panjang        = panjang; }

    // ===================== GETTER =====================
    public String getNamaKayu() { return namaKayu; }
    public int    getNoKayu()   { return noKayu; }
    public double getDUjung()   { return diameterUjung; }
    public double getDPangkal() { return diameterPangkal; }
    public double getPanjang()  { return panjang; }

    // ===================== SEARCH & INDEX =====================
    // Mencari index/posisi data berdasarkan nama
    public int getIndexData(String nama) {
        int index = this.dataNamaKayu.indexOf(nama);
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
        return index;
    }

    // Menampilkan data Kayu berdasarkan nama (data milik Kayu saja)
    public void searchData(String nama) {
        int i = getIndexData(nama);
        if (i < 0) return;

        double panjang   = this.dataPanjang.get(i);
        double dUjung    = this.dataDiameterUjung.get(i);
        double dPangkal  = this.dataDiameterPangkal.get(i);

        String pesan = "===== DATA KAYU =====" 
                     + "\nNama Kayu        : " + nama
                     + "\nNo Kayu          : " + this.dataNoKayu.get(i)
                     + "\nPanjang          : " + panjang + " m"
                     + "\nDiameter Ujung   : " + dUjung + " cm"
                     + "\nDiameter Pangkal : " + dPangkal + " cm";

        JOptionPane.showMessageDialog(null, pesan);
    }
    
    public void ubahDataKayu(String nama, int no, double dUjung, double dPangkal, double panjang) {
        int i = getIndexData(nama);
        if (i < 0) return;
        this.listDataNama().set(i, nama);
        this.listDataNoKayu().set(i, no);
        this.listDataDiameterUjung().set(i, dUjung);
        this.listDataDiameterPangkal().set(i, dPangkal);
        this.listDataPanjang().set(i, panjang);
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
    }

    public void hapusDataKayu(String nama, int no, double dUjung, double dPangkal, double panjang) {
        int i = getIndexData(nama);
        if (i < 0) return;
        this.listDataNama().remove(i);
        this.listDataNoKayu().remove(i);
        this.listDataDiameterUjung().remove(i);
        this.listDataDiameterPangkal().remove(i);
        this.listDataPanjang().remove(i);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
    }
}

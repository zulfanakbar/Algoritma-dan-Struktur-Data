package Tugas2;

public class NodeTugas2 {
    String antrian;
    String nik;
    String nama;
    String poli;
    NodeTugas2 next;
    
    public NodeTugas2(String antri, String nik, String nama, String poli, NodeTugas2 next){
        this.antrian = antri;
        this.nama = nama;
        this.nik = nik;
        this.poli = poli;
        this.next = next;
    }
}

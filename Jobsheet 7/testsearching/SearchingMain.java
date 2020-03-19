package testsearching;

class SearchingMain {
    
    public static void main(String[] args) {
        int data[]={10, 30, 40, 50, 60, 70, 80, 90};
        Searching pencarian = new Searching(data, 8);
        System.out.println("isi Array :");
        pencarian.TampilData();
        int cari = 30;
        
        System.out.println("menggunakan sequential Search");
        int posisi = pencarian.FIndSeqSearch(cari);
        pencarian.TampilPosisi(cari, posisi);
        System.out.println("===========================");
        System.out.println("menggunakan binary searching");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.TampilPosisi(cari, posisi);
        }
    }

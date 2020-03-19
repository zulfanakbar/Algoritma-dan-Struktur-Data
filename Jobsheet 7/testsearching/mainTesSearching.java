package testsearching;

class SearchingMain {
    
    public static void main(String[] args) {
        int data[]={10, 30, 40, 50, 60, 70, 80, 90};
        tesSearching pencarian = new tesSearching(data, 8);
        System.out.println("isi array :");
        pencarian.TampilData();
        int cari = 30;
        
        System.out.println("menggunakan sequential Search");
        int posisi = pencarian.FIndSeqSearch(cari);
        
        if(posisi != -1){
            System.out.println("data :" + cari + "ditemukan pada indeks " + posisi);
        }else{
            System.out.println("data" + cari + "tidak ditemukan");
        }
    }}

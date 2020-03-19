package testsearching;

public class tesSearching {
    public int[] data;
    public int jumData;
    
public tesSearching(int[] Data, int jmlData){
    this.jumData = jmlData;
    data = new int[jmlData];
    for (int i = 0; i<jumData; i++){
        data[i] = Data[i];
    }
}    
public int FIndSeqSearch(int cari){
    int posisi = -1;
    for(int j=0; j<jumData; j++){
        if(data[j] == cari){
            posisi = j;
            break;
        }
    }
    return posisi;
}
public void TampilData(){
    for (int i=0; i<jumData; i++){
        System.out.println(data[i] + " ");
    }
    System.out.println("");
}
public int FindBinarySearch(int cari, int left, int right){
    int mid;
    if (right >= left){
        mid = (left + right) / 2;
        if (cari == data[mid]){
            return (mid);
        }else if (data[mid] > cari){
            return FindBinarySearch(cari, left, mid - 1);
        }else{
            return FindBinarySearch(cari, mid + 1, right);
        }
    }
    return - 1;
}
public void TampilPosisi(int x,int pos){
    if (pos!= -1){
        System.out.println("data : " + x + "ditemukan pada indeks "+pos);
    }else{
        System.out.println("data " + x +"tidak ditemukan");
    }
}
}



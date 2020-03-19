package tugas2;

public class ligainggris2 {
    ligainggris listLiga[]=new ligainggris[20];
    int indeks;
    
    void tambah(ligainggris L){
        if(indeks<listLiga.length){
            listLiga[indeks]=L;
            indeks++;
        }else{
            System.out.println("Data Sudah Penuh!!!");
        }
    }
    
    void tampil(){
        for(ligainggris L:listLiga){
            L.tampil();
        }
    }
    void insertionSortA(){
        int a, b;
        for(a=1; a<listLiga.length;a++){
            ligainggris temp=listLiga[a];
            b=a;
            while((b>0)&&(listLiga[b-1].poin>temp.poin)){
                listLiga[b]=listLiga[b-1];
                b--;
            }
            listLiga[b]=temp;
        }
    }
    void insertionSortD(){
        int c,d;
        for(c=1; c<listLiga.length;c++){
            ligainggris temp = listLiga[c];
            d=c;
            while((d>0)&&(listLiga[d-1].poin<temp.poin)){
                listLiga[d]=listLiga[d-1];
                d--;
            }
            listLiga[d]=temp;
        }
    }
}

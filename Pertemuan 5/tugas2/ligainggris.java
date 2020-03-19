package tugas2;

public class ligainggris {
    String namaClub;
    int game;
    int agregat;
    int poin;
    
    ligainggris(String nc, int g, int ag, int pn){
        namaClub = nc;
        game = g;
        agregat = ag;
        poin = pn;
    }
    void tampil(){
        System.out.println("=========================");
        System.out.println("Nama Club :"+ namaClub);
        System.out.println("Total Permainan :"+game);
        System.out.println("Total Agregat :"+agregat);
        System.out.println("Point yang didapat :"+poin);
    }

    }


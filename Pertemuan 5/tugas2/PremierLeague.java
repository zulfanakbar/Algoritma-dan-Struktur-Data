package tugas2;

public class PremierLeague {
    public static void main(String[] args) {
        ligainggris2 data = new ligainggris2();
        ligainggris[]L=new ligainggris[20];
        
        L[0]=new ligainggris("Liverpool",29,45,82);
        L[1]=new ligainggris("Manchester City",27,39,57);
        L[2]=new ligainggris("Leicester City",28,26,50);
        L[3]=new ligainggris("Chealsea",29,9,48);
        L[4]=new ligainggris("Wolverhamton Wanderers",29,7,43);
        L[5]=new ligainggris("Sheffield United",28,5,43);
        L[6]=new ligainggris("Manchester United",28,12,42);
        L[7]=new ligainggris("Tottenham United",29,7,47);
        L[8]=new ligainggris("Arsenal",28,4,40);
        L[9]=new ligainggris("Burnley",29,-6,39);
        L[10]=new ligainggris("Crystal Palace",29,-6,39);
        L[11]=new ligainggris("Everton",29,-6,37);
        L[12]=new ligainggris("Newcastle United",29,-16,35);
        L[13]=new ligainggris("Southampton",29,-17,34);
        L[14]=new ligainggris("Brighton & Hove Albion",29,-8,29);
        L[15]=new ligainggris("West Ham United",29,-15,27);
        L[16]=new ligainggris("Watford",29,-17,27);
        L[17]=new ligainggris("AFC Bournemouth",29,-18,27);
        L[18]=new ligainggris("Aston Villa",27,-18,25);
        L[19]=new ligainggris("Norwich City",29,-27,21);
        
        for(int i=0;i<20;i++){
            data.tambah(L[i]);
        }
        System.out.println("Daftar PremierLeague Sebelum di Sorting :");
        data.tampil();
        System.out.println();
        
        System.out.println("=========================================");
        System.out.println("Daftar PremierLeage Setelah Insertion Sort secara Asc :");
        data.insertionSortD();
        data.tampil();
        System.out.println();
        
        System.out.println("=========================================");
        System.out.println("Daftar PremierLeague Setelah insertion Sprt secara Desc :");
        data.insertionSortD();
        data.tampil();
        
    }
    
}

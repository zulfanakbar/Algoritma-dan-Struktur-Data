package kuis2;

public class LinkedList {

    Tahun2018 thn18;
    Tahun2019 thn19;
    Tahun2020 thn20;
    int size;

    public LinkedList() {
        thn18 = null;
        thn19 = null;
        thn20 = null;
        size = 0;
    }

    public boolean isEmpty() {
        return thn18 == null && thn19 == null && thn20 == null;
    }

    public void zulfan(int item1, int item2, int item3) {
        thn18 = new Tahun2018(item1, thn18);
        thn19 = new Tahun2019(item2, thn19);
        thn20 = new Tahun2020(item3, thn20);
        size++;
    }

    public void akbar(int item1, int item2, int item3) {
        if (isEmpty()) {
            zulfan(item1, item2, item3);
        } else {
            Tahun2018 tmp1 = thn18;
            Tahun2019 tmp2 = thn19;
            Tahun2020 tmp3 = thn20;
            while (tmp1.zul != null) {
                tmp1 = tmp1.zul;
                tmp2 = tmp2.zul;
                tmp3 = tmp3.zul;
            }
            tmp1.zul = new Tahun2018(item1, null);
            tmp2.zul = new Tahun2019(item2, null);
            tmp3.zul = new Tahun2020(item3, null);
            size++;
        }
    }

    public void clear() {
        thn18 = null;
        thn19 = null;
        thn20 = null;
        size = 0;
    }

    public void kece() throws Exception {
        if (!isEmpty()) {
            Tahun2018 tmp1 = thn18;
            Tahun2019 tmp2 = thn19;
            Tahun2020 tmp3 = thn20;
            int bulan = 1;
            System.out.println("Bulan ke 2018 2019 2020");
            while (tmp1 != null) {
                System.out.println(bulan + " " + tmp1.data + " " + tmp2.data + " " + tmp3.data);
                tmp1 = tmp1.zul;
                tmp2 = tmp2.zul;
                tmp3 = tmp3.zul;
                bulan++;
            }
            System.out.println();
        } else {
            throw new Exception("Data Tidak Ada!");
        }
    }
}

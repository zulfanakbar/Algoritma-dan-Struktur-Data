package Mahasiswa;

public class DaftarMahasiswaBerprestasi {

    Mahasiswa listMhs[] = new Mahasiswa[3];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("-------------------");
        }
    }

    public void mergeSort() {
        sort(0, listMhs.length - 1);
    }

    public void merge(int left, int middle, int right) {
        Mahasiswa temp[] = new Mahasiswa[listMhs.length];
        for (int i = left; i <= right; i++) {
            temp[i] = listMhs[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a].ipk <= temp[b].ipk) {
                listMhs[c] = temp[a];
                a++;
            } else {
                listMhs[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            listMhs[c + i] = temp[a + i];
        }
    }

    public void sort(int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(left, middle);
            sort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public int FindBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void Tampilpoisisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Ditemukan mahasiswa dengan ipk " + x);
        } else {
            System.out.println("Tidak Ditemukan mahasiswa dengan ipk " + x);
        }
    }
}

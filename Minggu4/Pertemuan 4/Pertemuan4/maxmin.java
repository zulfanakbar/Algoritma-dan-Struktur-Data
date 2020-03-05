package Pertemuan4;

class maxmin {
    public int maximum;
    public int minimum;    
    public static void max_min(int[] arr, int indeks_awal, int indeks_akhir, maxmin hasil){
        int indeks_tengah;
        maxmin hasil1 = new maxmin();
        maxmin hasil2 = new maxmin();
        
        if(indeks_awal == indeks_akhir){
            hasil.minimum = hasil.maximum = arr[indeks_awal];
        }else if(indeks_akhir - indeks_awal == 1){
            if(arr[indeks_awal] > arr[indeks_akhir]){
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            }else{
                hasil.minimum = arr[indeks_akhir];
                hasil.maximum = arr[indeks_awal];
            }
        }else{
            indeks_tengah = (indeks_awal + indeks_akhir)/2;
            max_min(arr, indeks_awal, indeks_tengah, hasil1);
            max_min(arr, indeks_tengah + 1, indeks_akhir, hasil2);
            
            hasil.minimum = (hasil1.minimum < hasil2.minimum) ? hasil1.minimum : hasil2.minimum;
            hasil.maximum = (hasil1.maximum > hasil2.maximum) ? hasil1.maximum : hasil2.maximum;        
        }}
    }
   



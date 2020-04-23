package kuis2;

public class Tahun2018<T> {

    T data;
    Tahun2018<T> zul;

    public Tahun2018(T data, Tahun2018<T> zul) {
        this.data = data;
        this.zul = zul;
    }
}

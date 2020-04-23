package kuis2;

public class Tahun2020<T> {

    T data;
    Tahun2020<T> zul;

    public Tahun2020(T data, Tahun2020<T> zul) {
        this.data = data;
        this.zul = zul;
    }
}

package kuis2;

public class Tahun2019<T> {

    T data;
    Tahun2019<T> zul;

    public Tahun2019(T data, Tahun2019<T> zul) {
        this.data = data;
        this.zul = zul;
    }
}
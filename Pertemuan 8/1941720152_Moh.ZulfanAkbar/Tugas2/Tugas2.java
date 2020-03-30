package Tugas2;

public class Tugas2 {

    int size, top;
    String data[];

    public Tugas2(int size) {
        this.size = size;
        data = new String[size];
        top = -1;
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String dt) {
        if (!IsFull()) {
            top++;
            data[top] = dt;
        }
    }

    public void print() {
        System.out.print("Kalimat dibalik : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}

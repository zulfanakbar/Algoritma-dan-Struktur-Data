package Tugas;

public class LinkedListTugas1 {
    NodeTugas1 head;
    int size;
    
    public LinkedListTugas1(){
        head = null;
        size = 0;
    }
    public boolean IsEmpty(){
        return head==null;
    }
    public void addFirst(String NIM, String name, String almt){
        head = new NodeTugas1(NIM, name, almt, head);
        size++;
    }
    
    public void add(String NIM, String name, String almt){
        if(IsEmpty()){
            addFirst(NIM, name,almt);
        } else {
            NodeTugas1 tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new NodeTugas1(NIM, name, almt, null);
            size++;
        }
    }
    public void removeValue(String NIM){
        NodeTugas1 prev = head;
        NodeTugas1 cur = head.next;
        for (int i = 1; i < size; i++) {
            if(NIM != prev.nim){
                prev = prev;
                cur = prev.next;
            }
        }
        prev.next = cur.next;
        size--;
    }
    
    public void findKey(String key){
        NodeTugas1 tmp = head;
        for (int i = 1; i < size; i++) {
            if(key != tmp.nim){
                tmp=tmp.next;
            }
        }
        System.out.println("Data yang dicari: ");
        System.out.println("NIM : " +tmp.nim + "\t");
        System.out.println("Nama : " +tmp.nama + "\t");
        System.out.println("Alamat : " +tmp.alamat);
    }
    void print(){
        if(!IsEmpty()){
            NodeTugas1 tmp = head;
                System.out.println("-----------------------------------------------------------");
                System.out.println("--------------------> DATA MAHASISWA <---------------------");
                System.out.println("-----------------------------------------------------------");
                System.out.println("nim\t\t|\t" + "nama\t\t|\t" + "alamat");
            while(tmp != null){
                System.out.println("-----------------------------------------------------------");
                System.out.println(tmp.nim + "\t\t" +tmp.nama+ "\t\t\t" +tmp.alamat);
                System.out.println("-----------------------------------------------------------");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists KOSONG!!");
        }
    }
}

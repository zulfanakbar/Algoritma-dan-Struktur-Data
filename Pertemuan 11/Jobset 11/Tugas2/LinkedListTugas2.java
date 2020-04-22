package Tugas2;

public class LinkedListTugas2 {
    NodeTugas2 head;
    int size;
    int front;
    int rear;
    
    public LinkedListTugas2(){
        head = null;
        size = 0;
    }
    public boolean IsEmpty(){
        return head==null;
    }
    public void addFirst(String antri, String NIK, String nama, String poli){
        head = new NodeTugas2(antri, NIK, nama, poli, head);
        size++;
    }
    
    public void add(String antri, String NIK, String nama, String poli){
        if(IsEmpty()){
            addFirst(antri, NIK, nama, poli);
        } else {
            NodeTugas2 tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new NodeTugas2(antri, NIK, nama, poli, null);
            size++;
        }
    }
    public void removeFirst(){
        head = head.next;
        size--;
        String antrian = null;
    }
    public void remove (String antrian) throws Exception {
        if(IsEmpty()) {
            throw new Exception("Nilai index di luar batas");
        }
        else if (antrian==null) {
            removeFirst();
        }
        else {
            NodeTugas2 prev = head;
            NodeTugas2 cur = head.next;
            for (int i = 1; i< antrian.charAt(0); i++){
            prev = cur;
            cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }
    public void clear(){
        head = null;
        size--;
    }
   void carikey(String key){
        NodeTugas2 tmp=head;
        int a=0;
            for(int i=1;i<size;i++){
                if(key!=tmp.antrian){
                    a=i;
                    tmp=tmp.next;

                }
            }
            System.out.println("Data yang anda cari : ");
            System.out.println("Antrian ke-"+(a+1));
            System.out.println("NIK : "+tmp.nik);
            System.out.println("Nama : "+tmp.nama);
            System.out.println("Jenis Poli : "+tmp.poli);
            System.out.println("");
    }
    public void getFirst() throws Exception{
    if(IsEmpty()){
        throw new Exception("LinkedList Kosong");
    }
         System.out.println("No Antrian : "+head.antrian);
         System.out.println("NIK : "+head.nik);
         System.out.println("Nama : "+head.nama);
         System.out.println("Jenis Poli : "+head.poli);
    }
    public void print(){   
        if(!IsEmpty()){
            NodeTugas2 tmp=head;
                System.out.println("===============================");
                System.out.println("----> DATA ANTRIAN PASIEN <----");
                System.out.println("===============================");
            while(tmp!=null){
                System.out.println("No Antrian : "+tmp.antrian);
                System.out.println("NIK : "+tmp.nik);
                System.out.println("Nama : "+tmp.nama);
                System.out.println("Jenis Poli : "+tmp.poli);
                tmp=tmp.next;
                System.out.println();
            }
            System.out.println();
            System.out.println("===============================");
        }
        else{
        System.out.println("LinkedList kosong");
        }
    }
   void getlast() throws Exception{
       if (IsEmpty()){
           throw new Exception ("LinkedList kosong");
           
       }
       NodeTugas2 tmp = head;
       while (tmp.next != null) {
           tmp = tmp.next;
       }
       System.out.println("No Antrian : "+tmp.antrian);
       System.out.println("NIK : "+tmp.nik);
       System.out.println("Nama : "+tmp.nama);
       System.out.println("Jenis Poli : "+tmp.poli);
   } 
}

package pertemuan11;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList zul = new LinkedList();
        try {
            zul.addFirst(7);
            zul.print();
            zul.add(8, 1);
            zul.print();
            zul.addFirst(1);
            zul.print();
            zul.remove(1);
            zul.print();
            System.out.println("Add By Value : ");
            zul.addByValue(1, 2, 0, 1);
            zul.addByValue(5, 4, 1, 5);
            zul.print();
            System.out.println("Remove By Value : ");
            zul.removeByValue(8, 3, 8);
            zul.print();
            zul.clear();
            zul.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
}

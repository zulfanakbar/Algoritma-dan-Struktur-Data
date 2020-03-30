package minggu8;

public class StackMain {

    public static void main(String[] args) {
        Stack tumpukan = new Stack(4);
        tumpukan.push("AREMA FC");
        tumpukan.push("PERSIJA JAKARTA");
        tumpukan.push("PERSEWANGI BANYUWANGI");
        tumpukan.push("BALI UNITED");
        
        tumpukan.print();
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
    
}

package kuis2;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        try {
            data.zulfan(475544 , 2412307, 3743756);
            data.akbar (1985572, 878734 , 3398320);
            data.akbar (2076432, 2343240, 983474 );
            data.akbar (2165239, 2546836, 923498 );
            data.akbar (2283546, 2436456, 2845672);
            data.akbar (2344460, 1943656, 3456566);
            data.akbar (2635040, 2453425, 2341653);
            data.akbar (2958672, 2754240, 2341653);
            data.akbar (3047626, 3256404, 2534400);
            data.akbar (2843543, 3454645, 2346307);
            data.akbar (2734526, 3698200, 943734 );
            data.akbar (2523400, 4138479, 2234544);
            data.kece();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
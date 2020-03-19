package MergeSortTest;

public class sortMain {
    public static void main(String[] args) {
        int data[]={10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("sorting dengan merge sort");
        MergeSort mSort=new MergeSort();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah di urutkan");
        mSort.printArray(data);
    }    
}

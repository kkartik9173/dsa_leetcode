package main.java.dsa;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,6,2,3,1,8,4};
        System.out.println("Initial Array");
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n" + "Call Quick sort Function from Main");
        quickSort(arr, 0, arr.length-1 );

        System.out.println("Final Array");
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        for (int a:arr) {
            System.out.print(a + " ");
        }

        System.out.println("\n" + "In quick sort function");
        System.out.println("low "+ low);
        System.out.println("high "+ high);
        if(low<high){
           int pi= partition(arr, low, high);
            System.out.println("pi "+ pi);
           quickSort(arr, low, pi-1);
           quickSort(arr, pi+1, high);
        }
        System.out.println("end ");
    }

    private static int partition(int[] arr, int low, int high){
        System.out.println("Start partition with low and high as " + low + " " + high);
        int pivot = arr[high];
        int i = low-1;

        for (int j=low; j<high; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        System.out.println("In partition Array iterate");
        for (int num: arr) {
            System.out.print(num + " ");
        }

        int beforeReturn = i+1;
        System.out.println("\n" + "beforeReturn "+ beforeReturn);
        return beforeReturn;
    }
}

package main.java.dsa;

public class MergeSort {

    //Dividing the value or arrays
    private static void mergeSort(int[] arr, int l, int r) {
        if(l<r){
            System.out.println("l " + l);
            System.out.println("r " + r);
            System.out.println();
            for (int n : arr){
                System.out.print(n + " ");
            }
            System.out.println();

            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr,mid+1, r);
            
            mergeSort(arr, l, mid, r);
        }

    }
    //merging the arrays
    private static void mergeSort(int[] arr, int l, int mid, int r) {
        System.out.println("l " + l);
        System.out.println("r " + r);
        System.out.println("merge Sort, merging block start");
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        int n1 = mid - l +1;
        int n2 = r - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x=0;x<n1;x++){

            lArr[x] = arr[l+x];
        }

        for(int x=0;x<n2;x++){

            rArr[x] = arr[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = l;
        while(i<n1 && j<n2){

            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
        System.out.println("l " + l);
        System.out.println("r " + r);
        System.out.println();
        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println("merge Sort merge block end");

    }

    public static void main(String[] args) {
        int[] arr = {90, 3,5,144,4,6,65,2,23};

        for (int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("Sorting of divide , conquer and merging starts");

        //Sorting Logic
        mergeSort(arr, 0, arr.length-1);

        System.out.println("Final Array after divide conquer and merge");
        for(int n:arr){
            System.out.print(n + " ");
        }
    }


}

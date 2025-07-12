import java.util.Arrays;

public class BubbleSortExample {
        static void bubbleSort(int[] arr) {

            System.out.println("Before bubble sort : "+Arrays.toString(arr));
            int n = arr.length;
            int temp = 0;
            boolean noChange;

            for(int i=0; i < n; i++){
                noChange= true;
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        noChange= false;
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
                if(noChange) break;
            }
            System.out.println("After bubble sort : "+ Arrays.toString(arr));
        }
}

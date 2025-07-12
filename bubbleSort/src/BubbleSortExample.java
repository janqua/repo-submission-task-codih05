import java.util.Arrays;

public class BubbleSortExample {
        static void bubbleSort(int[] intArray) {
            int n = intArray.length;
            System.out.println("Before bubble sort : "+Arrays.toString(intArray));
            int temp = 0;
            boolean noChange;

            for(int i=0; i < n; i++){
                noChange= true;
                for(int j=1; j < (n-i); j++){
                    if(intArray[j-1] > intArray[j]){
                        //swap elements
                        noChange= false;
                        temp = intArray[j-1];
                        intArray[j-1] = intArray[j];
                        intArray[j] = temp;
                    }
                }
                if(noChange) break;
            }
            System.out.println("After bubble sort : "+ Arrays.toString(intArray));
        }
}

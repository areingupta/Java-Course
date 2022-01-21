package Arrays2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class insertion_sort {

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i - 1;
            for (j = i-1; j >= 0 && arr[j] > temp; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");


        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            insertion_sort.insertionSort(input);
            printArray(input);

            t -= 1;
        }
    }
}

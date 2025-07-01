import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    // Recurssion solve

    public static void merge(int low, int mid, int high, int[] arr){

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){

            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(left);
            left++;
        }

        while(right <= high){
            temp.add(right);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high){

        if(low == high) return;

        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        merge(low, mid, high, arr);
    }



    public static void main(String[] args) {

        int[] arr = new int[]{1,4,2,2,5,4,8,6,7,4};

        mergeSort(arr, 0, arr.length-1);

        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}

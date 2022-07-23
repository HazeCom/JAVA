package Algorithms;

public class SearchingAlgo {
    public static void main(String[] args) {
        // objective is to find the k in array and printing the index it is present first;

        int[] arr = {1,2,3,4,5,6,6,7,7};
        int k = 4;
        SearchingAlgo searchingAlgo = new SearchingAlgo();
        searchingAlgo.linearSearch(arr,k);
        searchingAlgo.binarySearch(arr,k);
    }

    void linearSearch(int[] arr, int k){
        // Searching in Linear Order that is from start to end or from end to start is know as Linear search
        // it takes 0(n) time complexity;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                System.out.println("Linear Search and : "+i);
                break;
            }
        }
    }

    void binarySearch(int[] arr, int k){
        // binarySearch Time Complexity: O(log n), it is one of the fastest searching algorithms the only downside is the array needs to be sorted;
        // we use divide and conquer method to achieve this algorithm, we take the mid and shift our low and high according the to need;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+((high-low)/2);
            if(arr[mid]==k){
                System.out.println("Binary Search and :"+mid);
                break;
            }
            if(arr[mid]<k){
                low = mid+1;
            }
            if(arr[mid]>k) {
                high = mid;
            }
        }
    }

}

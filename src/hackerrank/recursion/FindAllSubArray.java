package hackerrank.recursion;

public class FindAllSubArray {
    public static void findAllSubArray(int[] arr, int start, int end){
        if( end == arr.length) return ;
        if(start > end){
            findAllSubArray(arr, 0, end +1);
        } else {
            for(int i = start; i <= end; i++){
                System.out.print(arr[i] +" ");
            }

            System.out.println();
            findAllSubArray(arr, start + 1, end);

        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2};
        findAllSubArray(arr, 0,0);
    }
}

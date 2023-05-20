package hundreddayscodeforexperince.code;
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 ={1, 3, 5, 7};
        int [] arr2 ={ 2, 4, 6, 8, 9};
        int [] mergedArray = mergeArray(arr1,arr2);

        System.out.println("Merged Array Anshu Baba:");
        for (int num :mergedArray) {
            System.out.print(num+" ");
        }
    }
    public static int [] mergeArray(int[] arr1, int[]arr2 ) {
     int [] mergedArray = new int[arr1.length+arr2.length];
     int i =0,j=0,k=0;
     while (i<arr1.length&&j<arr2.length){
         if (arr1[i]<arr2[j]){
             mergedArray[k++]=arr1[i++];
         }else {
             mergedArray[k++]=arr2[j++];
         }
     }
     while (i<arr1.length){
         mergedArray[k++]=arr1[i++];
     }
        while (j<arr2.length){
            mergedArray[k++]=arr2[j++];
        }
        return mergedArray;
    }
}
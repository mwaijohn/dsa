package org.example.array;

public class SubArray {
    public static void main(String[] args) {
        int sample[] = {1,2,3,4};
        printSubArrays(sample);
        /* the sub arrays for the sample are
        * 1
        * 1,2
        * 1,2,3
        * 1,2,3,4 */
    }

    static void printSubArrays(int[] array){
        int length = array.length;
        for (int i=0; i<length; i++){ //loop through the whole array
            for (int j=i; j<length;j++){ // we index one now print any possible sub array
                /*print 1 then 1,2 then 1,2,3, then 1,2,3,4 and so on */
                for (int k=i;k<=j;k++){
                    /* assuming i= index 2 and j= index 4 we move*/
                    System.out.print(array[k]);
                }
                System.out.println();
            }
        }
    }
}

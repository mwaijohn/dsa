package org.example.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {13,45,56,78,9,5};
        int target = 5;

        int index = search(numbers,target);
        if (index != -1)
            System.out.println("Number: "+ target +" found at index: " + index);
        else
            System.out.println("Number not found");

    }

    public static int search(int[] numbers,int target){
        int index = -1;
        for (int x=0;x<numbers.length;x++){
            if (numbers[x] == target){
                return x;
            }
        }
        return index;
    }
}

package com.techm.arrays;

/**
 * Program for Find the smallest distance between two neighboring numbers in an array
 * @author CP00421684
 *
 */
public class NeighboringNumDistance {

	static void neighborNumDist(int []array){
		int smallestDistance = Math.abs(array[0]-array[1]);
        int nigh1=array[0];
        int nigh2=array[1];
        for(int i=1; i<array.length-1; i++){
            int value = Math.abs(array[i]-array[i+1]);
            if(value< smallestDistance){
            	smallestDistance= value;
            nigh1=array[i];
            nigh2=array[i+1];
            }
                
        }
        System.out.println("two nighboring intergers are-->"+nigh1+","+nigh2);
        System.out.println("Neighbor Numbers Distance-->"+smallestDistance);
	}
	
	public static void main(String[] args) {
		int []arr= new int[]{9,5,8,15,3,5};
        neighborNumDist(arr);

	}

}

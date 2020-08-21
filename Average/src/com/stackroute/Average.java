package com.stackroute;

public class Average{

    public static void main(String[] args) {
	int arr1[]={1,2,3,4,5},arr2[]={2,4,6,5,1},sum=0;
	for(int i=0;i<arr1.length;i++){
	    for(int j=0;j<arr2.length;j++){
	        if(arr1[i]==arr2[j]){
	            sum=sum+arr1[i];
            }
        }
    }System.out.println("Sum is"+sum);
    }
}

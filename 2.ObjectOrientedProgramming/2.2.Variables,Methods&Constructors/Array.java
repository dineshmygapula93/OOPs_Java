// Array is collection of similar data elements
//Array index is begins with index zero
//In java Array itself is an object
//Array reference is called as oject reference
public class Array {
    public static void main(String[] args) {
        //Declaration and initialization of array
        int [] arr={4,5,7,8,9};
        //It is also a valid Declaration and initialization of array
        int []arr1=new int []{4,5,6,7,9};

        //printing the array elements using for loop
        for(int i=0 ;i<arr.length ;i++){
            System.out.println(arr[i]);
        }
        
        //printing the arrary elements using foreach loop
        for (int j : arr1) {
            System.out.println(j);
        }
    }
}

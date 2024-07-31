// Array example 

public class ArrayExample 
{
  public static void main(String a[])
  {
    int nums[] = {4,6,7,9}; // Basic array initialization

    nums[2] = 6; // Array updation

    // Creating dynamic array

    int arr[] = new int[4];  // Every value will be zero

    // Value updating

    arr[0] = 5;
    arr[1] = 2;
    arr[2] = 1;  // arr[3] will be zero the initial value
    
    // Printing values

    for(int i=0;i<4;i++){
      System.out.println(arr[i]);
    }

  }  
}

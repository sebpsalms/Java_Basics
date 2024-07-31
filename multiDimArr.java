public class multiDimArr {

  public static void main(String a[])
  {
  // Creating dynamic array

    int arr[][] = new int[4][3];  // Every value will be zero

    // Value updating using random variable

    for(int i=0;i<4;i++)
    {
      for(int j=0;j<3;j++){
      arr[i][j] = (int)(Math.random()*100);
      }
    }

    for(int i=0;i<4;i++){
      for(int j=0;j<3;j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    }

  }  


  


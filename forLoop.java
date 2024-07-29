// Simple for-loop example for time listing from 9 to 5.
 
public class forLoop 
{
  public static void main(String argss[]){

    for(int i=1; i<=5; i++){

      System.out.println("Day "+  i);

      for(int j=1; j<=9; j++){

      System.out.println("  "+ (j+8) + " - " + (j+9));
      }

    }

  }
}

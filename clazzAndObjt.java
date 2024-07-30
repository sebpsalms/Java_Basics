

class Calcu{
  public int add(int n1,int n2){

    int result;
    return result = n1 + n2;

  }
}

public class clazzAndObjt 
{
  public static void main(String a[])
  {
    int num1 = 4;
    int num2 = 5;
    

    Calcu addi = new Calcu(); // addi id reference variable of Calcu

    int result = addi.add(num1,num2);
    System.out.println(result);

  }
}

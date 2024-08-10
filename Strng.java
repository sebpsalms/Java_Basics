// String Example with String-buffer

public class Strng {

  public static void main(String arg[])
  {
    String immutablename = "Sebastian"; // String is a class with immutable and when object is created the duplicate data it will refer to the previous data in heap memory
    System.out.println(immutablename);

    StringBuffer mutableNames = new StringBuffer("Sebastian"); // we can add and do different mutable functions in this class called String buffer and it is not thread safe.
    System.out.println(mutableNames);

    mutableNames.append(" Babu");

    System.out.println(mutableNames);
    
    String myname = mutableNames.toString();
 
  }
  
}

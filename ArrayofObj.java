//Array of objects with Enhanced for loop

class Student
{
  int id;
  String Name;
  int Marks;
}

public class ArrayofObj 
{
 public static void main(String[] args) 
 {
  Student std1 = new Student(); 
  std1.Name = "Emmanuel";
  std1.Marks = 100;
  std1.id = 2726;

  Student std2 = new Student(); 
  std2.Name = "Sebatsian";
  std2.Marks = 98;
  std2.id = 2724;

  Student std3 = new Student(); 
  std3.Name = "Kiran";
  std3.Marks = 99;
  std3.id = 2725;

  Student Arraystudents[] = new Student[3]; // Array which is holdings students references 

  Arraystudents[0] = std1;
  Arraystudents[1] = std2;
  Arraystudents[2] = std3;

  for (int i =0; i< Arraystudents.length;i++) {
    System.out.println(Arraystudents[i].Name +" : "+ Arraystudents[i].id);
    
  }
  System.out.println();
  

  //Enhanced for loop commonly used in array and collections

  System.out.println("Using Enhanced for loop");

  
  System.out.println();

  for( Student stds : students)
  {
    System.out.println(stds.Name +" : "+ stds.id);
  }

 } 
}

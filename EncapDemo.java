class Human
  {
    private String name;
    private int age;
    
    public int getAge()
    {
      return age;
    }
    public String getName()
    {
      return name;
    }
    public void setName(String name )
    {
      this.name = name;
    }
    public void setAge(int age )
    {
      this.age = age;
      // System.out.println(age);
    }
  }


public class EncapDemo
{
   public static void main(String[] args)
    {
      
    Human obj = new Human();

    obj.setAge(11);
    obj.setName("Seb");
    System.out.println(obj.getAge() +":"+ obj.getName());

    }
    
    
} 


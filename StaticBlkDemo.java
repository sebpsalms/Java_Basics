// Example of static Block

class Mobile {
  static String Brand;
  int Price;
  String model;
  static String item;

  static
  {
    item = "Phone";
  }

  public void Show()
  {
    System.out.println(item + " :" + Brand +" : " + Price + " : " + model);
  }
  public static void Show1(Mobile obj)
  {
    System.out.println(Brand ); // only Static variables can be print in static methods
  }
}


class StaticBlkDemo
{

public static void main(String[] a)
  {
    Mobile obj1 = new Mobile();
    Mobile obj2 = new Mobile();

    Mobile.Brand = "Realme"; // Static variables mentioning in class variable is most acceptable or it is a good practice 
    obj1.Price = 18000;
    obj1.model = "6i";

    Mobile.Brand = "Realme";
    obj2.Price = 19000;
    obj2.model = "7i";

    obj1.Show();
    Mobile.Show1(obj1); // Better to mention in class name 
  }

}
  


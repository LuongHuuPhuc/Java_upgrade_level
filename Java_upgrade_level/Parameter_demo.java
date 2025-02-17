class Person{
  String name;
  //Constructor
  Person(String name){
    this.name = name;
  }
}

public class Parameter_demo {
  public static void main(String[] args){
    //Truyen tham so theo kieu nguyen thuy (primitive type)
    int number = 10;
    modifyPrimitive(number);
    System.out.println("Gia tri sau khi goi ham (primitive): " + number); //Khong thay doi gia tri

    //Truyen tham so theo kieu doi tuong (reference type)
    int[] numbers = {1, 2, 3, 4, 5};
    modifyArray(numbers);
    System.out.println("Phan tu dau tien sau khi goi ham (array): " + numbers[1]); //Thay doi gia tri

    //Truyen tham so theo kieu doi tuong (object)
    Person person = new Person("Alice");
    System.out.println("Ten truoc khi goi ham (object): " + person.name);
    modifyObject(person);
    System.out.println("Ten sau khi goi ham (object): " + person.name); //Thay doi gia tri

    //Truyen nhieu tham so
    printInfo("Bob", 30);

    //Truyen so luong tham so khong co dinh (varargs)
    printNumbers(1, 4, 6, 2, 8);
  }

  //Ham thay doi gia tri cua tham so nguyen thuy (Khong thay doi gia tri ban dau)
  static void modifyPrimitive(int number){
    number += 5;
    System.out.println("So trong ham (primitive): " + number);
  }

  //Ham thay doi gia tri cua tham so mang (thay doi gia tri ban dau)
  static void modifyArray(int[] arr){
    arr[0] = 100;
  }

  //Ham thay doi gia tri cua tham so doi tuong (thay doi gia tri ban dau)
  static void modifyObject(Person p){
    p.name = "Bob";
  }

  //Ham truyen nhieu tham so 
  static void printInfo(String name, int age){
    System.out.println("Ten:" + name + ", Tuoi: " + age);
  }

  //Ham truyen so luong tham so khong co dinh (varargs)
  static void printNumbers(int... numbers){
    System.out.print("Danh sach so:");
    for(int num : numbers){
      System.out.print(num + " ");
    }
    System.out.println(); 
  }
}

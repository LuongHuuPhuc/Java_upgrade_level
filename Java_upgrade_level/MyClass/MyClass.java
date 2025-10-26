class ClassA{
  void showA(){
    System.out.println("Hello from ClassA");
  }
}

class ClassB{
  void showB(){
    System.out.println("Hello from ClassB");
  }
}

public class MyClass {
  public static void main(String[] args){
    ClassA a = new ClassA();
    ClassB b = new ClassB();

    a.showA();
    b.showB();
  }
}

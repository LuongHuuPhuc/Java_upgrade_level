class Math_calculator{
  int n1, n2, n3; //Khai bao bien toan cuc trong class

  //Constructor (Ham khoi tao) khong duoc de trong 1 method khac 
  Math_calculator(int n1, int n2, int n3){
    this.n1 = n1;
    this.n2 = n2;
    this.n3 = n3;
  }

  int max_number(){
    return Math.max(n1, n2);
  }

  int min_number(){
    return Math.min(n1, n2);
  }

  float sqrt_number(){
    return (float)Math.sqrt(n1);
  }

  int abs_number(){
    return Math.abs(n3);
  }
}

public class Number {
  public static void main(String[] args){
    int x = 10;
    int y = 20;
    int z = 30;
    byte a = 100; //-128 to 127
    short b = 1000; //-32768 to 32767
    long c = 1000000000l; //-9223372036854775808 to 9223372036854775807
    float d = 10.5f; //6 to 7 decimal digits
    double e = 22.9d; //15 decimal digits
    char f = 'A'; //0 to 65535
    boolean g = true; //True or False
    float narrow_casting = (float) (a / y * 10);
    Math_calculator math = new Math_calculator(10, 20, -47); 

    System.out.println(x + y + z);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(narrow_casting);
    System.out.println(math.max_number());
    System.out.println(math.min_number());
    System.out.println(math.sqrt_number());
    System.out.println(math.abs_number());
  } 
}

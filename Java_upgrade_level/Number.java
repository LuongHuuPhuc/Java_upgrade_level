public class Number {
  public static void main(String[] args){
    int x = 10;
    int y = 20;
    int z = 30;
    byte a = 100; //-128 to 127
    short b = 1000; //-32768 to 32767
    long c = 1000000000; //-9223372036854775808 to 9223372036854775807
    float d = 10.5f; //6 to 7 decimal digits
    double e = 22.9d; //15 decimal digits
    char f = 'A'; //0 to 65535
    boolean g = true; //True or False
    float narrow_casting = (float) (a / y * 10);
    System.out.println(x + y + z);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(narrow_casting);
  } 
}

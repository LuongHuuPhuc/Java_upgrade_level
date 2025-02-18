class Nested_loop{
  Nested_loop(int n){
    System.out.println("This is a nested loop with " + n + "rows");
  }
  int loopp(int n){
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n - i - 1; j++){
        System.out.print(n + " ");
      }
      System.out.println();
    }
    return n;
  }
}

public class Loop_check{
  public static void main(String[] args){
    int i = 0;
    int count_down = 30;
    int numb = 15;
    Nested_loop nl = new Nested_loop(numb);
    nl.loopp(numb);

    while(i < 10){
      System.out.println("Hello World");
      System.out.println("Count down before:" + count_down);
      i++;
      count_down--; //Sau khi in 1 lan Hello World thi giam count_down di 1
      for(int k = 20; k > 0; k--){
        System.out.println("Count down:" + k);
      }
    }
    do {
      System.out.println("Good morning");
      i++;
    }while(i < 20);
  }
}

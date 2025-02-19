import java.util.Scanner;

class Basic_multiple{
  int num1, num2;
  
  //Constructor(Ham khoi tao)
  Basic_multiple(int num1, int num2){
    this.num1 = num1;
    this.num2 = num2;
    System.out.println("Number 1: " + num1 + " and Number 2: " + num2);
  }

  //Method nhan num1 voi num2 trong vong lap
  public void Multiple_func(){
    System.out.println("Bang nhan cua " + num1 + " voi so tu 0 den " + num2 + ": ");
    for(int i = 0; i <= num2; i++){
      System.out.println(num1 + " x " + i + " = " + num1 * i);
    }
  }
}
public class Multiple_number{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);  
    while(true){
      System.out.println("Nhap so can nhan (nhap so 0 de out): ");
      int x = scanner.nextInt();
      System.out.println("Nhap so gioi han nhan (nhap so 0 de out): ");
      int y = scanner.nextInt();
      Basic_multiple new_num = new Basic_multiple(x, y); //Tao doi tuong moi

      if(x == 0 || y == 0){
        System.out.println("Hahahaha ban da nhap so 0, bye bye !");
        break;
      }
      new_num.Multiple_func();
    }
    scanner.close();
  }
}
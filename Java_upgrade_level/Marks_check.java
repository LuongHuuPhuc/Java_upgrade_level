import java.util.Scanner;

public class Marks_check{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); //Tao doi tuong scanner
    while(true){
      System.out.println("Nhap diem cua ban:");
      int marks = scanner.nextInt(); //De ben trong de vong lap hien thi ket qua dung 1 lan 

      if(marks < 0){
        System.out.println("Da thoat chuong trinh !");
        break;
      }

      if(marks < 0 || marks > 100){
        System.out.println("Diem cua ban khong hop le !, Vui long nhap lai...");
        continue;
      }

      //Kiem tra diem xep loai
      if(marks < 50){
        System.out.println("Chuc mung! Ban da truot mon nay !");
      }else if(marks >= 50 && marks < 60){
        System.out.println("Ban da dat diem trung binh !");
      }else if(marks >= 60 && marks < 75){
        System.out.println("Ban da dat diem kha !");
      }else if(marks >= 75 && marks < 90){
        System.out.println("Ban da dat diem gioi !");
      }else if(marks >= 90 && marks <= 100){
        System.out.println("Ban da dat diem xuat sac !");
      }
    } 
    scanner.close(); //Dong scanner tranh ro ri tai nguyen 
  }
}
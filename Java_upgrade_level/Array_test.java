import java.util.Scanner;

public class Array_test {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhap so phan tu cua mang: ");
    int size =  sc.nextInt();

    //Tao mang voi kich thuoc vua nhap
    int[] arr = new int[size]; //Mang dong

    //Nhap gia tri cho mang 
    System.out.println("Nhap cac gia tri cho mang: ");
    for(int i = 0; i < size; i++){
      System.out.print("Phan tu thu " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
      System.out.println();
    }


    //In mang ra man hinh
    System.out.println("Mang truoc khi thay doi la: ");
    for(int i : arr){ //Vong lap for-each, duyet qua tung phan tu cua mang  
      System.out.print(i + " " );
    }
    System.out.println();

    System.out.print("Nhap gia tri bat dau: ");
    int num = sc.nextInt();

    for(int j = 0; j < size; j++){
      arr[j] = num;
      ++num;  
    }

    System.out.println("\nMang sau khi da thay doi la: ");
    for(int j : arr){
      System.out.print(j + " ");
    }
    sc.close();
  }
}

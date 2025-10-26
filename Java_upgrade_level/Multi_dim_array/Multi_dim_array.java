import java.util.Scanner;

class Array_check{
  private int[][] array; //Mang 2 chieu
  private int rows, cols; //Kich thuoc mang

  //Constructor(Ham khoi tao)
  public Array_check(int rows, int cols){
    this.rows = rows;
    this.cols = cols;
    array = new int[rows][cols];
  }

  //Ham nhap gia tri vao mang
  public void inputArr(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap gia tri cho mang " + rows + "hang, " + cols + " cot: ");
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        System.out.print("Phan tu [" + i + "][" + j + "]");
        array[i][j] = scanner.nextInt();
      }
    }
  }

  /**
   * @Ham thay doi gia tri
   * @param row Vi tri hang can thay doi
   * @param col Vi tri cot can thay doi
   * @param newVal Gia tri thay vao
   */
  public void update_Value(int row, int col, int newVal){
    if(row >= 0 && row < rows && col >= 0 && col < cols){
      array[row][col] = newVal;
    }else{
      System.out.println("Vi tri khong hop le !");
    }
  }

  //Ham in ra man hinh
  public void printArr(){
    System.out.println("Mang hien tai: ");
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}

public class Multi_dim_array {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    //Nhap kich thuoc mang tu nguoi dung 
    System.out.print("Nhap so hang: ");
    int rows = scanner.nextInt();
    System.out.print("Nhap so cot: ");
    int cols = scanner.nextInt();

    //Tao object
    Array_check myArr = new Array_check(rows, cols);

    //Nhap gia tri cho mang
    myArr.inputArr();

    //In mang ra man hinh
    System.out.println("Mang truoc khi chinh sua: ");
    myArr.printArr();

    int choice;
    do { 
      System.out.println("Ban co muon chinh sua mang khong ?");
      System.out.println("1. Khong (tiep tuc vong lap)");
      System.out.println("2. Co (chinh sua gia tri)");
      System.out.println("3. Thoat chuong trinh ");

      choice = scanner.nextInt();
      switch(choice){
        case 1: 
        System.out.println("Khong co thay doi nao, tiep tuc...");
        break;

        case 2: 
        System.out.println("Nhap vi tri hang: ");
        int row = scanner.nextInt();
        System.out.println("Nhap vi tri cot: ");
        int col = scanner.nextInt();
        System.out.println("Nhap gia tri can thay vao: ");
        int val = scanner.nextInt();

        myArr.update_Value(row, col, val);
        myArr.printArr();
        break;

        case 3:
        System.out.println("Chuong trinh ket thuc ");
        break;

        default: 
        System.out.println("Lua chon khong hop le, vui long chon lai !");
      }
    } while(choice != 3);
    scanner.close();
  }
  
}

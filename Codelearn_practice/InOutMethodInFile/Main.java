/**
 * Note:
 * 
 * Trong moi file .java chi duoc phep toi da 1 class public
 * Cac method luon phai nam trong class
 * 
 * Binh thuong, method va bien thuoc ve object -> Can phai `new` ra thi moi dung duoc
 * Con khi khai bao `static`, no se thuoc ve class, dung duoc ma khong can tao object
 */

import java.util.Scanner;

class Input {
    // Method 1
    public static String[] inputInfo(){
        Scanner sc = new Scanner(System.in);
        String[] data = new String[8]; // Mang luu du lieu tam

        System.out.println("Nhap string: \n");
        System.out.println("Ho ten: ");
        data[0] = sc.nextLine();
        System.out.println("Dia chi: ");
        data[1] = sc.nextLine();

        System.out.println("\nNhap so kieu byte: ");
        System.out.println("a = ");       
        data[2] = Byte.toString(sc.nextByte());
        System.out.println("b = ");
        data[3] = Byte.toString(sc.nextByte());

        System.out.println("\nNhap so kieu int: ");
        System.out.println("x = ");
        data[4] = Integer.toString(sc.nextInt());
        System.out.println("y = ");
        data[5] = Integer.toString(sc.nextInt());

        System.out.println("\nNhap so kieu short: ");
        System.out.println("Length = ");
        data[6] = Short.toString(sc.nextShort());
        System.out.println("Width = ");
        data[7] = Short.toString(sc.nextShort());

        sc.close();
        return data; // Tra ve mang du lieu
    }

    // Method 2
    protected void classIntroduce(){
        System.out.println("This method is from " + getClass().getName() + " and private !");
        // getClass().getName() chi dung cho non-static method (co object)
        // Neu muon in ra ten class trong static method thi nen dung `ClassName.class.getName()`
    }
}

// Class thu 2 cung file (khong public)
class Print extends Input {
    // In ra du lieu String
    public static void printStringInfo(String name, String address){
        System.out.println("----- Thong tin chuoi -----");
        System.out.println("Ho ten: " + name);
        System.out.println("Dia chi: " + address);
    }

    public static void printNumberInfo(byte a, byte b, int x, int y, short length, short width){
        System.out.println("----- Thon ti so -----");
        System.out.println("Byte a = " + a + ", b = " + b);
        System.out.println("Int x = " + x + ", y = " + y);
        System.out.println("Short length = " + length + ", width = " + width);
    }

    // Ham ke thua tu Input (Ke thua thi khong de private duoc)
    @Override // annotation giup compiler kiem tra ban dang override dung
    protected void classIntroduce(){
        System.out.println("This method is from " + getClass().getName() + " and private !");
    }
}

// Public class duy nhat - cac class khac khong duoc public
public class Main {
    public static void main(String[] args){
        // Goi method static trong class Input de nhap du lieu
        String[] data = Input.inputInfo();

        String name = data[0];
        String address = data[1];
        byte a = Byte.parseByte(data[2]);
        byte b = Byte.parseByte(data[3]);
        int x = Integer.parseInt(data[4]);
        int y = Integer.parseInt(data[5]);
        short length = Short.parseShort(data[6]);
        short width = Short.parseShort(data[7]);

        // Goi method static trong class Print de in thong tin ra
        Print.printStringInfo(name, address);
        Print.printNumberInfo(a, b, x, y, length, width);

        // Tao object de goi method non-static
        Print p = new Print();
        p.classIntroduce(); // goi ham override cua class con
    }
}
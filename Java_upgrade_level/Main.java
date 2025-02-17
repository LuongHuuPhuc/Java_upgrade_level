//Class nao public thi class do la ten file do
//Chi duoc 1 class public trong 1 file
public class Main {
  public static void main(String[] args){
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String txt1 = "Please locate where 'locate' occurs !";
    String txt2 = "We are the so-called \"Vikings\" from the north."; //\ + ky tu de tranh bi nham
    System.out.println("Do dai cua chuoi la: " + txt.length());
    System.out.println(txt.toLowerCase());
    System.out.println(txt1.indexOf("locate")); //Tim ky tu dau tien cua chuoi
    System.out.println(txt2);
  }
}
 
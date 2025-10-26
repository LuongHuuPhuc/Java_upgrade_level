# Java Upgrade Level
```
System.out.println("Hello Java !);
```
***
**This repository is where i update my Java learning process 🥸**

# Tổng quan cấu trúc chương trình Java
- Trong java, mọi mã nguồn đều nằm trong **class**, và các lớp được tổ chức theo **package**. Mỗi file `.java` thường chứa nhiều class nhưng chỉ được duy nhất một class **public** trùng với tên file. Nếu class public ấy không trùng với tên file thì sẽ bị lỗi biên dịch. 

- Trường hợp không có class nào **public** thì tệp có thể có tên tùy ý và phương thức `main` có thể nằm trong bất kỳ lớp nào.

- Một chương trình Java luôn bắt đầu thực thi từ phương thức đặc biệt `main`:
```java
public static void main(String[] args)
```

## 1. Cấu trúc cơ bản của 1 file Java
```java
package myproject.core; // Khai bao package (thu muc logic)

import java.util.Scanner; // Import thu vien ben ngoai (neu can)

public class Main { // Lop chinh thuc (public class) ten file cung phai cung ten 
    // Bien thanh vien (field)
    private String name;
    public static int count = 0;

    // Constructor (Ham khoi tao)
    public Main(String name){
        this.name = name;
        count++;
    }

    // Static Method (Phuong thuc tinh)
    public static void showCount(){
        System.out.println("Tong so doi tuong: " + count);
    }

    // Non-static Method (Phuong thuc thong thuong)
    private void introduce(){
        System.out.println("Xin chao, toi la " + name);
    }

    // Ham main - diem bat dau chuong trinh
    public static void main(String[] args){
        Main a = new Main("Java"); // Khoi tao object 
        Main b = new Main("OOP");

        // Su dung cac method trong class Main
        a.introduce(); 
        b.introduce();
        Main.showCount(); // Goi static method ma khong can tao object
    }
}
```
## 2. Package 
- Là cách nhóm các class có liên quan vào cùng một không gian tên (namespace)
- Mỗi package thường tương ứng với một thư mục trong project 
- Ví dụ:
```css
src/
└── myproject/
    ├── core/
    │   └── Main.java
    └── utils/
        └── MathUtils.java
```

## 3. Modifier (Phạm vi truy cập)
|Modifier | Phạm vi truy cập | Ý nghĩa | 
|---------|------------------|---------|
|`public`| Mọi nơi (toàn project) |Dùng cho class, method, hoặc biến muốn truy cập từ bất kỳ đâu|
|`protected`|Trong class + subclass | Thường dùng trong kế thừa|
|`private`| Trong cùng class | Dùng cho biến, method nội bộ, không muốn lộ ra ngoài|
|(default) (Không ghi gì)| Trong cùng package |Dùng cho các thành phần chỉ chia sẻ nội bộ|

## 4. `static` - thuộc về class, không thuộc về object
- `static` cho phép gọi **mà không cần tạo object**
- Thường dùng cho: 
    - Hàm tiện ích (utility functions)
    - Biến đếm chung (`count`, `PI`,...)
- Ví dụ:
```java
Math.sqrt(4);     // Hàm static trong class Math
Main.showCount(); // Gọi method static mà không cần tạo object
```

## 5. Quy ước chung khi viết chương trình Java
- Mỗi class -> 1 file `.java` (trừ các class nhỏ, phụ trợ có thể để chung file)
- Tên file phải trùng tên với class `public`
- Tên class viết hoa chữ cái đầu ( `Main`, `StudentManager`)
- Tên method và biến viết kiểu camelCase (`getName`, `totalScore`)
- Giữ `main()` làm điểm vào duy nhất để chạy chương trình

## 6. Luồng thực thi chương trình Java
1. JVM đọc file `.class` (được biên dịch từ `.java`)
2. Tìm class có `public static void main(String[] args)`
3. Gọi hàm `main()` để bắt đầu thực thi chương trình 
4. Các method và class khác được gọi tùy theo luồng chương trình
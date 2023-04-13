
package lab8;

import java.util.Scanner;


public class sp2 extends sanpham {
    @Override
public void nhap(){
Scanner sc = new Scanner(System.in);
System.out.println("Nhập tên sp: ");
tensp=sc.nextLine();
System.out.println("Nhập đơn giá: ");
donGia=sc.nextDouble();
System.out.println("Nhập giảm giá: ");
giamgia= sc.nextDouble();
}
}

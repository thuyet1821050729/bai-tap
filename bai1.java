package baitap10_03;
import java.util.Scanner;
import java.util.Math;


		
	
class DIEM {
	int x;
    int y;
    int y1;
    int x1;
    float kc;
    float dt;
	Scanner sc;
	
	void nhap(){
		System.out.println("nhap vao toa do x");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println("nhap vao toa do x");
		y = sc.nextInt();
		
	}
	void xuat() {
		System.out.printf("toa do cua diem la A(%d,%d)"+x,+y);
		
	}
	void toadoddx() {
		y1=-y;
		x1=x;
		System.out.println("toa do diem doi xung la ("+x1+","+y1+")");
		
	}
	float kcg2d() {
		kc= (float)Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
		return kc;
		
	}
	float dttg() {
		dt = 1/2 * kc * y;
		return dt;
	}
	
}
public class bai1 {
	public static void main(String[] args) {
		 DIEM diem = new DIEM();
		 diem.nhap();
		 diem.xuat();
		 diem.kcg2d();
		 diem.dttg();
		 
		 
		 
		 
	}
}


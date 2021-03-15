package baitap10_03;
import java.util.Scanner;

public class bai2 {
	 public static void main(String[] args){
	        ThoiGian tg = new ThoiGian();
	        tg.hamTao(0,0,0);
	        tg.nhap();
	        tg.xuat();
	        tg.hamchuyen();
	    }
	}
	class ThoiGian{
	   
	    private int gio, phut, giay;
	 
	    int second;
	   
	    public void hamTao(int gio, int phut, int giay){
	    this.gio = gio;
	    this.phut = phut;
	    this.giay = giay;        
	    }
	   
	    void nhap(){
	        Scanner scan = new Scanner(System.in);
	      
	        System.out.println("Nhap gio:");
	    
	        System.out.println("Nhap phut:");
	        phut = scan.nextInt();
	       
	        System.out.println("Nhap giay: ");
	        giay = scan.nextInt();
	    }
	     void xuat(){
	        System.out.println("Gia  tri thoi gian: "+gio+" giờ, "+phut+ " phút, "+giay+" giây" );
	    }
	  
	    void hamchuyen(){
	        second = gio*3600 + phut*60 +giay;
	        System.out.println("Chuyển đổi giá trị thời gian " +gio+" giờ, " +phut+" phút, "+giay+ "giây ra giây là:"+second+" giây");
	    }
	   
	}   




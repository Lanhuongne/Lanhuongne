package baitapfor;
import java.util.Scanner;
public class for5 {
	public static void main(String[] args) {
		Scanner sr= new Scanner(System.in);
		System.out.println("Nhap so can kiem tra:");
		int value = sr.nextInt();
		int count = 0;
		for (int i=2;i<value-1;i++) {
			if (value%i==0)
			{   System.out.println("Khong phai so nguyen to");
				System.out.println("Ngoài ra còn có ước số là:"+i);
				count++;}
			
			else {System.out.println("So nguyen to");}
			break;
			
			
		}
		
		}
	}



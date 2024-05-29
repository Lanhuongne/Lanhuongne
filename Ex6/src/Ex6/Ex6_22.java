package Ex6;
import java.util.Scanner;

public class Ex6_22 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0,number;
		do {System.out.println("テストの点数を入力してください。");
			number=sc.nextInt();
			sum+=number;
		if (number==0) 
				break;} 
		while (number>=0);
			System.out.println("テストの合計点は"+sum+"点です。");
			sc.close();
			
	}
	}

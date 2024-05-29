package Ex6;

import java.util.Scanner;

public class Ex6_2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int sum=0,number;
		for (number=1;number<100;number++)
		{System.out.println("テストの点数を入力してください。");
			number= scanner.nextInt();
			sum=number+sum;
		if (number==0)
		break;}
		System.out.println("テストの合計点は"+sum+"点です。");
		scanner.close();
		}}

package hust.soict.hedspi.lab01;
import java.util.Scanner;
public class StarTriangle {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Nhap n: ");
		 int n = scanner.nextInt();
		 for (int i = 0; i < n; i++) {
			 for (int k = 0; k < n - i - 1; k++)
				 System.out.print(" ");
			 for (int j = 0; j < 2*i + 1; j++) {
				 
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
 	}
}

import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int side = in.nextInt();
      int area_of_square= side*side;
     
      System.out.println(area_of_square);
	}
}
public class RightTriangle 
{
	public static void main(String[] args) 
	{

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println((a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) && (a == Math.abs(a) && b == Math.abs(b) && c == Math.abs(c)) && (a != 0 && b != 0 && c != 0) && (a != b && b != a && c != b));
	}
}
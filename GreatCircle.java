public class GreatCircle {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d = Double.parseDouble(args[3]);

		double r = 6371.0;
		
		double x1 = Math.toRadians(a);
		double y1 = Math.toRadians(b);
		double x2 = Math.toRadians(c);
		double y2 = Math.toRadians(d);
		
		double arg1 = Math.pow(Math.sin((x2 - x1)/2), 2);
		double arg2 = Math.pow(Math.sin((y2 - y1)/2), 2);
		double arg3 = Math.cos(x1)*Math.cos(x2);
		
		double arg4 = arg3*arg2;
		
		
		double distance = 2*r*Math.asin(Math.sqrt(arg1 + arg4));
		
		
		System.out.println(distance+" "+"kilometers");
		 }	 
	
}

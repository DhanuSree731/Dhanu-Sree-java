package open;

public class Casting1 {
public static void main(String[] args) {
	byte b;
	int i=267;
	double d=323.123;
	System.out.println("\n Conversion of int to byte.");
	b=(byte)i;
	System.out.println("i and b" + i + " " + b);
	System.out.println("\\n Conversion of double to int.");
	i=(int)d;
	System.out.println("d and i" + d + " " + i);
	System.out.println("\\n Conversion of double to byte.");
	b=(byte)d;
	System.out.println("d and b" + d + " " + b);
}
}

package open;
import java.io.*;
public class Narrow1 {
public static void main(String [] args) {
	double d = 100.2554;
	short j = (short)d;
	int k = (int)d;
	System.out.println("Original Value before Casting: " + d);
	System.out.println("After Type casting to short: " + j);
	System.out.println("After Type casting to int: " + k);
}
}

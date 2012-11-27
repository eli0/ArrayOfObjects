// ArrayOfObjects.java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayOfObjects
{
    public static void main (String args[]) throws FileNotFoundException
    {
	final int ARRAY_SIZE = 19;
	File inputFile = new File ("elements.txt");

	ArrayElement elements = new ArrayElement(ARRAY_SIZE);
       	
	// Read assigned file
	try {
	    Scanner input = new Scanner (inputFile);
	    
	    while (input.hasNext())
		{
		    String name = input.next();
		    String shortcut = input.next();
		    double  weight = input.nextDouble();
		    boolean metalloid = input.nextBoolean();
		    int placeInTable = input.nextInt();
		    elements.addElement(new Element (name, shortcut, weight, metalloid, placeInTable));
		}
	   input.close();
	} catch (FileNotFoundException e) {
		System.out.println ("Something went wrong with your file!");
	    }
	
        elements.reversePrint();
	System.out.println("\nThe average of elements weight is: " + elements.getAverage());
    }
}

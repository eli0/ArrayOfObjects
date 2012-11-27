// Collection class that contains element objects

public class ArrayElement
{
    // Stores elements
    private Element[] objArray;
    private int counter;

    // Constructor for element objects in collection class
    public ArrayElement(int size)
    {
	objArray = new Element[size];
	   
    }

    // method to add item into collection
    public void addElement(Element n)
    {
	objArray[counter] = n;
	counter++;
    }

    // method to print result in reverso order, skipping empty spaces in array
     public void reversePrint()
     {
	System.out.print ("Name:" + "\t\t" + "Shortcut:" + "    \t" + "Weight:" + "    \t" + "Is metalloid:" + " \t" + "Table ID:\n" );
 	for (int i = counter - 1; i >= 0; i--)
	    {
		System.out.print (objArray[i].getName() + "    \t" + objArray[i].getShortcut() + "  \t\t" + objArray[i].getWeight() + "    \t" + objArray[i].isMetalloid() + "    \t" + objArray[i].getPlaceInTable() + "\n");
	    }
     }

    // method to get elements weight average
    public double getAverage()
    {
	double total = 0;
	double average = 0;
	for (int i = 0; i < counter; i++)
	    {
		total = objArray[i].getWeight() + total;
	    }
	average = total / (counter - 1);
	return average;
    }
}

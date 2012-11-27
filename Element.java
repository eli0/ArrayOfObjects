// Element class definition

public class Element
{
    // An element's details: name of element, weight, 
    // atomic weight, is metaloid or not, number in periodic table
    private String name;
    private String shortcut;
    private double weight;
    private boolean metalloid;
    private int placeInTable;

    // Element constructor initialises each variable
    public Element (String nameIn, String shortcutIn, double weightIn, boolean metalloidIn, int placeInTableIn)
    {
	name = nameIn;
	shortcut = shortcutIn;
	weight = weightIn;
	metalloid = metalloidIn;
	placeInTable = placeInTableIn;
    }

    // Return an element's name
    public String getName()
    {
	return name;
    }

    // Return an element's shortcut;
    public String getShortcut()
    {
	return shortcut;
    }

    // Return an element's weight
    public double getWeight()
    {
	return weight;
    }

    // Return if an element is metalloid
    public boolean isMetalloid()
    {
	return metalloid;
    }
    
    // Return elemnt's place in periodic table
    public int getPlaceInTable()
    {
	return placeInTable;
    }
} // end of class Element

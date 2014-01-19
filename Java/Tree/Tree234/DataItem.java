package Tree234;

import java.io.*; // for I/O
import java.lang.Integer; // for parseInt()
////////////////////////////////////////////////////////////////

class DataItem {
	public double dData; // one data item
	// -------------------------------------------------------------

	public DataItem(double dd) // constructor
	{
		dData = dd;
	}

	// -------------------------------------------------------------
	public void displayItem() // display item, format "/27"
	{
		System.out.print("/" + dData);
	}
	// -------------------------------------------------------------
} // end class DataItem

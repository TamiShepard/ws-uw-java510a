package edu.uw.java510a;

/**
 * This is the driver class that will run the interactive Utils class
 * @author Caleb Burke
 * 
 */
class UtilsInteractiveDriver
{
	/**
	 * Main method
	 * @param args
	 */
    public static void main(String[] args)
    {
        try
        {
            while ( true )
            {
                int num = Utils.askInt( 5, 10 );
                System.out.println( num );
            }
        }
        catch ( OpCanceledException exc ) { }
    }
}

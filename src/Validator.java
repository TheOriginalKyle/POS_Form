public class Validator
{

	// TODO - CODE THE VALIDATOR
	// add the method that will validate all the input
	// collected from the form

	// static variable to hold any error that occurs
	private static String errorMessage = "";

	public static String getOrderID(String anID)
	{
		// run the validation
		// add any errors to the error message
		if (anID.length() == 0)
		{
			errorMessage += "Order ID cannot be blank\n";
		}
		return anID;
	}

	public static String getFirstName(String aFirstName)
	{
		if (aFirstName.length() == 0)
		{
			errorMessage += "First Name cannot be blank\n";
		}
		return aFirstName;
	}

	// method to return the error message
	public static String getError()
	{
		return errorMessage;
	}

	// method to clear the error message
	public static void clearError()
	{
		errorMessage = "";
	}

}

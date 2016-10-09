package Tax;

public class FairTaxTest {
	// main method begins program execution
	public static void main(String[] args)
	{
	   // Instantiate the fair tax object
	   FairTax myExpenses = new FairTax();
	   
	   // Define all the expenses
	   myExpenses.inputExpense();
	   
	   // Show the taxation chart
	   myExpenses.ShowTaxation();
	}
}

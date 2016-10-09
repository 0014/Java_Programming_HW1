package Tax;

public class FairTaxTest {
	// main method begins program execution
	public static void main(String[] args)
	{
	   // Instantiate the fair tax object
	   FairTax myExpenses = new FairTax();
	   
	   // Define all the expenses
	   myExpenses.setClothingExpense(100);
	   myExpenses.setEducationExpense(200);
	   myExpenses.setFoodExpense(300);
	   myExpenses.setHealthExpense(400);
	   myExpenses.setHousingExpense(500);
	   myExpenses.setTransportationExpense(600);
	   myExpenses.setVacationExpense(1000);
	   
	   // Show the taxation chart
	   myExpenses.ShowTaxation();
	}
}

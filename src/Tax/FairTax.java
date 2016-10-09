package Tax;

/* Here is the confusing part of the question.
 * Source: http://fairtax.org/faq
 * 
 * 30 percent. This issue is often confusing, so we explain more here.
 *
 * When income tax rates are quoted, economists call that a tax-inclusive quote: 
 * “I paid 23 percent last year.” For every $100 earned, $23 went to Uncle Sam. 
 * Or, “I had to make $130 to have $100 to spend.” That’s a 23-percent tax-inclusive rate.
 *
 * We choose to compare the FairTax to income taxes, quoting the rate the same way, 
 * because the FairTax replaces such taxes. That rate is 23 percent.
 *
 * Sales taxes, on the other hand, are generally quoted tax exclusive: 
 * “I bought a $77 shirt and had to pay that same $23 in sales tax.” 
 * This is a 30-percent sales tax. Or, “I spent a dollar, 77¢ for the product and 23¢ in tax.” 
 * This rate, when programmed into a point-of-purchase terminal, is 30 percent.
 *
 * Note that no matter which way it is quoted, the amount of tax is the same. 
 * Under an income tax rate of 23 percent, you have to earn $130 to spend $100.
 *
 * Spend that same $100 under a sales tax, 
 * you pay that same tax of $30, and the rate is quoted as 30 percent.
 *
 * Perhaps the biggest difference between the two is that under the income tax, 
 * controlling the amount of tax you pay is a complex nightmare. Under the FairTax, 
 * you may simply choose not to spend, or to spend less.
 */

public class FairTax 
{
	// enum type with constants that represent the expense type
	private enum ExpenseType {HOUSING, FOOD, CLOTHING, TRANSPORTATION, EDUCATION, HEALTH, VACATION};
	
	private float[] expenses;
	
	public FairTax()
	{
		// this will instantiate the array with initial values of 0
		expenses = new float[ExpenseType.values().length];
	}
	// method to set the housing expense
	public void setHousingExpense(float expense)
	{
	   this.expenses[ExpenseType.HOUSING.ordinal()] = expense;
	} 
	
	// method to retrieve the housing expense
	public float getHousingExpense()
	{
	   return expenses[ExpenseType.HOUSING.ordinal()];
	}
	
	// method to set the food expense
	public void setFoodExpense(float expense)
	{
	   this.expenses[ExpenseType.FOOD.ordinal()] = expense;
	} 
	
	// method to retrieve the food expense
	public float getFoodExpense()
	{
	   return expenses[ExpenseType.FOOD.ordinal()];
	}
	
	// method to set the clothing expense
	public void setClothingExpense(float expense)
	{
	   this.expenses[ExpenseType.CLOTHING.ordinal()] = expense;
	} 
	
	// method to retrieve the clothing expense
	public float getClothingExpense()
	{
	   return expenses[ExpenseType.CLOTHING.ordinal()];
	}
	
	// method to set the transportation expense
	public void setTransportationExpense(float expense)
	{
	   this.expenses[ExpenseType.TRANSPORTATION.ordinal()] = expense;
	} 
	
	// method to retrieve the transportation expense
	public float getTransportationExpense()
	{
	   return expenses[ExpenseType.TRANSPORTATION.ordinal()];
	}
	
	// method to set the education expense
	public void setEducationExpense(float expense)
	{
	   this.expenses[ExpenseType.EDUCATION.ordinal()] = expense;
	} 
	
	// method to retrieve the education expense
	public float getEducationExpense()
	{
	   return expenses[ExpenseType.EDUCATION.ordinal()];
	}
	
	// method to set the health expense
	public void setHealthExpense(float expense)
	{
	   this.expenses[ExpenseType.HEALTH.ordinal()] = expense;
	} 
	
	// method to retrieve the health expense
	public float getHealthExpense()
	{
	   return expenses[ExpenseType.HEALTH.ordinal()];
	}
	
	// method to set the vacation expense
	public void setVacationExpense(float expense)
	{
	   this.expenses[ExpenseType.VACATION.ordinal()] = expense;
	} 
	
	// method to retrieve the vacation expense
	public float getVacationExpense()
	{
	   return expenses[ExpenseType.VACATION.ordinal()];
	}
	
	public void ShowTaxation()
	{
		System.out.printf("%-17s%-13s%-13s%n", "Expense Type", "Real Value", "Fair-Tax Rate");
		
		for(int i = 0; i < expenses.length; i++)
			CalculateTaxation(expenses[i], i);
	}
	
	// for every dollar spent, the FairTax value will be .23 dollar (23% comes from here)
	// in other words for every .77 dollar we pay .23 dollar (30% comes from here)
	private void CalculateTaxation(float expense, int expenseTypeIndex)
	{
		//the expense value already includes the tax 
		//therefore just take %23 to calculate tax
		float fairTax = expense * 23 / 100;
		float realValue = expense - fairTax;
		
		//print out the calculated values
		System.out.printf("%-17s%-13.2f%-13.2f%n", ExpenseType.values()[expenseTypeIndex].toString() ,realValue , fairTax);
	}
}

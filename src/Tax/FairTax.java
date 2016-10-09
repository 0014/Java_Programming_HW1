package Tax;

import java.util.Scanner;

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
	
    public void inputExpense() 
    {
    	// define a scanner
        Scanner input = new Scanner(System.in);
        
        // ask for user to enter the values for each category
        for(int i = 0; i < ExpenseType.values().length; i++)
        {
        	System.out.printf("Please input the %s expense:", ExpenseType.values()[i].toString());
        	expenses[i] = input.nextFloat();
        }
        //close the scanner after its done
        input.close();
    }

    //show the tax chart
	public void ShowTaxation()
	{
		System.out.printf("%n%-17s%-13s%-13s%n", "Expense Type", "Real Value", "Fair-Tax Rate");

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
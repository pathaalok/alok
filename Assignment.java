/**                          Application of java coding standards and conventions
*
*    this mainly invoves some of the variables,methods and classes which represent the standards and conventions
*    of pragramming
*
*	some of the methods are sum of 2 numbers,subtraction of 2 numbers, even numbers & odd numbers between 1 to 100
*   and area of circle
*/

class SuperMethod													//super class
{
    int variableOne;
	int variableTwo;

	public int sumMethod(int variableOne, int variableTwo )				// this method is used to add two integers and return a value
		{
			variableOne=variableOne;
			variableTwo=variableTwo;
			int sum= variableOne + variableTwo;					     // main implementation of sum
			return sum;
		}
}


class MethodsOfAssignment extends SuperMethod						//Sub class
{		
	int variableOne;
	int variableTwo;
	private   final float PIE_VALUE=3.14f;							//constant value

	public MethodsOfAssignment()									//constructor							
		{
			System.out.println("outputs of the progrsm are as follows");	
		}


	public int subtractionMethod(int variableOne, int variableTwo )		// this method is used to subtract two integers and return a value*/
		{
			this.variableOne=variableOne;
			this.variableTwo=variableTwo;
			int sub= variableOne - variableTwo;					// main implementation of  subtraction
			return sub;
		}


	public void evenNumbers()												// this method is used to print even numbers
		{  
		  System.out.println("Even numbers between 1 to 100 are ");

			 for (int i=0;i<=100 ;i++ )								// main implementation of evennumbers
			 {

				 if(i%2==0)
				 {  
					 System.out.print(i);
					 System.out.print(" ");
				 }

			 }
		 System.out.println();
		}


	public void oddNumbers()												// this method is used to print odd numbers
		{
		  System.out.println("Odd numbers between 1 to 100 are ");

			for (int i=0;i<=100 ;i++ )								// main implementation of oddnumbers
			{

					if(i%2!=0)
					{  
						System.out.print(i);
						System.out.print(" ");
				    }

			}
		  System.out.println();
		}

			
	void areaOfCircle(int radius)									// this method is use to cal area of circle
		{

			float areaOfCircle=(PIE_VALUE*radius *radius);
			System.out.println("Area of Circle of Radius "+radius+"is"+areaOfCircle);

		}
	
}



public class Assignment
{
	public static void main(String[] args) 
	{
		MethodsOfAssignment obj = new MethodsOfAssignment();			 // object creation for class MethodOfAssignment
		
		int sumOfTwoNumbers=obj.sumMethod(10,20);					// calling to sumMethod 
		System.out.println("sum of two given numbers is "+ sumOfTwoNumbers);

		int subOfTwoNumbers=obj.subtractionMethod(30,15);			 // calling to SubtractionMethod 
		System.out.println("subtraction of two given numbers is "+ subOfTwoNumbers);

		obj.evenNumbers();												// calling to evennumber method

		obj.oddNumbers();												// calling to oddnumber method

		obj.areaOfCircle(5);											// calling to area of cicle method
	}
}

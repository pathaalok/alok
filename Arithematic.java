/**		Examples of the oops Assignment
*	this program include all the examples which are asked to do in theory questions
*
*such as inheritance , polymorphism, interface & abstraction
*
 testing the file
*/

interface  Methods
{
 void sum();
 void subtraction();
}

class A implements Methods						// implements interface
{
	public void sum()
	{
		int a=3;
		int b= 6;
		System.out.println(a+b);
	}
	public void subtraction( )
	{
		int a=3;
		int b= 6;
		System.out.println(b-a);
		
	}
	void  subtraction(int a, int b )			// method overloading
	{
		System.out.println(a-b);
	}
}


class B extends A							// inheritance

{
	
	int a,b,c,d,w,e,r;

	void setVariableOne(int a)					// abstraction
	{
		this.w=w;
	}

void setVariableTwo(int a)				
	{
		this.e=e;
	}

	void setVariableThree(int a)					
	{
		this.r=r;
	}
	int getVariableOne()
	{
		return w;
	}

	int getVariableTwo()
	{
		return e;
	}

	int getVariableThree()
	{
		return r;
	}

	void sum(int a, int b , int c)					// method overriding
	{
		c=a+b+c;
		System.out.println(c);
	}
	void mul(int a, int b)
	{
		
		d=a*b;
		System.out.println(d);
	}



} 

class Arithematic
{
	
	public static void main(String[] args) 
	{
		int w,e,r;

		B b1 = new B();
		b1.setVariableOne(9);
		b1.setVariableTwo(5);
		b1.setVariableThree(2);

		w=b1.getVariableOne();
		e=b1.getVariableTwo();
		r=b1.getVariableThree();

		b1.sum();
		b1.subtraction();
		b1.subtraction(9,4);
		b1.sum(1,2,3);
		b1.mul(4,5);

	}
}

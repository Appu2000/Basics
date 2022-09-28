import java.util.Scanner;
class Figure
{
	final int length = 5;
	final int bredth = 4; 
	final void area() 
	{
		int a = length * bredth;
		System.out.println("Area:"+a);
		}
	}
class Rectangle extends Figure 
{
	final void rect()
	{ 
		System.out.println("This is rectangle");
		}
	}
final public class Myclass extends Rectangle
{
	public static void main(String[] args) 
	{
		Myclass obj = new Myclass();
         obj.rect();
         obj.area();
         }
	}
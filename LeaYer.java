// program to check wheather the given year is leaf year or not
import java.util.Scanner;
public class LeaYer
{
public static void main(String args[])
{
System.out.println("enter the year to check the leaf year");
Scanner sc= new Scanner(System.in);
int year=sc.nextInt();

if((year%4==0))
{
System.out.println("it is a leaf year");
}
else
{
System.out.println("it is not a leaf yaar");
}
}
}
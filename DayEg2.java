// print the day number by accepting day name
import java.util.Scanner;
public class DayEg2
{
public static void main(String args[])
{
System.out.println("enter the day name to know the day number");
Scanner sc= new Scanner(System.in);
String dayname=sc.next();
if((dayname=="monday")||(dayname=="MONDAY"))
{
System.out.println("2");
}
else if((dayname=="tuesday")||(dayname=="TUESDAY"))
{
System.out.println("3");
}
else if((dayname=="wednesday")||(dayname=="WEDNESDAY"))
{
System.out.println("4");
}
else if((dayname=="thursday")||(dayname=="THURSDAY"))
{
System.out.println("5");
}
else if((dayname=="FRIDAY")||(dayname=="friday"))
{
System.out.println("6");
}
else if((dayname=="saturday")||(dayname=="SATURDAY"))
{
System.out.println("7");
}
else if((dayname=="SUNDAY")||(dayname=="sunday"))
{
System.out.println("1");
}
else
{
System.out.println("Enter the spelling correctly");
}
}
}
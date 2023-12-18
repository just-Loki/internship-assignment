import java.util.Scanner;

class BookDriven
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
Book b1=new Book();
b1.Display();
System.out.println("=================");

Book b2=new Book(12);
b2.Display();
System.out.println("================");

Book b3=new Book(12,3000.45);
b3.Display();
System.out.println("================");

Book b4=new Book(12,4000.45,"Loki");
b4.Display();
System.out.println("================");


System.out.println("want to modify pres1");
int number = sc.nextInt();

if(number ==1)
{
System.out.println("1.b1\n 2.b2\n 3.b3\n 4.b4");
System.out.println("choose from above");
int choice = sc.nextInt();

switch(choice)
{
case 1: 
{
b1.Modify();
b1.Display();
}
}
}
}
}

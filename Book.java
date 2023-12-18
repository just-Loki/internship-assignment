import java.util.Scanner;
class Book
{
int id;
double price;
String author;

Book()
{

}

Book(int id)
{
this.id=id;
}

Book(int id,double price)
{
this(id);
this.price=price;
}

Book (int id,double price,String author)
{
this(id);
this.price=price;
this.author=author;
}

public void Display()
{
System.out.println("Book id is:"+id);
System.out.println("Book price is:"+price);
System.out.println("Book author is:"+author);
}

public void Modify()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the details to modify");
System.out.println("1.id\n2.price\n3.author");
int choice = sc.nextInt();
switch(choice)
{
case 1: 
{
System.out.println("enter the id");
int id1=sc.nextInt();
this.id=id1;
}
break;
case 2:
{
System.out.println("enter the price");
double price1=sc.nextDouble();
this.price=price1;
}
break;

case 3:
{
System.out.println("enter the author");
String author1=sc.next();
this.author=author1;
}
break;
}

}

}
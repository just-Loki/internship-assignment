// program to check that vowels or constant

import java.util.Scanner;
public class VowCon
{
public static void main(String args[])
{
System.out.println("enterthe character to check it's a vowel or constant");
Scanner sc= new Scanner(System.in);
char ch=sc.next().charAt(0);

if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
{
System.out.println("it is vowel"+ch);
}
else
{
System.out.println("it is a constant");
}
}
}
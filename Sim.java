class Sim
{
private long simno;
private String simprovider;


Sim(long simno, String simprovider)
{
this.simno=simno;
this.simprovider=simprovider;

}

public long getSimNo()
{
return simno;
}

public String getSimProvider()
{
return simprovider;
}

public void setSimNo(long simno)
{
int count=0;
long n=simno;
while(n>0)
{
count++;
n=n/10;
}
if(count==0)
{
this.simno=simno;
}
else
{
System.out.println("invalid number");
}
}
public void setSimProvider(String simProvider)
{
if(simProvider.equals("airtel")||simprovider.equals("jio"))
{
this.simprovider=simprovider;
}
else
{
System.out.println("invalid sim provider");
}
}
public void Display()
{
System.out.println("sim number is:"+getSimNo()+"\n simprovider is :"+getSimProvider());

}

}
import java.util.*;
class armstrong
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int a,d,n=0,x,s=0;

System.out.print("enter a number");
a=obj.nextInt();
x=a;
while(a>0)
{
d=a%10;
s=s*10+d;
n=n+(d*d*d);
a=a/10;
}
if(x==n)
System.out.print("this is an armstrong number\n");
else
System.out.print("this is not an armstrong number\n");
if(s==x)
System.out.print("it is palindrome\n"+s);
else
System.out.print("it is not palindrome"+s);
}
}
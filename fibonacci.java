import java.io.*;
import java.util.*;
class fibonacci
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
int a=0,b=1;
System.out.println("Fibonacci series:");
for(int i=1;i<=n;i++){
System.out.println(a+" ");
int c=a+b;
a=b;
b=c;
}
}
}


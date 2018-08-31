package mypack;
import java.util.Scanner;
public class matrix
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
public void read()
{
Scanner s=new Scanner(System.in);
int i,j;
System.out.println("enter elemets of a matirx");
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
a[i][j]=s.nextInt();
}
}
}
public void display()
{
int i,j;
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
System.out.print(" "+a[i][j]);
}
System.out.println(" ");
}
}
public int sum()
{
int i,j,s=0;
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
s=s+a[i][j];
}
}
return(s);
}
public int sumd()
{
int i,j,ds=0;
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
if(i==j)
{
ds=ds+a[i][j];
}
}
}
return(ds);
}
public int sumup()
{
int i,j,up=0;
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
if(i>j)
up=up+a[i][j];
}
}
return(up);
}
public int sumlt()
{
int i,j,lt=0;
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
if(i<j)
lt=lt+a[i][j];
}
}
return(lt);
}
}

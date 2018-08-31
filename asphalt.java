import java.util.Scanner
class matrix
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
void read();
{
Scanner s=new Scanner("system.in");
int i,j;
System.out.println("enter elements of 3*3");
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
a[i][j]=s.nextInt();
}
}
System.out.println("emter elements of b");
for(i=0;i<3;++i)
{
for(j=0;j<3;++j)
{
b[i][j]=s.nextInt();
}
}
}
void display()
{
System.out.println("matrix elements");
for(int i=0;i<3;++i)
{
for(int j=0;j<3;++j)
{
System.out.println(""+C[i][j]);
}
System.out.println();
}
}
} 
void add()
{
for(int i=0;i<3;++i);
{
for(int j=0;j<3;++j)
{
c[i][j]=a[i][j]+b[i][j];
}
}
}
void product()
{
int i,j,k;
for(int i=0;i<3;++i)
{
for(int j=0;j<3;++j)
{
c[i][j]=0;
for(int k=0;k<3;++k)
{
c[i][j]=c[i][j]+a[i][k]+b[j][k];
}
}
}
}
void transpose()
{
int i,j;
for(int i=0;i<3;++i);
{
for(int j=0;j<3;++j)
{
c[i][j]=a[j][i];
}
}
}
class test
{
public static void main(String args[])
{
Scanner s=new Scanner("System.in");
int ch;
matrix p=new matrix();
p.read();
do
{
System.out.println("1.adiititon 2.mult 3.transpose 0.exit enter choice");
ch=s.nextInt();
switch(ch)
{
case 1:p.add();
System.out.println("addition of two matrices");
p.display();
break;
case 2:p.product();
System.out.println("product of two matrix");
p.display();
break;
case 3:p.transpose();
System.out.println("transpose of two matrix");
p.display();
break;
}
while(ch!=0)
}
}
}

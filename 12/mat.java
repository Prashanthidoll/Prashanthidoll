import mypack.matrix;
class test
{
public static void main(String args[])
{
matrix m=new matrix();
m.read();
m.display();
System.out.println("sum of elements "+m.sum());
System.out.println("sum of diagonal elements "+m.sumd());
System.out.println("sum of upper triangular elements "+m.sumup());
System.out.println("sum of lower triangular elements "+m.sumlt());
}
}

import java.util.Scanner;
class Inch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any value in inches  ");
float inch=sc.nextFloat();

double meter;
meter=inch*0.0254;

System.out.println(inch+" inch is "+meter+" meters");
}
}
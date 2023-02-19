import java.util.Scanner;
class Temp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter temperature in Fahrenheit");
float fahr=sc.nextFloat();

float celsius;
celsius=((fahr-32)*5)/9;

System.out.println(fahr+" Fahrenheit is equal to  "+celsius+" in celsius");
}
}
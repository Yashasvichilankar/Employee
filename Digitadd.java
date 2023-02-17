import java.util.Scanner;
class Digitadd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);


System.out.println("Input an integer between 0 to 1000: ");
int num=sc.nextInt();

int remain=0;
int sum=0;

while(num>0)
{
remain=num%10;
sum=sum+remain;
num=num/10;
}
System.out.println("The sum of all digits "+num+" is "+sum);
}
}
import java.util.Scanner;
class Mintoyear
{
public static void main(String args[])
{
int mininyear=60*24*365;

Scanner sc=new Scanner(System.in);

System.out.println("Input the number of minutes: ");
int min=sc.nextInt();

int year=min/mininyear;
int day=(min/60/24) % 365;

System.out.println(min+" minutes is approximately "+year+" years and "+day+" Days");
}
}

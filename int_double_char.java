import java.util.Scanner;
class PrintInt{
public static void main (String args[]){
Scanner scan=new Scanner(System.in);

System.out.print("Enter the number: ");
int num=scan.nextInt();
System.out.print("Enter the character: ");
int ch=scan.next().charAt(0);
System.out.print("Enter the double: ");
int d=scan.nextDouble();


System.out.print("You entered : "+num);
System.out.print("You entered : "+ch);
System.out.print("You entered : "+d);
}
}

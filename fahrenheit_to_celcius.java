import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Temperture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        double fahrenheit=sc.nextDouble();
        double celsius=((fahrenheit-32)*5)/9;
        System.out.println("Temperature in celsius = "+celsius);
    }
}

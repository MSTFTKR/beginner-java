
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class bki {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("km başı fiyat gir:");
        double kmbas= scanner.nextDouble();
        System.out.print("kaaç km gittin:");
        double km= scanner.nextDouble();
        System.out.println("masraf:"+ km*kmbas);
    }
    
}

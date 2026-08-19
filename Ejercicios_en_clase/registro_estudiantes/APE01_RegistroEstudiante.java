/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ape01_registroestudiante;
import java.util.Scanner;
/**
 *
 * @author leybe
 */
public class APE01_RegistroEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Edad;
        String Nombre;
        float nota1,nota2,nota3,promedio;
        System.out.println("Ingrese su nombre");
        Nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        Edad = sc.nextInt();
        System.out.println("Ingrese su primera nota");
        nota1=sc.nextFloat();
        System.out.println("Ingrese su segunda nota");
        nota2=sc.nextFloat();
        System.out.println("Ingrese su tercera nota");
        nota3=sc.nextFloat();
        promedio=(nota1+nota2+nota3)/3;
        String edadBinario = Integer.toBinaryString(Edad);
        String edadHexadecimal = Integer.toHexString(Edad);
        System.out.println("Su nombre es: "+Nombre);
        System.out.println("Su edad decimal es: "+Edad);
        System.out.println("Su edad binaria es: "+edadBinario);
        System.out.println("Su edad hexadecimal es: "+edadHexadecimal);
        System.out.println("Su promedio es: "+promedio);
        sc.close();
    }
    
}

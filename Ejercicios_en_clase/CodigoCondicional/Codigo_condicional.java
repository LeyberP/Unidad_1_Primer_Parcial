import java.util.Scanner;

public class Codigo_condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 

        int num; 

        System.out.println("Ingrese un numero"); 

        num=sc.nextInt(); 

        if (num>0 && num<100){ 

            System.out.println("Es postivo y menor a 100"); 

        }else{ 

            System.out.println("No es postivo o es mayor a 100: "); 

        } 
    sc.close();
    } 
}
//import java.util.Scanner;

import java.util.Scanner;

public class CondicionalesEjercicios {
    
    public static void main(String[] args){
         //Ejercicio 1. Obtener el mayor de 2 numero ingresados por teclado
         Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
         int n2=sc.nextInt();
         if (n1>n2){
            System.out.println("El numero mayor es "+n1);
         }else{
            System.out.println("El numero mayor es "+n2);
         }

         //Ejercicio 2. Obtener el mayor de 3 numeros ingresados por teclado
         int numero1, numero2, numero3;
         System.out.print("Ingrese el primer numero: ");
         numero1=sc.nextInt();
         System.out.print("Ingrese el segundo numero: ");
         numero2=sc.nextInt();
         System.out.print("Ingrese el tercer numero: ");
         numero3=sc.nextInt();
         //Condicional
         if (numero1>numero2){
            if(numero1>numero3){
               System.out.println("El numero mayor es "+numero1);
            }else{
               System.out.println("El numero mayor es "+numero3);
            }
         }else if(numero2>numero3)
         {
            System.out.println("El numero mayor es "+numero2);
         }else{
            System.out.println("El numero mayor es: "+numero3);
         }
    }
   
}

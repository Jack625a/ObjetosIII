//import java.util.Scanner;

import java.util.Scanner;

public class a {
    public static void main(String[] args){

        System.out.println("Ejercicio 1- Mayor de 2 numeros ingresados por teclado");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n1=scanner.nextInt();  
        System.out.print("Ingres un numero: ");
        int n2=scanner.nextInt();   
        if(n1>n2){
            System.out.println("El numero mayor es "+n1);
        }else{
            System.out.println("El numero mayor es "+n2);
        } 
        System.out.println("Ejercicio 2- Mayor de 3 numeros ingresados por teclado");
        int numero1, numero2, numero3;
        System.out.print("Ingrese el primer numero: ");
        numero1=scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2=scanner.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        numero3=scanner.nextInt();
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

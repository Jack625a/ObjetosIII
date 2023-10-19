import java.util.Scanner;
public class Bucles {
    public static void main(String[]args){

        System.out.println("Ejercicio 1. Mostrar los numero pares del 1 al 50");
        //Ejercicio 1. Mostrar los numero pares del 1 al 50
        for(int i=2;i<=50;i+=2){
            //i=i+2;
            System.out.println(i);
        }

        System.out.println("Ejercicio 2. Mostrar los numeros pares del 1 al 50 con bucle repetitivo while");
        //Ejercicio 2. Mostrar los numeros pares del 1 al 50 con bucle repetitivo while
        int numero=1;
        while(numero<=50){
            //Codigo
            if (numero%2==0){
                System.out.println(numero);
            }
            numero++;
        }

        //Ejercicio3. Realizar la suma de numero del 1 al N (N INGRESADO POR TECLADO)
        //CREAR LA INSTANCIA DE LA CLASE SCANNER
        System.out.println("Ejercicio3. Realizar la suma de numero del 1 al N (N INGRESADO POR TECLADO)");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n=scanner.nextInt();
        int suma=0;
        for (int i=1; i<=n;i++){
            suma+=i;
        }
        System.out.println("La suma de los numero es: 1"+n +"es: "+ suma);

        //Ejercicio 4.Tabla de multiplicar del 9
        System.out.println("Ejercicio 4.Tabla de multiplicar del 9");
        int tabla=9;
        for(int i=1;i<=10;i++){
            int resultado=tabla*i;
            System.out.println(tabla+"x"+i+"= "+resultado);
        }
        //Ejercicio 5. Tabla de multiplicar de N
        
        System.out.println("Ejercicio 5.Tabla de multiplicar de N");
        //PASO 1. crear la instancia de la entrada de datos
        Scanner scanner2=new Scanner(System.in);
        System.out.print("Ingrese un numero para la tabla de multiplicar: ");
        int tabla2=scanner2.nextInt();
        for(int i=1; i<=10; i++){
            int resultado2=tabla2*i;
            System.out.println(tabla2+"x"+i+"="+resultado2);
        }
        //Ejercicio 6. Crear un bucle para el ejercicio 5 donde solamente se pueda salir si el usuario indica SALIR
        Scanner scanner3=new Scanner(System.in);
        //System.out.print("Desea seguir mostrando la tabla de multiplicar? 1 para continuar, 2 para Salir: ");
        //int opcion=scanner3.nextInt();
        int opcion=1;
        while (opcion==1){
            System.out.print("Ingrese un numero para la tabla de multiplicar: ");
            int tabla3=scanner3.nextInt();
            for(int i=1; i<=10; i++){
                int resultado3=tabla3*i;
                System.out.println(tabla3+"x"+i+"="+resultado3);
                }

            System.out.print("Desea seguir mostrando la tabla de multiplicar? 1 para continuar, 2 para Salir: ");
            opcion=scanner3.nextInt();
        }
        

        //Ejercicio 7. Mostrar los numero impares del 1 al 50 con el bucle While
        System.out.println("Ejercicio 7. Mostrar los numero impares del 1 al 50 con el bucle While");
        int a=1;
        while(a<=50){
            System.out.println(a);
            a+=2;
        }
        //Ejercicio 8. .Mostrar los numero impares del 1 al 50 con el bucle for
        System.out.println("Ejercicio 8. Mostrar los numero impares del 1 al 50 con el bucle for");
        for(int i=1;i<=50;i+=2){
            System.out.println(i);
        }

        //Ejercicio 9. Factorial de un numero ingresado por teclado con el bucle for
        System.out.println("Ejercicio 9. Factorial de un numero ingresado por teclado con el bucle for");
        Scanner scanner4=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int b=scanner4.nextInt();
        int factorial=1;
        for (int i=1;i<=b;i++){
            factorial*=i;
        }
        System.out.println("El factorial de "+b+" es "+ factorial);



        //Ejercicio 10. Factorial de un numero ingresado por teclado con el bucle WHILE
        //Ejercicio 11- MOSTRAR LA SERIE DE FIBONACCI CON EL BUCLE FOR
        System.out.println("Ejercicio 11- MOSTRAR LA SERIE DE FIBONACCI CON EL BUCLE FOR");
        System.out.print("Ingrese un numero para la serie de fibonacci: ");
        int fn=scanner.nextInt(); //Numero que se ingresara por teclado
        int f0=0;
        int f1=1;
        System.out.println("La Serie de Fibonacci: "+ f0+"+"+f1);
        for(int i=2; i<=fn;i++){
            int fs=f0+f1;
            System.out.println(f0+"+"+f1+"="+fs);
            f0=f1;
            f1=fs;

        }
        //Ejercicio 12- MOSTRA LA SERIE DE FIBONACCI CON EL BUCLE WHILE
    }
    
}

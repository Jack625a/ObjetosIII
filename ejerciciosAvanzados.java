import java.util.Scanner;

public class ejerciciosAvanzados {
    public static void main(String[]args){
        //Condicionales - Metodos
        //Ejercicio 1- Calcular el Factorial
        System.out.println("Ejercicio 1- Calcular el Factorial");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero=scanner.nextInt();
        int calculofactorial=factorial(numero);
        System.out.println("El factorial de "+numero+" es "+calculofactorial);

        //Bucles - Metodos - Condicionales
        //Ejercicio 2- Obtener le mayor menor de una lista
        System.out.println("Ejercicio 2- Obtener le mayor menor de una lista");
        System.out.print("Ingrese la cantidad de numero: ");
        int cantidad=scanner.nextInt();
        int mayor=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;

        //AGREGAR DATOS A LA LISTA - BUCLES FOR
        for(int i=0;i<cantidad;i++){
            System.out.print("Ingrese un numero: ");
            int numero1=scanner.nextInt();
            //Condicional para determinar el mayor
            if(numero1>mayor){
                mayor=numero1;
            }
            if(numero1<menor){
                menor=numero1;
            }
        }
        System.out.println("El numero mayor es: "+ mayor);
        System.out.println("El numero menor es: "+ menor);
       //Ejercicio 3 - Tabla de Multiplicar con Metodo y bucle
       System.out.println("Ejercicio 3 - Tabla de Multiplicar de n");
       System.out.print("Ingrese un numero para mostrar la tabla de multiplicar: ");
       int numero2=scanner.nextInt();
       tablaMultiplicar(numero2);




    }
        //Condicionales - Metodos
        //Ejercicio 1- Calcular el Factorial
    public static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    //Ejercicio 3 - Tabla de Multiplicar Metodo y bucle
    public static int tablaMultiplicar(int n1){
        int resultado=0;
        for(int i=1;i<=10;i++){
            resultado=n1*i;
            System.out.println(n1+"x"+i+"= "+resultado);   
        }
        return resultado;
    }
}

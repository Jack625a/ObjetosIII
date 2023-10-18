import java.util.Scanner;
public class Bucles {
    public static void main(String[]args){
        //Ejercicio 1. Mostrar los numero pares del 1 al 50
        for(int i=2;i<=50;i+=2){
            //i=i+2;
            System.out.println(i);
        }
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
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n=scanner.nextInt();
        int suma=0;
        for (int i=1; i<=n;i++){
            suma+=i;
        }
        System.out.println("La suma de los numero es: 1"+n +"es: "+ suma);
    }
    
}

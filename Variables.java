//Paso1. Importar la clase SCANNER
import java.util.Scanner;
public class Variables {
    //Ejercicio 1. Calcular el area de un circulo con variables definidas
    public static void main(String[]args){
        double radio=5.0;
        double areaCirculo=Math.PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es: "+areaCirculo);
    //Ejercicio 2. Calcular el area del triangulo
    //Paso2. Crear la instancia
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese la base: ");    
    double base=scanner.nextDouble();
    System.out.print("Ingrese la altura: ");    
        double altura=scanner.nextDouble();
        double areaTriangulo=(base*altura)/2;
        System.out.println("El area del triangulo es: "+areaTriangulo);

    }

    
}

/*Pregunta 1: Condicionales y Métodos
Escribe un programa en Java que solicite al usuario dos números enteros y luego le pregunte qué operación desea realizar (suma, resta, multiplicación o división). El programa debe llamar al método correspondiente y mostrar el resultado. Utiliza un menú de opciones y funciones separadas para cada operación.
Pregunta 2: Bucles 
Crea un programa que genere una secuencia de Fibonacci de longitud n, donde n es un número ingresado por el usuario. 
Pregunta 3: Herencia y Polimorfismo
Define una clase Figura con un método calcularArea() y dos subclases: Circulo y Rectangulo, que sobrescriben el método para calcular el área de un círculo y un rectángulo, respectivamente. Crea un arreglo de objetos Figura que incluye tanto círculos como rectángulos. Llama al método calcularArea() para cada objeto y muestra los resultados.
Pregunta 4: Clases y Métodos
Crea una clase Persona con atributos para nombre, edad y dirección. Luego, crea una subclase Estudiante que herede de Persona y tenga un atributo adicional para la universidad a la que asiste. Define un método en Estudiante para mostrar todos los detalles (nombre, edad, dirección y universidad) y llama a ese método para una instancia de Estudiante.
Pregunta 5: Diccionarios y Clases
Implementa un sistema de gestión de inventario en una tienda. Crea una clase Producto con atributos para nombre, precio y cantidad en stock. Utiliza un diccionario para almacenar varios productos. Luego, crea métodos para agregar nuevos productos, mostrar el inventario y actualizar las cantidades en stock.
Pregunta 6: Subclases y Polimorfismo
Define una clase Animal con un método hacerSonido() y dos subclases: Perro y Gato. Luego, crea un arreglo de objetos Animal que incluye tanto perros como gatos. Llama al método hacerSonido() para cada objeto y observa cómo se comporta.
Pregunta 7: Bucles y Métodos
Escribe un programa que utilice un bucle for para imprimir los números del 1 al 100 que son divisibles por 3. Luego, utiliza un bucle while para imprimir los números del 1 al 100 que son divisibles por 5.
Pregunta 8: Herencia y Polimorfismo
Crea una clase Vehiculo con atributos para marca y velocidad, y un método acelerar() que incremente la velocidad. Luego, crea dos subclases: Coche y Motocicleta, que hereden de Vehiculo. Implementa el método acelerar() de manera diferente para cada subclase. Crea una instancia de Coche y una de Motocicleta, y llama al método acelerar() en ambas instancias.
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
//Pregunta 4: Clases y Métodos
class Personaa{
    private String nombre;
    private int edad;
    private String direccion;

    public Personaa(String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;  
    }
    //metodos
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
    }
}
class Estudiantee extends Personaa{
    private String universidad;

    public Estudiantee(String nombre, int edad, String direccion, String universidad){
        super(nombre, edad, direccion);
        this.universidad=universidad;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Universidad: "+universidad);
    }
}

//Pregunta 5
class Productoss{
    String nombre;
    double precio;
    int cantidad;

    public Productoss(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }

}



public class resolucionExamen {
    public static void main(String[] args) {
        //Ejercicio1
        Scanner lecturaDatos=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1=lecturaDatos.nextInt();
        System.out.print("Ingrese un numero: ");
        int num2=lecturaDatos.nextInt();

        System.out.println("Operaciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("Seleccione una opcion: ");
        int opcion=lecturaDatos.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("La suma de "+num1+"+"+num2+"="+sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta de "+num1+"-"+num2+"="+restar(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion de "+num1+"x"+num2+"="+multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("La division de "+num1+"/"+num2+"="+dividir(num1, num2));
                break;
        
            default:
                System.out.println("Operacion no valida...");
                break;
        }
        //Ejercicio 2.
        System.out.println("Ejercicio 2");
        System.out.print("Ingrese la longitud de la secuencia de Fibonacci: ");
        int n=lecturaDatos.nextInt();
        int x=0;
        int y=1;
        for(int i=0;i<n;i++){
            System.out.println(x+"");
            int res=x+y;
            x=y;
            y=res;
        }
        //Pregunta 4: Clases y Métodos
        //Personaa estudiante1=new Estudiantee("Kevin", 27, "Av. abc", "Ucatec");
        //estudiante1.mostrarInformacion();
        //Pregunta 5
        Map<String, Productoss>inventario=new HashMap<>();
        //Agregar los productos
        inventario.put("Producto1", new Productoss("Producto1", 15.15, 5));
        inventario.put("Producto2", new Productoss("Producto2", 155.15, 5));
        inventario.put("Producto3", new Productoss("Producto3", 415.15, 5));
        inventario.put("Producto4", new Productoss("Producto4", 4615.15, 5));
        // Mostrar los productos del diccionario.
        for(Productoss producto: inventario.values()){
            System.out.println(producto.nombre+" - "+producto.precio+" Bs");
        }

        //Pregunta 7: Bucles y Métodos
        System.out.println("Numeros divisibles por 3");
        for(int i=1;i<=100;i++){
            if (i%3==0) {
                System.out.println(i);
                
            }
        }
        System.out.println("Numeros divisibles por 5");
        int j=1;
        while(j<=100){
            if (j%5==0) {
                System.out.println(j);   
            }
            j++;
        }
    }


    //METODOS PARA EL CALCULO DE LAS OPERACIONES
        public static int sumar(int a, int b){
            return a+b;
        }
        public static int restar(int a, int b){
            return a-b;
        }
        public static int multiplicar(int a, int b){
            return a*b;
        }
        public static int dividir(int a, int b){
            return a/b;
        }

}

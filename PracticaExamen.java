//Ejercicio 1: Condicionales Escribe un programa en Java que solicite un número al usuario y determine si es positivo, negativo o cero.
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Animal{
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}
class Perro extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El perro esta ladrando");
    }
}

class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El gato esta maullando");
    }
}
class Caballo extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El Caballo esta relinchando");
    }
}
class Vaca extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("El vaca esta mugiendo");
    }
}



public class PracticaExamen {
    //Ejercicio 1: Condicionales Escribe un programa en Java que solicite un número al usuario y determine si es positivo, negativo o cero.
    public static void main(String[] args) {
    System.out.println("Ejercicio 1: Condicionales Escribe un programa en Java que solicite un número al usuario y determine si es positivo, negativo o cero.");  
        Scanner s=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero=s.nextInt();
        if(numero>0){
            System.out.println("El numero es positivo");
        }else if (numero<0) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }

    //Ejercicio 2: Bucles Crea un programa que muestre los números del 1 al 10 utilizando un bucle "for".
    System.out.println("Ejercicio 2: Bucles Crea un programa que muestre los números del 1 al 10 utilizando un bucle \"for\".");    
    for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    //Ejercicio 3: Métodos Crea un método en Java llamado "esPar" que tome un número entero como argumento y devuelva true si el número es par y false si es impar.
    System.out.println("Ejercicio 3: Métodos Crea un método en Java llamado \"esPar\" que tome un número entero como argumento y devuelva true si el número es par y false si es impar.");
    System.out.print("Ingrese un numero: ");
    int numero2=s.nextInt();
    if(esPar(numero2)){
        System.out.println("El numero "+numero2+ " es par");
    }else{
        System.out.println("El numero "+numero2+ " es impar");
    }

    //Ejercicio 4: Diccionarios Utiliza un diccionario (por ejemplo, HashMap) para almacenar nombres y edades de personas. Luego, solicita al usuario un nombre y muestra la edad correspondiente.
    System.out.println("Ejercicio 4: Diccionarios Utiliza un diccionario (por ejemplo, HashMap) para almacenar nombres y edades de personas. Luego, solicita al usuario un nombre y muestra la edad correspondiente.");
    Map<String, Integer> personas=new HashMap<>();
    //Metodo para ingresar valores al diccionario: "put"
    personas.put("Kevin", 27);
    personas.put("Alvaro", 25);
    personas.put("Jose", 24);
    personas.put("Maria", 22);
    System.out.print("Ingrese un nombre: ");
    String nombre=s.next();
    System.out.print("Ingrese la edad: ");
    int edad=s.nextInt();
    personas.put(nombre, edad);
    //Evaluacion del diccionario
    System.out.print("Ingrese un nombre:");
    String nom=s.next();

    if(personas.containsKey(nom)){
        int edad2=personas.get(nom);
        System.out.println(nom+" tiene "+edad2+" años");
    }else{
        System.out.println("El nombre no existe en el registro");
    }

    //Ejercicio 5: Herencia Crea una clase Animal con un método hacerSonido(). Luego, crea dos subclases, Perro y Gato, que sobrescriban el método hacerSonido() para imprimir el sonido característico de cada uno
    System.out.println("Ejercicio 5: Herencia Crea una clase Animal con un método hacerSonido(). Luego, crea dos subclases, Perro y Gato, que sobrescriban el método hacerSonido() para imprimir el sonido característico de cada uno");
    Animal perro=new Perro();
    Animal gato=new Gato();

    perro.hacerSonido();
    gato.hacerSonido();

    //Ejercicio 6: Polimorfismo Utiliza el polimorfismo para crear un arreglo de objetos de tipo Animal que incluye tanto perros como gatos. Luego, llama al método hacerSonido() para cada objeto y observa cómo se comporta
    System.out.println("Ejercicio 6: Polimorfismo Utiliza el polimorfismo para crear un arreglo de objetos de tipo Animal que incluye tanto perros como gatos. Luego, llama al método hacerSonido() para cada objeto y observa cómo se comporta");
    Animal[] animales=new Animal[4];

    animales[0]=new Perro();
    animales[1]=new Gato();
    animales[2]=new Caballo();
    animales[3]=new Vaca();

    for(Animal animal: animales){
        animal.hacerSonido();
    }
    //Ejercicio 7: Uso de Condicionales Escribe un programa que determine si un año es bisiesto o no. Un año es bisiesto si es divisible por 4, excepto si es divisible por 100, a menos que también sea divisible por 400.
    System.out.println("Ejercicio 7: Uso de Condicionales Escribe un programa que determine si un año es bisiesto o no. Un año es bisiesto si es divisible por 4, excepto si es divisible por 100, a menos que también sea divisible por 400.");
    System.out.print("Ingrese un año: ");
    int año=s.nextInt();
    if((año%4==0 && año %100 !=0)|| año%400==0){
        System.out.println("El año "+año+ " es bisiesto");
    }else{
        System.out.println("El año "+año+ " no es bisiesto");
    }

    //Ejercicio 8: Bucles y Métodos Crea un programa que calcule el factorial de un número. Puedes hacerlo usando un método y un bucle for.
    System.out.println("Ejercicio 8: Bucles y Métodos Crea un programa que calcule el factorial de un número. Puedes hacerlo usando un método y un bucle for.");
    System.out.print("Ingrese un numero para calcular su factorial: ");
    int numero3=s.nextInt();
    factorial(numero3);
    System.out.println("El factoruial de "+numero3+ " es "+factorial(numero3));

    }
    //Metodo para determinar si un numero es par o impar
    public static boolean esPar(int num){
        return num %2==0;
    }
    //Metodo para determinar el factorial
    public static int factorial(int x){
        if (x==0) {
            return 1;
        }else{
            int resultado=1;
            //int i;
            for(int i=1; i<=x; i++){
                resultado*=i;
            }
            return resultado;
        } 
    }
}

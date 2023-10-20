import java.util.Scanner;
import java.util.HashMap;//Estructura de datos pra clave-valor
import java.util.Map;

//Almacenamiento de datos de Estudiantes (Nombre, edad)
public class EjerciciosCombinados {
    public static void main(String[] args){
        //Crear una hasmap Para el alamacenamiento de datos
        Map<String,Integer> estudiante= new HashMap<>();

        //Agregado de datos metodo insercion (put)
        estudiante.put("Kevin",27);
        estudiante.put("Efrain",24);
        estudiante.put("Yeltsin", 23);

        //Recuperacion de datos metodo (get)
        int edadKevin=estudiante.get("Kevin");
        System.out.println("La edad de Kevin es: "+edadKevin);

        //Verificicaion de datos metodo (containKey)
        boolean a=estudiante.containsKey("Juan");
        System.out.println(a);

        //Eliminacion de datos metodo (remove)
        estudiante.remove("Efrain");

        //Verificacion de datos
        boolean verificacion=estudiante.containsKey("Efrain");
        System.out.println(verificacion);

         boolean v=estudiante.containsKey("Yeltsin");
        System.out.println(v);


        //Ejercicio 1- Crear un simulador de un Cajero Automatico
        //UTILIZANDO EL ALMACENAMIENTO DE DATOS 
        //condicionales y bucles
        //1. Creacion de la cuenta (Usuario,Contraseña)
        //2. Depositos
        //3. Retiros
        //4. Consulta de saldo
        //5. Salir
        Map<String,String> cuentas= new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        //MENU PRINCIPAL
        while(true){
            System.out.println("***CAJERO AUTOMATICO***");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Realizar Deposito: ");
            System.out.println("2. Realizar Retiro: ");
            System.out.println("3. Consultar Saldo: ");
            System.out.println("4. Salir: ");
            int opcion=scanner.nextInt();
            if(opcion==1){
                System.out.println("1. Realizar Deposito: ");
            }else if(opcion ==2){
                System.out.println("1. Realizar Retiro: ");
            }
        }

    }
}

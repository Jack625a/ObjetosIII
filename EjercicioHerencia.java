//Ejercicio 1. CREAR UN SISTEMA PARA UN CAJERO AUTOMATICO 
//Crear la clase principal de Cajero 
//Metodos: 1. Depositar 2. Retirar 3. Ver Saldo
//Crear una subclase Cuenta (Herencia de Propiedades y Metodos)
//Clase para Operaciones a Realizar (Menu)

//PASO 1. IMPORTAR LAS CLASES NECESARIAS
import java.util.Scanner;


//PASO 2. CREAR LA CLASE CAJERO
class Cajero{
    String titularCuenta;
    int saldoCuenta;

    public Cajero(String titularCuenta, int saldoCuenta){
        this.titularCuenta=titularCuenta;
        this.saldoCuenta=saldoCuenta;
    }

    //Paso 3 . Crear los Metodos o acciones
    public void depositar(int cantidad){
        saldoCuenta+=cantidad;
        System.out.println("Deposito de: "+cantidad+"Bs  Saldo Actual: "+saldoCuenta+"Bs");
    }
    public void retirar(int cantidad){
        if(cantidad>saldoCuenta){
            System.out.println("El saldo actual es insuficiente para el retiro");
        }else{
            saldoCuenta-=cantidad;
            System.out.println("Retiro de: "+cantidad+"Bs  Saldo Actual: "+saldoCuenta+"Bs");
        }
    }
    public void verSaldo(){
        System.out.println("Saldo actual "+ saldoCuenta+"Bs  de la cuenta de "+titularCuenta);
    }
}
class CuentaCliente extends Cajero{
    int pinAcceso; //4 digitos
    int ci;
    String correo;

    public CuentaCliente(String titularCuenta, int saldoCuenta, int pinAcceso, int ci, String correo){
        super(titularCuenta, saldoCuenta);
        this.pinAcceso=pinAcceso;
        this.ci=ci;
        this.correo=correo;
    }
}

class Operaciones extends Cajero{
    Scanner scanner=new Scanner(System.in);
    int pin;
    public Operaciones(String titularCuenta, int saldoCuenta, int pin){
        super(titularCuenta, saldoCuenta);
        this.pin=pin;
    }

    //Metodo  Autentificacion
    public void autentificacion(String titular, int pin){
        System.out.print("Ingrese su nombre: ");
        String cuenta1=scanner.nextLine();

        System.out.print("Ingrese su pin de acceso: ");
        int pin1=scanner.nextInt();

        if (cuenta1==titular && pin1==pin) {
            System.out.println("Bienvenido "+ titular);
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una de las operaciones a realizar: ");
            int opcion=scanner.nextInt();
            switch (opcion) {
                case 1:
                    verSaldo();
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    int cantidad=scanner.nextInt();
                    depositar(cantidad);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    int cantidad2=scanner.nextInt();
                    retirar(cantidad2);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el servicio...");
                    break;
                default:
                    System.out.println("Operacion Invalida");
                    break;
            }
        }else{
            System.out.println("Usuario o pin no valido...");
        }
    }
}


public class EjercicioHerencia {
    public static void main(String[] args) {
        
        //Cajero usuario1=new Cajero("Kevin Arroyo", 800);
        //usuario1.verSaldo();
        //usuario1.depositar(500);
        //usuario1.retirar(2000);
        
    }
}

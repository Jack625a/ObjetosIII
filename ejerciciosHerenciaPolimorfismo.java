//Ejercicios Herencia - Polimorfismo

//Ejercicio 1. Calculo del Area de figuras.
import java.util.Scanner;
class figura{
    //Metodo de calculo del area
    public double calcularArea(){
        return 0.0;
    }
}

class Circulo extends figura{
    private double radio;

    public Circulo (double radio){
        this.radio=radio;
    }
    @Override
    public double calcularArea(){
        return radio*radio*Math.PI;
    }
}

class Triangulo extends figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}

class Cuadrado extends figura{
    private double lado1;
    private double lado2;

    public Cuadrado(double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    @Override
    public double calcularArea(){
        return lado1*lado2;
    }
}


public class ejerciciosHerenciaPolimorfismo {
    public static void main(String[] args) {
       Scanner leerDato=new Scanner(System.in);
        boolean selecion=true;
       while(selecion){
            System.out.println("***CALCULADORA DE AREAS***");
            System.out.println("1. Area del Cuadrado");
            System.out.println("2. Area Circulo");
            System.out.println("3. Area Triangulo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion=leerDato.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un lado del cuadrado: ");
                    double lado=leerDato.nextDouble();
                    figura figura1=new Cuadrado(lado, lado);
                    System.out.println("El Area del Cuadrado es: "+figura1.calcularArea());
                    break;
                case 2:
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio=leerDato.nextDouble();
                    figura figura2=new Circulo(radio);
                    System.out.println("EL Area del Circulo es: "+figura2.calcularArea());
                    break;
                case 3:
                    System.out.print("Ingrese la base del triangulo: ");
                    double base=leerDato.nextDouble();
                    System.out.print("Ingrese la altura del triangulo: ");
                    double altura=leerDato.nextDouble();
                    figura figura3=new Triangulo(base, altura);
                    System.out.println("El Area del triangulo es: "+figura3.calcularArea());
                    break;
                case 4:
                    System.out.println("Gracias por utilizar la calculadora de areas...");
                    selecion=false;
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            }
      
    }
    
}

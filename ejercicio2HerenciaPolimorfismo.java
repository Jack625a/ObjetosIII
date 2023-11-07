//Ejercicio 2 - Herencia - Polimorfismo
//Crear un sistema para almacenamiento de Productos, y subclases para Productos con Descuentos
import java.util.Scanner;
class Productos{
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Productos(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    //Metodos de la clase Productos
    public void mostrarProductos(){
        System.out.println("Producto Disponibles");
        System.out.println("-"+nombre);
    }

    public double calcularPrecio(){
        return precio;
    }
}

class ProductosDescuento extends Productos{
    private double descuento;
    public ProductosDescuento(String nombre, double precio, int cantidad, double descuento){
        super(nombre, precio, cantidad);
        this.descuento=descuento;
    }

    @Override
    public double calcularPrecio(){
        return precio-(precio*descuento);
    }   
}





public class ejercicio2HerenciaPolimorfismo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese el porcentaje de descuento");
        double descuento=leer.nextDouble();
        double totaldescuento=descuento/100;
        Productos producto1=new Productos("Samsung s20", 4500, 10);
        Productos producto2=new ProductosDescuento("Xiaomi XPRO20", 3800, 5, totaldescuento);
        System.out.println("**Productos con Descuento**");
        System.out.println("- "+producto2.nombre+ " Precio: "+producto2.precio+ "Bs Precio con Descuento: "+producto2.calcularPrecio()+"Bs"+ "  Con el descuento del "+descuento+"%");

    }
    
}

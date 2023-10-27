//Ejercicio 1. Crear un sistema para almacenamiento de productos esto para una tienda online
//Almacenar los datos en un diccionario (class hash hashmap)
//clase PRODUCTOS
//Subclase Categorias
//

//Paso1. Importar las clases a utilizar
import java.util.Scanner; //Entrada de datos
import java.util.HashMap; //Propiedades de la clase diccionario
import java.util.Map;

//Paso 2. Crear la clase con sus parametros
class Producto{
    String nombre;
    double precio;
    int cantidad;
    String descripcion;

    public Producto(String nombre,double precio, int cantidad, String descripcion){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.descripcion=descripcion;
    }

    //Paso 3. Crear los metodos de la clase
    public String ingresarNombre(){
        return nombre;
    }
    public double ingresarPrecio(){
        return precio;
    }
    public int ingresarCantidad(){
        return cantidad;
    }
    public String ingresarDescripcion(){
        return descripcion;
    }
}

//Paso 4. Crear la subclase que herede los parametros y metodos de la clase Producto
class categoriaProducto extends Producto{
    String Tipo;
    String Marca;
    public categoriaProducto(String nombre, double precio, int cantidad,String descripcion, String Tipo, String Marca){
        super(nombre, precio, cantidad, descripcion);
        this.Tipo=Tipo;
        this.Marca=Marca;
    }

    //Metodos de la subclase
    public String ingresarTipo(){
        return Tipo;
    }
    public String ingresarMarca(){
        return Marca;
    }
}

public class EjercicioProductoHerencia {
    public static void main(String[] args) {
        //categoriaProducto producto1=new categoriaProducto("Producto1", 100, 5, "Descripcion 1", "Electronica", "Dell");
        //System.out.println(producto1.ingresarTipo());
        Scanner scanner=new Scanner(System.in);
        Map<String, Producto> inventario=new HashMap<>();
        
        //Agregar los productos al diccionario
        System.out.println("Agregado de Productos");
        while(true){
            System.out.print("Desea seguir agregando producto a la tienda? 1. Continuar 2. Salir");
            int seleccion=scanner.nextInt();
            if (seleccion==1){
            System.out.println("Ingrese el nombre del producto: ");
            String nombreProducto=scanner.next();
           
            System.out.println("Ingrese el precio del producto: ");
            double precioProducto=scanner.nextDouble();

            System.out.println("Ingrese la cantidad del producto: ");
            int cantidadProducto=scanner.nextInt();

            System.out.println("Ingrese la descripcion del producto: ");
            String descripcionProducto=scanner.next();

            Producto productos=new Producto(nombreProducto, precioProducto, cantidadProducto, descripcionProducto);
            inventario.put(productos.ingresarNombre(),productos);

            }else if(seleccion==2){
            //System.out.println("Seccion venta: "+inventario);
            break;
                      
            }else{
                System.out.println("Error operacion no valida");
            }
        }
        System.out.println("Bienvenido a la tienda abc ");
        System.out.println("Productos Disponibles");
        for(Map.Entry<String, Producto>entry:inventario.entrySet()){
            Producto producto=entry.getValue();
            System.out.println(producto.ingresarNombre()+"- Precio: "+producto.ingresarPrecio()+"Bs - Cantidad: "+producto.ingresarCantidad()+ " Descripcion: "+producto.ingresarDescripcion());
        }
        boolean carrito=true;
        double total=0.0;
        while (carrito) {
            System.out.println("Seleccione un producto para agregar al carrito: ");
            String productoSeleccionado=scanner.nextLine();
            if (inventario.containsKey(productoSeleccionado)) {
                Producto producto=inventario.get(productoSeleccionado);
                total+=producto.ingresarPrecio();

                System.out.println(producto.ingresarNombre()+" -Precio: "+producto.ingresarPrecio()+ " Total a Pagar: "+total+"Bs");
                System.out.print("Desea seguir agregando producto al carrito? 1. Continuar 2. Salir");
                int selecion2=scanner.nextInt();
                switch (selecion2) {
                    case 1:
                        carrito=true;
                        break;
                    case 2:
                        carrito=false;
                        break;
                    default:
                        break;
                }
            }else{
                System.out.println("Producto no encontrado");
            }
            
        }
        System.out.println("Gracias por su compra total: "+total+"Bs");
        //Producto producto1=new Producto("Producto1", 100, 8, "Descripcion1");
        //Producto producto2=new Producto("Producto2", 150, 58, "Descripcion2");
        //Producto producto3=new Producto("Producto3", 80, 20, "Descripcion");
        //inventario.put(producto1.ingresarNombre(), producto1);
        //inventario.put(producto2.ingresarNombre(), producto2);
        //inventario.put(producto3.ingresarNombre(), producto3);

    }
}

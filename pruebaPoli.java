class Per{
    private String nombre;
    private int edad;
    private String direccion;

    public Per(String nombre, int edad, String direccion){
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
class Estudianteee extends Per{
    private String universidad;

    public Estudianteee(String nombre, int edad, String direccion, String universidad){
        super(nombre, edad, direccion);
        this.universidad=universidad;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Universidad: "+universidad);
    }
}


public class pruebaPoli {
    public static void main(String[] args) {
        Per estudiante1=new Estudianteee("Kevin", 27, "Av. abc", "Ucatec");
        estudiante1.mostrarInformacion();
    }
}

//Ejercicio Herencia - Clase Persona - Subclases Estudiante - Docente
class Personaa{
    String nombre;
    int ci;

    public Personaa(String nombre, int ci){
        this.nombre=nombre;
        this.ci=ci;    
    }

    //Metodos
    public void hablar(){
        System.out.println("Hola mi nombre es "+nombre);
    }
}

class Estudianteee extends Personaa{
    String carrera;
    
    public Estudianteee(String nombre, int ci, String carrera){
        super(nombre, ci);
    }
    @Override
    public void hablar(){
        System.out.println("Hola soy el estudiante "+ nombre);
    }
}




public class ejercicioHerencia2 {
    public static void main(String[] args) {
        Personaa estudiante1=new Estudianteee("Kevin", 758412, "Sistemas Informaticos");
        estudiante1.hablar();
        Personaa estudiante2=new Estudianteee("Juan", 85556, "Sistemas Informaricos");
        estudiante2.hablar();
    }
}

import java.util.Scanner;

//Crear una clase Instituto (Direccion) (Docentes) (Estudiantes). Con las subclases 
class Docentes{
    Scanner scanner=new Scanner(System.in);
    String nombreDocente;
    String carrera;
    String materia;
    String informe;
    public Docentes (String nombreDocente, String carrera, String materia, String informe){
        this.nombreDocente=nombreDocente;
        this.carrera=carrera;
        this.materia=materia;
        this.informe=informe;
    }

    //Metodos o Acciones
    public void evaluar(String nombreEstudiante){
        int notaFinal=0;
        //Bucle itertivo para la obtencion de las notas
        for(int i=1;i<=5;i++){
            System.out.print("Ingrese la nota del estudiante: ");
            int nota=scanner.nextInt();
            notaFinal+=nota;
        }
        int promedio=notaFinal/5;
        if(promedio>=61){
            System.out.println("El docente esta evaluando al estudiante "+nombreEstudiante+ " La nota final es "+promedio+ " Estado: Aprobado");
            informe="Nombre estudiante "+nombreEstudiante+ " La nota final es "+promedio+ " Estado: Aprobado";
            
        }else{
            System.out.println("El docente esta evaluando al estudiante "+nombreEstudiante+ " La nota final es "+promedio+ " Estado: Reprobado");
            informe="Nombre estudiante "+nombreEstudiante+ " La nota final es "+promedio+ " Estado: Reprobado";
        }
       
    }
    public void informe(String informeEntregado){
        System.out.println("Informe estudiantes: "+informeEntregado);
    }
}
class Direccion extends Docentes{
    String nombreDirector;
    int carreras;
    String designaciones;

    public Direccion(String nombreDirecctor,int carreras, String designaciones, String materia, String nombreDocente, String carrera, String informe){
        super(nombreDocente,carrera, materia,informe);
        this.nombreDirector=nombreDirecctor;
        this.carreras=carreras;
        this.designaciones=designaciones;
    }
    //Metodos para la subclase Direccion
    public void recepcionInformes(){
        System.out.println("Informe de la materia");
    }
    public void asignacionMateria(){
        System.out.println("Asignacion de materias a docentes y estudiantes");
    }
}
class Estudiantes {
    int ci;
    String nombreEstudiante;
    String carrera;
    
    public Estudiantes(int ci, String nombreEstudiante, String carrera){
        this.ci=ci;
        this.nombreEstudiante=nombreEstudiante;
        this.carrera=carrera;
    }
    //Metodos del estudiantes
    public void estudiar(){
        System.out.println("El estudiante esta estudiando");
    }
    public void darExamen(){
        System.out.println("El estudiante esta dando su examen");
    }

}

public class herencia {
    public static void main(String[] args){
        //Scanner scanner=new Scanner(System.in);
        Docentes docente1=new Docentes("Kevin Arroyo", "Sistemas Informaticos", "Objetos III","");
        Direccion direccion=new Direccion("Maria Jesus Bracamonte", 8, "Objetos III - 5", "Objetos III", "Kevin Arroyo", "Sistemas Informaticos",docente1.informe);
        Estudiantes estudiante1=new Estudiantes(745896, "Yeltsin Ancachi", "Sistemas Informaticos");
        System.out.println("Materia designada: "+ direccion.materia+ "al docente "+direccion.nombreDocente);
        System.out.println("Nuevo estudiantes asignado a la carrera de Sistemas informaticos "+estudiante1.nombreEstudiante);
       
        //direccion.asignacionMateria();
        //estudiante1.estudiar();
        docente1.evaluar(estudiante1.nombreEstudiante);
        direccion.informe(docente1.informe);
        

    }    
}

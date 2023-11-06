//Importar las clases a utilizar
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Estudiantes{
    private String nombre;
    private Map<String,Integer> materias=new HashMap<>(); //Diccionario de Materias
    public Estudiantes(String nombre) {
        this.nombre=nombre;
    }
    //Crear los metodos
    public void inscribirMateria(String materia){
        materias.put(materia, 0);
    }
    public void darExamen(String materia, int nota){
        materias.put(materia, nota);
    }
    public String mostrarNombre(){
        return nombre;
    }
    public Map<String,Integer> mostrarNotas(){
        return materias;
    }
}

//clase prueba

class Est{
    private String nombre;
    private Map<String,Integer>materias=new HashMap<>();

    public Est(String nombre){
        this.nombre=nombre;
    }
    //Crear los metodos
    public void inscribirMateria2(String materia){
        materias.put(materia, 0);
    }
    public void darExamen2(String materia, int nota){
        materias.put(materia, nota);
    }
    public String mostrarNombre2(){
        return nombre;
    }
    public Map<String,Integer> mostrarNotas2(){
        return materias;
    }
}


//Clase Docente
class Docente{
    private String nombre;
    private Map<String, Est> aprobados=new HashMap<>(); //Diccionario para Estudiantes Aprobados
    private Map<String,Est> reprobados=new HashMap<>(); //Diccionario para Estudiantes Reprobados

    public Docente(String nombre){
        this.nombre=nombre;
    }
    //Crear los metodos de DOCENTE
    public void evaluarNotas(String materia, Map<String, Est> estudiantes){
        for(Est estudiante:estudiantes.values()){
            int nota=estudiante.mostrarNotas2().get(materia);
            if(nota>=61){
                aprobados.put(estudiante.mostrarNombre2(),estudiante);
            }else{
                reprobados.put(estudiante.mostrarNombre2(),estudiante);
            }
        }
    }
    //Metodo para mostar las lista de aprobados
    public Map<String, Est> mostrarAprobados(){
        return aprobados;
    }
    //Metodo para mostrar la lista de reprobados
    public Map<String, Est> mostrarReprobados(){
        return reprobados;
    }
}


public class sistema {
    public static void main(String[] args) {
        //Crear el diccionario para estudiantes
        Map<String, Est> estudiantes=new HashMap<>();
        Map<String, Docente> docentes=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("*** INSTITUTO CATEC ***");
            System.out.println("1. Agregar Estudiantes");
            System.out.println("2. Agregar Docentes");
            System.out.println("3. Crear Materia");
            System.out.println("4. Asignar Materia a Estudiante");
            System.out.println("5. Dar examen");
            System.out.println("6. Evaluar Notas");
            System.out.println("7. Informe de Aprobados");
            System.out.println("8. Informe de Reprobados");
            System.out.println("9. Salir");
            System.out.print("Seleccione la opcion que dese realizar: ");
            int opcion=scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante=scanner.next();
                    Est nuevo=new Est(nombreEstudiante);
                    estudiantes.put(nombreEstudiante, nuevo);
                    //System.out.println(nuevo.mostrarNombre2());
                    //Estudiantes nuevoEstudiante=new Estudiantes(nombreEstudiante);
                    //System.out.println(nuevoEstudiante);
                    //estudiantes.put(nombreE, nuevoEstudiante);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del Docente: ");
                    String nombreDocente=scanner.next();
                    Docente nuevoDocente=new Docente(nombreDocente);
                    docentes.put(nombreDocente, nuevoDocente);
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la Materia: ");
                    String materia=scanner.next();
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del Estudiante: ");
                    String nombreEstudiante2=scanner.next();
                    System.out.print("Ingrese la materia a asignar: ");
                    String materia2=scanner.next();
                    if(estudiantes.containsKey(nombreEstudiante2)){
                        estudiantes.get(nombreEstudiante2).inscribirMateria2(materia2);
                    }else{
                        System.out.println("Estudiante no registrado...");
                    }
                    break;
                case 5:
                    //Evaluacion
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante3=scanner.next();
                    System.out.print("Ingrese la materia: ");
                    String materia3=scanner.next();
                    int nota=0;
                    if(estudiantes.containsKey(nombreEstudiante3)&& estudiantes.get(nombreEstudiante3).mostrarNotas2().containsKey(materia3)){
                        //Verificacion de la existencia del estudiante y su materia asignada.
                        System.out.println("***Examen "+materia3+" ****");
                        System.out.println("Cual es la clase para crear diccionarios?");
                        System.out.println("1. Diccionary");
                        System.out.println("2. Map");
                        System.out.println("3. Put");
                        System.out.println("4. Get");
                        System.out.println("5. Funtion Map<>");
                        System.out.print("Seleccione la respuesta correcta: ");
                        int p1=scanner.nextInt();
                        if(p1==2){
                            nota=nota+20;
                        }
                        System.out.println("***Examen "+materia3+" ****");
                        System.out.println("Cual es la clase para crear diccionarios?");
                        System.out.println("1. Diccionary");
                        System.out.println("2. Map");
                        System.out.println("3. Put");
                        System.out.println("4. Get");
                        System.out.println("5. Funtion Map<>");
                        System.out.print("Seleccione la respuesta correcta: ");
                        int p2=scanner.nextInt();
                        if(p2==2){
                            nota=nota+20;
                        }
                        System.out.println("***Examen "+materia3+" ****");
                        System.out.println("Cual es la clase para crear diccionarios?");
                        System.out.println("1. Diccionary");
                        System.out.println("2. Map");
                        System.out.println("3. Put");
                        System.out.println("4. Get");
                        System.out.println("5. Funtion Map<>");
                        System.out.print("Seleccione la respuesta correcta: ");
                        int p3=scanner.nextInt();
                        if(p3==2){
                           nota=nota+20;
                        }
                        System.out.println("***Examen "+materia3+" ****");
                        System.out.println("Cual es la clase para crear diccionarios?");
                        System.out.println("1. Diccionary");
                        System.out.println("2. Map");
                        System.out.println("3. Put");
                        System.out.println("4. Get");
                        System.out.println("5. Funtion Map<>");
                        System.out.print("Seleccione la respuesta correcta: ");
                        int p4=scanner.nextInt();
                        if(p4==2){
                            nota=nota+20;
                        }
                        System.out.println("***Examen "+materia3+" ****");
                        System.out.println("Cual es la clase para crear diccionarios?");
                        System.out.println("1. Diccionary");
                        System.out.println("2. Map");
                        System.out.println("3. Put");
                        System.out.println("4. Get");
                        System.out.println("5. Funtion Map<>");
                        System.out.print("Seleccione la respuesta correcta: ");
                        int p5=scanner.nextInt();
                        if(p5==2){
                            nota=nota+20;
                        }

                        System.out.println("La nota final es: "+nota);
                        estudiantes.get(nombreEstudiante3).darExamen2(materia3,nota);
                        

                    }else{
                        System.out.println("Estudiante o materia no asignada");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el nombre del docente: ");
                    String nombreDocente2=scanner.next();
                    System.out.print("Ingrese la materia: ");
                    String materia4=scanner.next();

                    if(docentes.containsKey(nombreDocente2)){
                        docentes.get(nombreDocente2).evaluarNotas(materia4,estudiantes);
                    }else{
                        System.out.println("Docente no registrado");
                    }
                    break;
                case 7:
                    System.out.println("*** Informe Estudiantes Aprobados ***");
                    String nombreDocente3=scanner.next();
                    for(String nombre:docentes.get(nombreDocente3).mostrarAprobados().keySet()){
                        System.out.println("Estudiante aprobados :"+ nombre);
                    }
                    break;
                case 8:
                    String nombreDocente4=scanner.next();
                    System.out.println("*** Informe Estudiantes Reprobados ***");
                    for(String nombre:docentes.get(nombreDocente4).mostrarReprobados().keySet()){
                        System.out.println("Estudiante reprobados :"+ nombre);
                    }
                    break;
                case 9:
                    break;
                default:
                    break;
            }
        }

    }
}

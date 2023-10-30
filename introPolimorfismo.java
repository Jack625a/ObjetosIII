//Polimorfismo
//Tipos
//1. Polimorfismo de tiempo de compilacion
//Calculadora

class Calcular{
    //Metodo de sumar
    int sumar(int x, int y){
        return x+y;
    }
    double sumar(double x, double y){
        return x+y;
    }
    int restar(int x, int y){
        return x-y;
    }
    double restar(double x, double y){
        return x-y;
    }
    int multiplicar(int x,int y){
        return x*y;
    }
    double multiplicar(double x, double y){
        return x*y;
    }
    int dividir(int x, int y){
        return x/y;
    }
    double dividir(double x, double y){
        return x/y;
    }
}


//2. Polimorfismo del tiempo de ejecucion 
//
class PersonaCatec{
    String nombre;
    int edad;
    public PersonaCatec(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    void dormir(){
        System.out.println("Esta durmiendo....");
    }
    void comer(){
        System.out.println("Esta comiendo....");
    }
}

class EstudianteCatec extends PersonaCatec{
    String carrera;
    public EstudianteCatec(String nombre, int edad, String carrera){
        super(nombre, edad);
        this.carrera=carrera;
    }
    @Override
    void comer(){
        System.out.println("El estudiante esta comiendo");
    }
    //void estudiar(){
      //  System.out.println("El estudiante Esta estudiando");
    //}
}
class DocenteCatec extends PersonaCatec{
    String materiaDesignada;
    public DocenteCatec(String nombre, int edad, String materiaDesignada){
        super(nombre, edad);
        this.materiaDesignada=materiaDesignada;
    }
    //@Override
    void comerD(){
        System.out.println("El docente esta comiendo");
    }
    void calificarD(){
        System.out.println("El docente esta calificando");
    }
}


public class introPolimorfismo {
    public static void main(String[] args) {
        ////1. Polimorfismo de tiempo de compilacion
        //Calcular calculadora=new Calcular();
        //int resultado=calculadora.sumar(210, 120);
        //double resul=calculadora.sumar(7, 85);

        //System.out.println("La suma entera es: "+resultado);
        //System.out.println(("La suma en decimales es: "+resul));

        //2. Polimorfismo del tiempo de ejecucion
       EstudianteCatec est1=new EstudianteCatec("Ke", 27, "Sistemas");
       est1.comer();

    }    
}

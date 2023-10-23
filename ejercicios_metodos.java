import java.util.Scanner;
public class ejercicios_metodos {
    //Ejercicio 1- Metodo Basico sin parametros
    public static void main(String[]args){
        bienvenida();
        bienvenida();
        bienvenida();
        bienvenidaP("Kevin",27);
        bienvenidaP("Jose",23);
        bienvenidaP("Juan",25);

        //double suma=sumar(7.0, 15.4);
        //System.out.println("La suma es: "+suma);
        //int resta=restar(1, 8);
        //System.out.println("La resta es "+resta);
        //double a=sumar(suma, resta);
        //System.out.println("La suma de "+suma+"+"+resta+"="+a);
        
        double suma=Calculadora.sumar(80.0,5.5);
        System.out.println("Restultado:"+suma);
       
        Estudiante kevin=new Estudiante("Kevin",27);
        //Estudiante juan=new Estudiante("Juan", 25);
        //Estudiante maria=new Estudiante("Maria", 23);
        saludar(kevin);
        //saludar(estudiante2);
        //saludar(estudiante3);





    }
     //Ejercicio 1- Metodo Basico sin parametros
    public static void bienvenida(){
        System.out.println("Hola bienvenido");
    }
     //Ejercicio 2- Metodo Basico con parametros
     public static void bienvenidaP(String nombre, int edad){
        System.out.println("Hola bienvenido "+nombre+ " - Edad: "+edad);
     }
    //Ejercicio 3. Metodos con Valor de Retorno
    //public static double sumar(double a,double b){
      //  return a+b;
   // }
    //public static int restar(int a, int b){
      //  return a-b;
    //}
    //public static int multiplicar(int a, int y){
      //  return a*y;
    //}
    //public static int dividir(int a, int b){
      //  return a/b;
    //}
    //Ejercicio 4. Metodos Estaticos
    static class Calculadora{
        public static double sumar(double a,double b){
            return a+b;
    }
    public static int restar(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int y){
        return a*y;
    }
    public static int dividir(int a, int b){
        return a/b;
    }
    
}
public static void saludar(Estudiante estudiante){
    System.out.println("Hola bienvenido "+ Estudiante.obtenerNombre()+ "- Edad: "+Estudiante.obtenerEdad());
}

//Metodos con Objetos como Parametros   
static class Estudiante{
        private static String nombre;
        private static int edad;

        public Estudiante(String nombre, int edad){
            this.nombre=nombre;
            this.edad=edad;
        }
        public static String obtenerNombre(){
            return nombre;
        }
        public static int obtenerEdad(){
            return edad;
        }
    }

}

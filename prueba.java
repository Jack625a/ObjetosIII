//Definir la clase principal
public class Prueba{
    public static void main(String[]args){
        //METODOS Y ATRIBUTOS
        System.out.println("Hola bienvenidos!");
        //Declaracion de Variables
        //Tipos de datos Numericos (int - double - float)
        int numero=15; //Entero
        double numero2=15.54688847; //Decimal
        //Tipos de datos Cadenas de Caracteres
        char materia;
        String materia2="OBJETOS III";
        //Tipos de datos Boleanos
        boolean prender=false;
        //Conversion de Datos 
        double conversion=(double)numero;
        System.out.println(numero);
        System.out.println(conversion);
        //OPERADORES
        //1. Operadores Aritmeticos
        double resultado=numero+numero2;
        System.out.println("Suma: "+resultado);
        double resta=numero-numero2;
        double multiplicacion=numero*numero2;
        double division=numero/numero2;
        System.out.println("Resta:"+resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.println("Division: "+division);
        //Operadores de Cadenas de caracteres
        //1. Concatenacion (+)
        //2. Longitud de una Cadena
        int longitudCadena=materia2.length();
        System.out.println("Numero de caracteres: "+longitudCadena);
        //3. Extraccion de subcadenas (substring)
        String instituto="Instituto Catec";
        String subcadena=instituto.substring(10,15);
        System.out.println(subcadena);
        //4. Busqueda de Subcadenas indexOf()
        int posicionBuscada=instituto.indexOf("Catec");
        System.out.println(posicionBuscada);
        //5. Reemplazo de Subcadenas replace()
        String nuevoInstituto=instituto.replace("Catec","Ucatec");
        System.out.println(nuevoInstituto);



    }
}
//Entrada de datos
//Paso1. Importar la clase SCANNER
import java.util.Scanner;



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

        //Operadores de Comparación (TRUE - FALSE)
        //1. Igual a (==)
        System.out.println(numero==numero2);
        //2. Mayor que > >=
        System.out.println(numero>numero2);
        //3. Menor que < <=
        System.out.println(numero<numero2);
        //4. Distinto que !=
        System.out.println(numero!=numero2);

        //Operadores Logicos (TRUE - FALSE)
        //1. y &&
        System.out.println(numero==numero2 && numero>=numero2);
        //2. o ||
        //3. not !

        //Operadores de Asignacion
        //1. a+=b => a=a+b
        //2. a++ => a=a+1
        //3. a-- => a=a-1

        //Condicionales
        //1. Condicionales IF if(condicion)
        int edad=12;
        if (edad>=18){
            //Que realizara en la respuesta verdadera
            System.out.println("ES MAYOR DE EDAD");
        }else{
            System.out.println("NO ES MAYOR DE EDAD");
        }
        //2. Condicionales if else

        //3. Condicionales switch
        //Menu para Calculadora Basica
        //Suma, Resta, Division, Multiplicacion
        String opcion="Sum";
        switch (opcion){
            case "Suma":
                //SUMA
                System.out.println("Selecciona la Suma");
                break;
            case "Resta":
                //RESTA
                System.out.println("Selecciono la Resta");
                break;
            case "Division":
                //Division
                System.out.println("Selecciono la division");
                break;
            case "Multiplicacion":
                //Multiplicacion
                System.out.println("Selecciono la multiplicacion ");
            default:
                System.out.println("Opereacion no valida");

        }

        //Bucles 
        // Bucles Iterativos for
        for (int i=1; i<=10; i++){
            //Codigo a mostrar
            System.out.println(i);
        }
        //Bucles repetitivos while
        int contador=1;
        while (contador<=10){
            System.out.println(contador); 
            contador++;
        }
        //Bucles Repetivos do while
        int cont=1;
        do{
            System.out.println(cont);
            cont++;
        }while (cont<=10);


        //Entradad de datos
        //Paso 2. Crear la instancia de la clase SCANNER
        Scanner scanner=new Scanner(System.in);
        //Paso 3. Leer Datos de entrdada
        //1. nextInt() Lee un numero entero
        //2. nextDouble() Lee un numero decimal
        //3. nextLine() Lee una cadena de carater
    

        //Paso 4. Probar la lectura de datos
        int numero1=scanner.nextInt();
        int numero3=scanner.nextInt();
        int sumar=numero1+numero3;
        System.out.println("La suma de "+numero1+"+"+numero3+"="+sumar);



    }
}
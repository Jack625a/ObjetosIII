public class metodos {
    //Declararcion de un Metodo
    //nombreMetodo(parametros){
    // Cuerpo del metodo   
    //}
    //Declarion de un metodo ("SUMAR(a,b)")
        public int sumar(int a, int b){
            int resultado=a+b;
            return resultado;
        } 

    //Metodo sin retorno de valor
    public void bienvenida(){
        System.out.println("Hola bienvenido");
    }

    //Llamar o utilizar el metodo
    int suma=sumar(8, 15);
    int a=sumar(6, 7);

    //Metodos Estaticos
    public static int restar(int a, int b){
        return a-b;
    }
    int resta=restar(4, 74);

    //Metodos de Instancias
     public void bienvenidas(String nombre){
        System.out.println("Hola bienvenido "+nombre);
    }
}

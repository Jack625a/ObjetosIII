class Persona{
    void comer(){
        System.out.println("Esta comiendo");
    }
}
class Estudiante extends Persona{
    @Override
    void comer(){
        System.out.println("El estudiante esta comiendo");
    }
}

public class pruebaPoli {
    public static void main(String[] args) {
        Persona persona=new Estudiante();
        persona.comer();
    }
}

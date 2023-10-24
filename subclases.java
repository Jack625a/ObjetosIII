public class subclases {
    //CLASE PRINCIPAL PERSONA
    class Persona{
        static String nombre;
        static int edad;
        static int ci;
        public Persona(String nombre, int edad, int ci){
            this.nombre=nombre;
            this.edad=edad;
            this.ci=ci;
        }
        public void dormir(){
            System.out.println("Esta Durmiendo");
        }
        public void comer(){
            System.out.println("Esta Comiendo");
        }
    class Estudiante extends Persona{
        String carrera;
        int numeroMateriasA;
        int numeroMateriasR;
        public Estudiante(String carrera, int numeroMateriasA, int  numeroMateriasB){
            super(nombre,edad,ci);
            this.carrera=carrera;
        }
        public void estudiar(){
            System.out.println("Esta estudiando");
        }
    }
    }
}

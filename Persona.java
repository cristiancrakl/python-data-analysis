public class Persona {
    // Atributos de la clase
    private String nombre; // Atributo para el nombre de la persona
    private int edad;      // Atributo para la edad de la persona
    private String genero;  // Atributo para el género de la persona

    // Constructor de la clase
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre; // Inicializa el atributo nombre
        this.edad = edad;     // Inicializa el atributo edad
        this.genero = genero; // Inicializa el atributo genero
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 30, "Masculino");
        persona1.mostrarInformacion(); // Salida: Nombre: Juan, Edad: 30, Género: Masculino
    }
}
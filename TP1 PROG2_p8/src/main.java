public class main {
    public static void main(String[] args) {
        // Crear un gerente
        Gerente gerente = new Gerente("Juan", 40, 5000, "Ventas");
        gerente.organizarActividades();
        gerente.trabajar();

        // Crear un trabajador
        Trabajador trabajador = new Trabajador("María", 25, 3000, "Producción");
        trabajador.producir();
        trabajador.trabajar();
    }
}

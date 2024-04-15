public class Trabajador extends Empleado {
    private String area;

    public Trabajador(String nombre, int edad, double salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }

    public void producir() {
        System.out.println(getNombre() + " está produciendo en el área de " + area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

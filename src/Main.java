
public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", "123", 48000);
        empleados[1] = new EmpleadoMedioTiempo("Maria", "456", 20, 25);

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Número de Identificación: " + empleado.getNumeroIdentificacion());
            System.out.println("Salario Mensual: " + empleado.calcularSalario());
            System.out.println();
        }
    }
}
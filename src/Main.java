import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[3];

        for (int i = 0; i < empleados.length; i++) {

            System.out.println("Ingresar los datos del empleado: ");

            System.out.printf("Ingresa el nombre: ");
            String nombre = sc.nextLine();
            System.out.printf("Ingresa su cargo: ");
            String cargo = sc.nextLine();
            System.out.printf("Ingresa su salario: ");
            Double salario = sc.nextDouble();
            System.out.printf("Ingresa el día de ingreso(1-31): ");
            Integer dia = sc.nextInt();
            System.out.printf("Ingresa el mes de ingreso(1-12): ");
            Integer mes = sc.nextInt();
            System.out.printf("Ingresa el año de ingreso: ");
            Integer anio = sc.nextInt();
            sc.nextLine(); //limpiar el buffer

            empleados[i] = new Empleado(nombre, cargo, salario, dia, mes, anio);
        }

        System.out.println("\nMostrando Información de Empleados...");
        for (Empleado e : empleados){
            e.mostrar_informacion();
        }
    }
}
public class Empleado {
    //nombre, cargo, salario y fecha de ingreso (dia, mes, anio)
    private String nombre;
    private String cargo;
    private Double salario;
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Empleado(String nombre, String cargo, Double salario, Integer dia, Integer mes, Integer anio){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void mostrar_informacion(){
        System.out.println("Nombre del Empleado: "+nombre);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salario: "+salario);
        System.out.println("Fecha de ingreso a la empresa: "+dia+"/"+mes+"/"+anio);
    }
}
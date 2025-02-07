package entrega_colecciones;
//Marcos Pallas Perez
import java.util.HashMap;
import java.util.Scanner;

public class Clinica {

	public static void imprimirMenu() {
		System.out.println("Opciones 1-8");
		System.out.println("1.Introducir datos de un paciente nuevo");
		System.out.println("2.Obtener los datos de un paciente");
		System.out.println("3.Averiguar si el paciente tiene fiebre o no");
		System.out.println("4.Muestra el codigo y el nombre de los pacientes mayores de 65 años");
		System.out.println("5. Modificar el colesterol de un paciente");
		System.out.println("6.Mostrar el numero de paciente con colesterol alto");
		System.out.println("7.Eliminar un paciente");
		System.out.println("8.Salir");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		HashMap <Integer,Paciente> pacientes=new HashMap<>();
		int opcion=0;
		String nombre="";
		int edad=0;
		double temperatura=0;
		int colesterol_actual=0;
		int colesterol_nuevo=0;
		int n_colesterol=0;
		Integer codigo=0;
		Integer codigo_busqueda=0;
		Paciente pac=new Paciente();
		do {
			Clinica.imprimirMenu();
			opcion=entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce un codigo para el paciente");
				codigo=entrada.nextInt();
				System.out.println("Introduce la edad para el paciente");
				edad=entrada.nextInt();
				System.out.println("Introduce un nombre para el paciente");
				nombre=entrada.next();
				entrada.nextLine();
				System.out.println("Introduce la temperatura del paciente");
				temperatura=entrada.nextDouble();
				System.out.println("Introduce el nivel del colesterol");
				colesterol_actual=entrada.nextInt();
				pac=new Paciente(nombre,edad,temperatura,colesterol_actual);
				pacientes.put(codigo, pac);
				
				break;
				
			case 2:
				System.out.println("Dime el codigo del paciente");
				codigo_busqueda=entrada.nextInt();		
				if(pacientes.containsKey(codigo_busqueda)) {
					System.out.println("Nombre: " + pac.getNombre() + " Edad: " + pac.getEdad() + " Temperatura: " + pac.getTemperatura()+ " Colesterol: " + pac.getN_colesterol());
				}
				break;
				
			case 3:
				System.out.println("Dime el codigo del paciente");
				codigo_busqueda=entrada.nextInt();	
				if(pacientes.containsKey(codigo_busqueda)) {
					if(pac.getTemperatura()>37.5) {
						System.out.println("Tiene fiebre");
					}else {
						System.out.println("No tiene fiebre");
					}
				}
				break;
			
			case 4:
					
				break;
				
			
			case 5:
				System.out.println("Dime el codigo del paciente");
				codigo_busqueda=entrada.nextInt();	
				if(pacientes.containsKey(codigo_busqueda)) {
					System.out.println("Dime el numero de colesterol");
					colesterol_nuevo=entrada.nextInt();
					pac.setN_colesterol(colesterol_nuevo);
				}
				break;
				
				
			case 6:
				for(int i=0;i<pacientes.size();i++) {
				if(pac.getN_colesterol()>300) {
					n_colesterol++;
				}}
				System.out.println("El nº de pacientes con colesterol es " + n_colesterol);
				break;
			case 7:
				System.out.println("Dime el codigo del paciente");
				codigo_busqueda=entrada.nextInt();	
				pacientes.remove(codigo_busqueda);
				break;
				
			case 8:
				System.out.println("Saliendo");
				break;
				
			default: System.out.println("Numero incorrecto");
			}
		}while(opcion!=8);
		
	}

}

class Paciente {
	String nombre;
	int edad;
	double temperatura;
	int n_colesterol;
	
	
 Paciente(String nombre, int edad, double temperatura, int n_colesterol) {
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.n_colesterol = n_colesterol;
	}
 
 Paciente() {
		this.nombre = nombre;
		this.edad = edad;
		this.temperatura = temperatura;
		this.n_colesterol = n_colesterol;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public int getN_colesterol() {
		return n_colesterol;
	}
	public void setN_colesterol(int n_colesterol) {
		this.n_colesterol = n_colesterol;
	}
}
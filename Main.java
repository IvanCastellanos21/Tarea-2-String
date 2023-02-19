public class Main
{
	public static void main(String[] args) {
		String s = "Alfonso Contador Mexico";
		String nombre = s.substring(0, 7);
		String profesion = s.substring(8, 16);
		String pais = s.substring(17, 23);
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Profesion: " + profesion);
		System.out.println("Pais: " + pais);
	}
} 

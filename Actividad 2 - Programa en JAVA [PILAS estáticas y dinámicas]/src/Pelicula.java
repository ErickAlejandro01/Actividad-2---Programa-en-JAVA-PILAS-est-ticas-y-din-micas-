import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Pelicula {
	private static Object String;
	private static String TituloPelicula;
	private static String GeneroPelicula;
	private int Cima;
	public void RentaDePeliculas(int Tamaño) {
		TituloPelicula=(Tamaño);
		GeneroPelicula=(Tamaño);
		Cima=-1;
	}
	public void VerificarSiPilaLlena() {
		return Cima == TituloPelicula.length-1;
		return Cima == GeneroPelicula.length-1;
	}
	public string IncertarElementos(String titu,String G) {
		if (verificar si pila llena()) {
			return false;
		}else {
			Cima++;
			TituloPelicula(Cima)=titu;
			GeneroPelicula(Cima)=G;
			return true;
		}
	}
	public String VerificarSiPilaVacia() {
		return Cima==TituloPelicula.length-1;
		return Cima==GeneroPelicula.length-1;
	}
	public static void (String [] args) {
		Pelicula[] LasPeliculas= new Pelicula[];
		Genero[] LosGeneros=new Genero[];
		LasPeliculas[].setTituloPelicula();
		LosGeneros[].setGeneroPelicula();
	}
	public Stack RentaDePeliculas() {
		Stack(1)TituloPelicula = new Stack(1)();
		Stack(2)GeneroPelicula = new Stack(2)();
		TituloPelicula.push(Numero);
		GeneroPelicula.push(Numero);
		TituloPelicula.push(Numero);
		GeneroPelicula.push(Numero);
		TituloPelicula.push(Numero);
		GeneroPelicula.push(Numero);
		
		try {
			1 objetoeliminado=null;
			while(true) {
				ObjetoEliminado=TituloPelicula.pop();
				ObjetoEliminado=GeneroPelicula.pop();
			}catch(EmptyStackException emptyStackExeption) {
				emptyStackExeption.printStackTrace();
				
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int OpcionElegida=sc;
		String = TituloPelicula;
		String = GeneroPelicula;
		while(OpcionElegida !=4) {
			System.out.println("Introdice La Opcion Deseada");
			System.out.println("1: Cargar BD De Pelicula");
			System.out.println("2: Rentar Pelicula");
			System.out.println("3: Devolver Pelicula");
			System.out.println("4: Mostrar Cantidad De Peliculas Disponibles Para Rentar");
			switch (OpcionElegida){
			case 1
				System.out.println("Introduce Al Menos 5 BD de peliculas");
				TituloPelicula = sc.next();
				TituloPelicula.put("1 BD Pelicula" + TituloPelicula);
				TituloPelicula = sc.next();
				TituloPelicula.put("2 BD Pelicula" + TituloPelicula);
				TituloPelicula = sc.next();
				TituloPelicula.put("3 BD Pelicula" + TituloPelicula);
				TituloPelicula = sc.next();
				TituloPelicula.put("4 BD Pelicula" + TituloPelicula);
				TituloPelicula = sc.next();
				TituloPelicula.put("5 BD Pelicula" + TituloPelicula);
				break;
			case 2
				showStackTituloPelicula;
				System.out.println("Selecciona La Pelicula");
				TituloPelicula = sc.next();
				String TituloPelicula = (String)Stack.pop();
				Writeline("Pelicula"+ TituloPelicula+"Rentada");
				break;
			case 3
				ShowStackTituloPelicula
				System.out.print("Seleccione Pelicula A Devolver");
				TituloPelicula = sc.next();
				String TituloPelicula = (String) Stack.push();
				Writeline("Pelicula" + TituloPelicula +"Devuelta");
				break;
			case 4
				Show Stack TituloPeliculas();
			break;
				default;
					System.out.println("Tienes Que Introducir Una Opcion Valida");
			}
		}

	}

}

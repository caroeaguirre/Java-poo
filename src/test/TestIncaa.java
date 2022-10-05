package test;

import incaaNivel2.Genero;
import incaaNivel2.Incaa;

public abstract class TestIncaa {

	public static void main(String[] args) {
		
		Genero g1 = new Genero(1, "terror");
		Genero g2 = new Genero(2, "animada");
		Genero g3 = new Genero(3, "romantica");
		
		Incaa sist = new Incaa();
		
		System.out.println("test 1");
		try {
			sist.agregarPelicula("cars", g2);
			sist.agregarPelicula("no respires", g1);
			sist.agregarPelicula("Love, rosie", g3);
			
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		System.out.println("test 2");
		try {
			
			System.out.println(sist.traerPelicula(g3));
			System.out.println(sist.traerPelicula(1));
			System.out.println(sist.traerPelicula("resp"));
			
		}
		catch(Exception e){
				
				System.out.println(e.getMessage());
			
		}
		
		System.out.println("test 3");
		try {
			
			sist.modificarPelicula(3, "LOVE, ROSIE");
			//System.out.println(sist.traerPelicula("LOVE"));
			
			
		}
		catch(Exception e){
				
			
		}

		System.out.println(sist.traerPelicula(g3));
		System.out.println(sist);
	}
	

}

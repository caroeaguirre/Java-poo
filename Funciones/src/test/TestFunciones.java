package test;

import java.time.LocalDate;
import java.time.LocalTime;

import funciones.Funciones;

public class TestFunciones {

	public static void main(String[] args) {

		
		LocalDate fecha = LocalDate.of(2022, 8, 26);
		LocalDate fecha2 = LocalDate.of(2022, 8, 27);
		LocalDate fecha3 = LocalDate.of(2022, 8, 30);
		LocalTime hora = LocalTime.of(10, 30);
		
		System.out.println(Funciones.traerFechaCorta(fecha));
		System.out.println(Funciones.traerHoraCorta(hora));
		//System.out.println(Funciones.esDiaHabil(fecha));
		System.out.println(Funciones.traerMesEnLetras(fecha));
		System.out.println(Funciones.traerFechaLarga(fecha));
		
		char c = 'e';
		
		System.out.println(Funciones.esNum(c));
		System.out.println(Funciones.esLetra(c));
		System.out.println(Funciones.estaEnRango(fecha, fecha2, fecha3));
		
		
	}

}

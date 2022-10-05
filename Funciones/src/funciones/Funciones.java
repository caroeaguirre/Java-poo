package funciones;

import java.time.LocalDate;

import java.time.LocalTime;


public class Funciones {

	
	public static boolean esBiciesto(int anio) {
		
		return  ((anio%4==0) && (anio%100 != 0 && anio%400 == 0));
		
		}
	
	public static boolean esFechaValida(LocalDate fecha) {
		
		return esBiciesto(fecha.getYear());
		
	}
	
	public static String traerFechaCorta(LocalDate fecha) {
		
		
		return (String.valueOf(fecha.getDayOfMonth())+ "/"+String.valueOf(fecha.getMonthValue())
		+"/"+String.valueOf(fecha.getYear()));
	}
	
	
	public static String traerFechaLarga(LocalDate fecha) {
		
		
		return (traerDiaSemana(fecha) + " " + String.valueOf(fecha.getDayOfMonth()) + " de " + traerMesEnLetras(fecha) +" del "+ fecha.getYear());
		
	}
	
	public static String traerHoraCorta(LocalTime hora) {
		
		
		return (String.valueOf(hora.getHour())+":"+ String.valueOf(hora.getMinute()));
	}

	public static boolean esDiaHabil(LocalDate fecha) {
		
		return (fecha.getDayOfWeek().getValue()<6);
		
	}
	
	public static String traerDiaSemana(LocalDate fecha) {
		
		return fecha.getDayOfWeek().toString();		
	}
	
	public static String traerMesEnLetras(LocalDate fecha) {
		
		return fecha.getMonth().toString();
	}
	
	public static int traerCantDiasEnMes(int mes, int anio) {
			
			int numeroDias=-1;
			 
			  switch(mes){
	            case 1:
	            case 3:
	            case 5:
	            case 7:
	            case 8:
	            case 10:
	            case 12:
	                numeroDias=31;
	                break;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                numeroDias=30;
	                break;
	            case 2:
	            	if (esBiciesto(anio)) {
	                    numeroDias=29;
	                }else{
	                    numeroDias=28;
	                }
	                break;
	        }
		return numeroDias;  
	}
	
	
	public static boolean esLetra(char c) {
		
		
		return Character.isAlphabetic(c);
		
	}
	
	
	public static boolean esNum(char c) {
		
		
		//puedo usar isDigir o reutilizar el es letra
		return !esLetra(c);
		
	}

	
	
	 public static boolean esCadenaNros(String cadena) {
	 
		
	        boolean esNum = true;
	        int i = 0;
	        while ( i < cadena.length() && esNum==true) {
	            if (!Character.isAlphabetic(i)) {
	                esNum= false;
	            }
	          i++;
	        }
	        return esNum;
	    }
	 

	public static boolean esCadenaLetras(String cadena) {
	 
       boolean esLetra = true;
       int i = 0;
       while ( i < cadena.length() && esLetra==true) {
           if (!Character.isAlphabetic(i)) {
               esLetra= false;
           }
         i++;
       }
       return esLetra;
   }

	public static boolean estaAntes(LocalDate f1, LocalDate f2) {
		
		return (f1.isBefore(f2));
		
	}

	public static boolean estaDespues(LocalDate f1, LocalDate f2) {
		
		return (f1.isAfter(f2));
		
	}
	
	public static boolean estaEnRango(LocalDate f1, LocalDate fFin, LocalDate FInicio) {
		
		return ((f1.isBefore(FInicio)||	f1.equals(FInicio))&&(f1.isAfter(fFin)||f1.equals(fFin)));
	}
	
}
	/* aproximar2Decimal (double valor) : double
	 Si el tercer decimal es mayor o igual 5, suma 1 al segundo decimal

	*/


	
	
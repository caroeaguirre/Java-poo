package incaaNivel2;

import java.util.ArrayList;
import java.util.List;

public class Incaa {
	
	private List<Pelicula> catalogo;

	public Incaa() {
		super();
		this.catalogo = new ArrayList<Pelicula>();;

	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	@Override
	public String toString() {
		return "\nIncaa [catalogo=" + catalogo + "]";
	}
	
	
	public List<Pelicula> traerPelicula(String partePelicula) {
		
		
		List<Pelicula> listRetorno= new ArrayList<Pelicula>();
		
		for (Pelicula p : catalogo) {
			
			if (p.getPelicula().contains(partePelicula)) {
				
				listRetorno.add(p);
			}
		}
		
		return listRetorno;
	}
	
	
	public Pelicula traerPeliculaPorTitulo(String pelicula) {
		
		Pelicula x = null;
		int i = 0;
		
		while (i<catalogo.size() && x== null) {
			
			if (catalogo.get(i).getPelicula()==pelicula) {
				
				x=catalogo.get(i);
			}
			i++;
		}
		
		return x;
	}
	
	public Pelicula traerPelicula(int id) {
		
		Pelicula x = null;
		int i = 0;
		
		while (i<catalogo.size() && x == null) {
			
			if (catalogo.get(i).getIdPelicula()==id) {
				
				x=catalogo.get(i);
			}
			i++;
		}
		
		return x;
	}
	
	
	public boolean agregarPelicula(String pelicula, Genero genero) throws Exception{
		
		
		//me fijo si la peli existe, si es asi, tipo excepcion
		
		if(traerPeliculaPorTitulo(pelicula)!=null) throw new Exception ("la pelicula ya existe");
		
		// en caso de q no exista le creo el id, creo una nueva peli y  la agrego
		int proxId=1;
		
		if (catalogo.size()>0) {
			
			proxId=(catalogo.get(catalogo.size()-1).getIdPelicula()+1);
			
		}
		
		Pelicula p = new Pelicula(proxId, pelicula, genero);
		
		return catalogo.add(p);
		
	}
	
	
	public List<Pelicula> traerPelicula(Genero genero) {
		
		List<Pelicula> listaRetornoGenero = new ArrayList<Pelicula>();
		
		for(Pelicula p : catalogo) {
			
			//equals modificado que ve si los id de los generos son iguales
			if (p.getGenero().equals(genero)) {
				
				listaRetornoGenero.add(p);
			}
	
		}
		
		return listaRetornoGenero;
	}
	
	
	public boolean modificarPelicula(int idPelicula, String pelicula) throws Exception{
		
		
		Pelicula p = traerPelicula(idPelicula);
		
		if (p == null)throw new Exception("la pelicula no existe");
		
			
		p.setPelicula(pelicula);
			
		
		return true;
	}
	
	
	public boolean eliminarPelicula(int id)throws Exception{
		
		Pelicula p = this.traerPelicula(id);
		
		if (p==null) throw new Exception ("la pelicula no existe");
		
		return catalogo.remove(p);		
	}
	
	

	
	
	
	
	
	
	
}

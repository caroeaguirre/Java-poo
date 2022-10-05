package supermercado;

import java.util.ArrayList;
import java.util.List;


public class Supermercado {
	
	private List<Producto> gondola;

	public Supermercado() {
		super();
		this.gondola = new ArrayList<Producto>();
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	@Override
	public String toString() {
		return "\nSupermercado [gondola=" + gondola + "]";
	}
	
	
	public Producto traerProducto(String producto) {
		
		Producto p = null;
		int i =0;
		
		while (i<gondola.size() || p==null) {
			
			if (gondola.get(i).getProductoNomb()==producto) {
				
				p=gondola.get(i);
			}
			i++;
		}
		return p;
		
	}
	
	public Producto traerProducto(int idProducto) {
		
		Producto p = null;
		int i =0;
		
		while (i<gondola.size() && p==null) {
			
			if (gondola.get(i).getIdPorducto()==idProducto) {
				
				p=gondola.get(i);
			}
			i++;
		}
		return p;
		
	}
	
	public boolean agregarProducto(String producto, float precio)throws Exception {
		
		Producto p = traerProducto(producto);
		
		if (p!=null)throw new Exception ("el producto ya existe");
		
		int id = 1;
		
		if (gondola.size()>0) {
			
			id = (gondola.get(gondola.size()-1)).getIdPorducto()+1;
		}
		
		 p = new Producto(id,producto,precio);
		
		 return gondola.add(p);
		
	}
	
	public boolean modificarProducto(int idProducto, String producto, float precio)throws Exception {
		
		Producto p = traerProducto(idProducto);
		
		if (p==null)throw new Exception ("el producto no existe");
		
		p.setPrecio(precio);
		p.setProductoNomb(producto);
		
		return true;
		
	}
	
	public boolean eliminarProducto(int idProducto)throws Exception {
		
		Producto p = this.traerProducto(idProducto);
		
		
		//si existe en un carrito tiro exception
		if (p==null )throw new Exception ("el producto no existe");
		
		return gondola.remove(p);
		
	}
	
	
}

package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private int idCarrito;
	private LocalDate fecha;
	private LocalTime hora;
	private List<ItemCarrito>listaCarrito;
	
	public Carrito(int idCarrito) {
		super();
		this.idCarrito = idCarrito;
		this.fecha = LocalDate.now();
		this.hora = LocalTime.now();
		this.listaCarrito = new ArrayList<ItemCarrito>();
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public List<ItemCarrito> getListaCarrito() {
		return listaCarrito;
	}

	public void setListaCarrito(List<ItemCarrito> listaCarrito) {
		this.listaCarrito = listaCarrito;
	}

	@Override
	public String toString() {
		return "\nCarrito [idCarrito=" + idCarrito + ", fecha=" + fecha + ", hora=" + hora + ", listaCarrito="
				+ listaCarrito + "]";
	}
	
	
	public ItemCarrito traerItem(int idItem) {
		
		ItemCarrito p = null;
		int i = 0;
		
		while (i<listaCarrito.size()&&p==null) {
			if (listaCarrito.get(i).getIdItem()==idItem) {
				p = listaCarrito.get(i);
			}
					i++;
		}
		
		return p;
		
	}
	
	public ItemCarrito traerItem(Producto producto) {
		
		ItemCarrito p = null;
		int i = 0;
		
		while (i<listaCarrito.size()&&p==null) {
			if (producto.getProductoNomb().equals(p)) {
				
				p=listaCarrito.get(i);
			}
				i++;
		}
		
		return p;
		
	}
	
	public boolean agregarItem(Producto producto,int cantidad) {
		
		ItemCarrito p = traerItem(producto);
		boolean x = false;
		
		int id =1;
		
		if (listaCarrito.size()>0) {
			id =(listaCarrito.get(listaCarrito.size()-1).getIdItem()+1);
		}
		
		if(p!=null) {
			
			p.setCantidad(p.getCantidad()+cantidad);
			x=true;
		}
		else {
			
			p = new ItemCarrito(id,producto, cantidad);
			x=listaCarrito.add(p);
			
		}
		
		return x;
		
	}
	
	public boolean eliminarItem(Producto producto, int cantidad) throws Exception{
		
		ItemCarrito p = this.traerItem(producto);
		
		if (p==null)throw new Exception("el producto no existe");
		
		p.setCantidad(p.getCantidad()-cantidad);
		
		if (p.getCantidad()==0) {
			
			listaCarrito.remove(p);		
			
		}
		
		return true;
		
	}
	
}

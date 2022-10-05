package supermercado;

import java.util.Objects;

public class ItemCarrito {

	private int idItem;
	private Producto producto;
	private int cantidad;
	
	
	public ItemCarrito(int idItem, Producto producto, int cantidad) {
		super();
		this.idItem = idItem;
		this.producto = producto;
		this.cantidad = cantidad;
	}


	public int getIdItem() {
		return idItem;
	}


	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "\nItemCarrito [idItem=" + idItem + ", producto=" + producto + ", cantidad=" + cantidad + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cantidad, idItem, producto);
	}


	public boolean equals(ItemCarrito obj) {
		
		return this.idItem==obj.getIdItem();
		}

	
	public float calcularSubTotal() {
		
		
		return this.cantidad * this.producto.getPrecio();
		
	}
	
}

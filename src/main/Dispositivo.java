public class Dispositivo {

	private String marca;
	private String memoriaRam;
	private int memoriaAlmacenamiento;
	private Stirng procesador;
	private String modelo;
	private int añoDeFabricacion;
	private int precio;
	private int cantidadStock;

	public String getMarca() {
		return this.marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMemoriaRam() {
		return this.memoriaRam;
	}

	/**
	 * 
	 * @param memoriaRam
	 */
	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	/**
	 * 
	 * @param memoriaAlmacenamiento
	 */
	public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
	}

	public Stirng getProcesador() {
		return this.procesador;
	}

	/**
	 * 
	 * @param procesador
	 */
	public void setProcesador(Stirng procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoDeFabricacion() {
		return this.añoDeFabricacion;
	}

	/**
	 * 
	 * @param añoDeFabricacion
	 */
	public void setAñoDeFabricacion(int añoDeFabricacion) {
		this.añoDeFabricacion = añoDeFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return this.cantidadStock;
	}

	/**
	 * 
	 * @param cantidadStock
	 */
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

}
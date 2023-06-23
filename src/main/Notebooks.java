public class Notebooks {

	private String resolucionDePantalla;
	private String tipoTeclado;
	private int bateria;

	public String getResolucionDePantalla() {
		return this.resolucionDePantalla;
	}

	/**
	 * 
	 * @param resolucionDePantalla
	 */
	public void setResolucionDePantalla(String resolucionDePantalla) {
		this.resolucionDePantalla = resolucionDePantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	/**
	 * 
	 * @param tipoTeclado
	 */
	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	/**
	 * 
	 * @param bateria
	 */
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

}
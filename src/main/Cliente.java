
import java.util.ArrayList;
import java.util.List;
public class Cliente {

	private String nombre;
	private String apellido;
	private String correoElectronico;
	private Stirng numDeContacto;
	private String estadoCivil;
	private String ciudad;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	/**
	 * 
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	/**
	 * 
	 * @param estadoCivil
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	/**
	 * 
	 * @param ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Stirng getNumDeContacto() {
		return this.numDeContacto;
	}

	/**
	 * 
	 * @param numDeContacto
	 */
	public void setNumDeContacto(Stirng numDeContacto) {
		this.numDeContacto = numDeContacto;
	}

}
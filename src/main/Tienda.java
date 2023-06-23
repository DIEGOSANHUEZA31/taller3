public class Tienda {
	private List<Cliente> clientes;
	private List<Dispositivo> dispositivos;

	private String direccion;
	private String catalogo;
	public Tienda() {
		clientes = new ArrayList<>();
		dispositivos = new ArrayList<>();
	}

	public void agregarCliente(Cliente cliente) {
		if (!existeCliente(cliente)) {
			clientes.add(cliente);
			System.out.println("Cliente agregado correctamente");
		} else {
			System.out.println("El cliente ya existe en el sistema");
		}
	}

	private boolean existeCliente(Cliente cliente) {
		for (Cliente c : clientes) {
			if (c.getCorreo().equals(cliente.getCorreo())) {
				return true;
			}
		}
		return false;
	}

	public void agregarDispositivo(Dispositivo dispositivo) {
		dispositivos.add(dispositivo);
		System.out.println("Dispositivo agregado correctamente");
	}public Dispositivo obtenerDispositivo(String marca, String modelo, String tipo) {
		for (Dispositivo dispositivo : dispositivos) {
			if (dispositivo.getMarca().equals(marca) && dispositivo.getModelo().equals(modelo)) {
				if (tipo.equals("ComputadoraEscritorio") && dispositivo instanceof ComputadoraEscritorio) {
					return dispositivo;
				} else if (tipo.equals("Notebook") && dispositivo instanceof Notebook) {
					return dispositivo;
				} else if (tipo.equals("Tablet") && dispositivo instanceof Tablet) {
					return dispositivo;
				}
			}
		}
		return null; // Dispositivo no encontrado
	}

	public List<Dispositivo> buscarPorMarca(String marca) {
		List<Dispositivo> dispositivosMarca = new ArrayList<>();
		for (Dispositivo dispositivo : dispositivos) {
			if (dispositivo.getMarca().equals(marca)) {
				dispositivosMarca.add(dispositivo);
			}
		}
		return dispositivosMarca;
	}

	public List<Dispositivo> buscarPorModeloYTipo(String modelo, String tipo) {
		List<Dispositivo> dispositivosModeloTipo = new ArrayList<>();
		for (Dispositivo dispositivo : dispositivos) {
			if (dispositivo.getModelo().equals(modelo)) {
				if (tipo.equals("ComputadoraEscritorio") && dispositivo instanceof ComputadoraEscritorio) {
					dispositivosModeloTipo.add(dispositivo);
				} else if (tipo.equals("Notebook") && dispositivo instanceof Notebook) {
					dispositivosModeloTipo.add(dispositivo);
				} else if (tipo.equals("Tablet") && dispositivo instanceof Tablet) {
					dispositivosModeloTipo.add(dispositivo);
				}
			}
		}
		return dispositivosModeloTipo;
	}
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCatalogo() {
		return this.catalogo;
	}

	/**
	 * 
	 * @param catalogo
	 */
	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}

}
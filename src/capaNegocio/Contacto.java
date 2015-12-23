package capaNegocio;

public class Contacto {

	private int uid;
	private String nombre;
	private String apellido;
	private String mail;
	private String telefono;
	private Ciudad ciudad;
	private Empresa empresa;

	/**
	 * 
	 * @param contacto
	 */
	public int agregarContactoCapaNegocio(Contacto contacto) {
		// TODO - implement Contacto.agregarContactoCapaNegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public int eliminarContactoCapaNegocio(Contacto contacto) {
		// TODO - implement Contacto.eliminarContactoCapaNegocio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param contacto
	 */
	public int editarContactoCapaNegocio(Contacto contacto) {
		// TODO - implement Contacto.editarContactoCapaNegocio
		throw new UnsupportedOperationException();
	}

	public int getUid() {
		return this.uid;
	}

	/**
	 * 
	 * @param uid
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

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

	public String getMail() {
		return this.mail;
	}

	/**
	 * 
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	/**
	 * 
	 * @param ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	/**
	 * 
	 * @param empresa
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
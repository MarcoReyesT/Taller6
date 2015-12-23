/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package orm;

public class Contacto {
	public Contacto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CONTACTO_ID_CIUDAD) {
			this.id_ciudad = (orm.Ciudad) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_CONTACTO_ID_EMPRESA) {
			this.id_empresa = (orm.Empresa) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int uid;
	
	private String nombre;
	
	private String apellido;
	
	private String mail;
	
	private String telefono;
	
	private orm.Ciudad id_ciudad;
	
	private orm.Empresa id_empresa;
	
	/**
	 * Clave Primaria auto incremental
	 */
	private void setUid(int value) {
		this.uid = value;
	}
	
	/**
	 * Clave Primaria auto incremental
	 */
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	/**
	 * Nombre
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Apellido
	 */
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	/**
	 * Apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Mail
	 */
	public void setMail(String value) {
		this.mail = value;
	}
	
	/**
	 * Mail
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * Telefono
	 */
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	/**
	 * Telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	
	public void setId_ciudad(orm.Ciudad value) {
		if (id_ciudad != null) {
			id_ciudad.contacto.remove(this);
		}
		if (value != null) {
			value.contacto.add(this);
		}
	}
	
	public orm.Ciudad getId_ciudad() {
		return id_ciudad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_ciudad(orm.Ciudad value) {
		this.id_ciudad = value;
	}
	
	private orm.Ciudad getORM_Id_ciudad() {
		return id_ciudad;
	}
	
	public void setId_empresa(orm.Empresa value) {
		if (id_empresa != null) {
			id_empresa.contacto.remove(this);
		}
		if (value != null) {
			value.contacto.add(this);
		}
	}
	
	public orm.Empresa getId_empresa() {
		return id_empresa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_empresa(orm.Empresa value) {
		this.id_empresa = value;
	}
	
	private orm.Empresa getORM_Id_empresa() {
		return id_empresa;
	}
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}

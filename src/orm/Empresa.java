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

public class Empresa {
	public Empresa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_EMPRESA_CONTACTO) {
			return ORM_contacto;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int uid;
	
	private String nombre;
	
	private java.util.Set ORM_contacto = new java.util.HashSet();
	
	/**
	 * Clave primaria empresa
	 */
	private void setUid(int value) {
		this.uid = value;
	}
	
	/**
	 * Clave primaria empresa
	 */
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	/**
	 * Nombre empresa
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre empresa
	 */
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Contacto(java.util.Set value) {
		this.ORM_contacto = value;
	}
	
	private java.util.Set getORM_Contacto() {
		return ORM_contacto;
	}
	
	public final orm.ContactoSetCollection contacto = new orm.ContactoSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_EMPRESA_CONTACTO, orm.ORMConstants.KEY_CONTACTO_ID_EMPRESA, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}

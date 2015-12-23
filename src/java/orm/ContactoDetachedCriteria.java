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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ContactoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression mail;
	public final StringExpression telefono;
	public final IntegerExpression id_ciudadId;
	public final AssociationExpression id_ciudad;
	public final IntegerExpression id_empresaId;
	public final AssociationExpression id_empresa;
	
	public ContactoDetachedCriteria() {
		super(orm.Contacto.class, orm.ContactoCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		id_ciudadId = new IntegerExpression("id_ciudad.uid", this.getDetachedCriteria());
		id_ciudad = new AssociationExpression("id_ciudad", this.getDetachedCriteria());
		id_empresaId = new IntegerExpression("id_empresa.uid", this.getDetachedCriteria());
		id_empresa = new AssociationExpression("id_empresa", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ContactoCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		mail = new StringExpression("mail", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		id_ciudadId = new IntegerExpression("id_ciudad.uid", this.getDetachedCriteria());
		id_ciudad = new AssociationExpression("id_ciudad", this.getDetachedCriteria());
		id_empresaId = new IntegerExpression("id_empresa.uid", this.getDetachedCriteria());
		id_empresa = new AssociationExpression("id_empresa", this.getDetachedCriteria());
	}
	
	public CiudadDetachedCriteria createId_ciudadCriteria() {
		return new CiudadDetachedCriteria(createCriteria("id_ciudad"));
	}
	
	public EmpresaDetachedCriteria createId_empresaCriteria() {
		return new EmpresaDetachedCriteria(createCriteria("id_empresa"));
	}
	
	public Contacto uniqueContacto(PersistentSession session) {
		return (Contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contacto[] listContacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}


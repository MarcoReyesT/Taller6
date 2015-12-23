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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ContactoCriteria extends AbstractORMCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression mail;
	public final StringExpression telefono;
	public final IntegerExpression id_ciudadId;
	public final AssociationExpression id_ciudad;
	public final IntegerExpression id_empresaId;
	public final AssociationExpression id_empresa;
	
	public ContactoCriteria(Criteria criteria) {
		super(criteria);
		uid = new IntegerExpression("uid", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		mail = new StringExpression("mail", this);
		telefono = new StringExpression("telefono", this);
		id_ciudadId = new IntegerExpression("id_ciudad.uid", this);
		id_ciudad = new AssociationExpression("id_ciudad", this);
		id_empresaId = new IntegerExpression("id_empresa.uid", this);
		id_empresa = new AssociationExpression("id_empresa", this);
	}
	
	public ContactoCriteria(PersistentSession session) {
		this(session.createCriteria(Contacto.class));
	}
	
	public ContactoCriteria() throws PersistentException {
		this(orm.Topico5ServicioWebsoapPersistentManager.instance().getSession());
	}
	
	public CiudadCriteria createId_ciudadCriteria() {
		return new CiudadCriteria(createCriteria("id_ciudad"));
	}
	
	public EmpresaCriteria createId_empresaCriteria() {
		return new EmpresaCriteria(createCriteria("id_empresa"));
	}
	
	public Contacto uniqueContacto() {
		return (Contacto) super.uniqueResult();
	}
	
	public Contacto[] listContacto() {
		java.util.List list = super.list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}


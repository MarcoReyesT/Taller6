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

public class EmpresaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression uid;
	public final StringExpression nombre;
	public final CollectionExpression contacto;
	
	public EmpresaDetachedCriteria() {
		super(orm.Empresa.class, orm.EmpresaCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contacto = new CollectionExpression("ORM_Contacto", this.getDetachedCriteria());
	}
	
	public EmpresaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.EmpresaCriteria.class);
		uid = new IntegerExpression("uid", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contacto = new CollectionExpression("ORM_Contacto", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria createContactoCriteria() {
		return new ContactoDetachedCriteria(createCriteria("ORM_Contacto"));
	}
	
	public Empresa uniqueEmpresa(PersistentSession session) {
		return (Empresa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Empresa[] listEmpresa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Empresa[]) list.toArray(new Empresa[list.size()]);
	}
}


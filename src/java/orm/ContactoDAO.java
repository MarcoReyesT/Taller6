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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ContactoDAO {
	public static Contacto loadContactoByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadContactoByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto getContactoByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return getContactoByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto loadContactoByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadContactoByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto getContactoByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return getContactoByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto loadContactoByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Contacto) session.load(orm.Contacto.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto getContactoByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Contacto) session.get(orm.Contacto.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto loadContactoByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contacto) session.load(orm.Contacto.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto getContactoByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contacto) session.get(orm.Contacto.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return queryContacto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return queryContacto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto[] listContactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return listContactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto[] listContactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return listContactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto as Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContacto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto as Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contacto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto[] listContactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryContacto(session, condition, orderBy);
			return (Contacto[]) list.toArray(new Contacto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto[] listContactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryContacto(session, condition, orderBy, lockMode);
			return (Contacto[]) list.toArray(new Contacto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto loadContactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadContactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto loadContactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadContactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto loadContactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Contacto[] contactos = listContactoByQuery(session, condition, orderBy);
		if (contactos != null && contactos.length > 0)
			return contactos[0];
		else
			return null;
	}
	
	public static Contacto loadContactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Contacto[] contactos = listContactoByQuery(session, condition, orderBy, lockMode);
		if (contactos != null && contactos.length > 0)
			return contactos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateContactoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return iterateContactoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContactoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return iterateContactoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContactoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto as Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContactoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Contacto as Contacto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contacto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto createContacto() {
		return new orm.Contacto();
	}
	
	public static boolean save(orm.Contacto contacto) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().saveObject(contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Contacto contacto) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().deleteObject(contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Contacto contacto)throws PersistentException {
		try {
			if(contacto.getId_ciudad() != null) {
				contacto.getId_ciudad().contacto.remove(contacto);
			}
			
			if(contacto.getId_empresa() != null) {
				contacto.getId_empresa().contacto.remove(contacto);
			}
			
			return delete(contacto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Contacto contacto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(contacto.getId_ciudad() != null) {
				contacto.getId_ciudad().contacto.remove(contacto);
			}
			
			if(contacto.getId_empresa() != null) {
				contacto.getId_empresa().contacto.remove(contacto);
			}
			
			try {
				session.delete(contacto);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Contacto contacto) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().refresh(contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Contacto contacto) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().evict(contacto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contacto loadContactoByCriteria(ContactoCriteria contactoCriteria) {
		Contacto[] contactos = listContactoByCriteria(contactoCriteria);
		if(contactos == null || contactos.length == 0) {
			return null;
		}
		return contactos[0];
	}
	
	public static Contacto[] listContactoByCriteria(ContactoCriteria contactoCriteria) {
		return contactoCriteria.listContacto();
	}
}

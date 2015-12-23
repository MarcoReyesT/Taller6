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

public class CiudadDAO {
	public static Ciudad loadCiudadByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadCiudadByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return getCiudadByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadCiudadByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return getCiudadByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Ciudad) session.load(orm.Ciudad.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Ciudad) session.get(orm.Ciudad.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ciudad) session.load(orm.Ciudad.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad getCiudadByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ciudad) session.get(orm.Ciudad.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiudad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return queryCiudad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiudad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return queryCiudad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return listCiudadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return listCiudadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCiudad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
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
	
	public static List queryCiudad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ciudad", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCiudad(session, condition, orderBy);
			return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad[] listCiudadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCiudad(session, condition, orderBy, lockMode);
			return (Ciudad[]) list.toArray(new Ciudad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadCiudadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadCiudadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ciudad[] ciudads = listCiudadByQuery(session, condition, orderBy);
		if (ciudads != null && ciudads.length > 0)
			return ciudads[0];
		else
			return null;
	}
	
	public static Ciudad loadCiudadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ciudad[] ciudads = listCiudadByQuery(session, condition, orderBy, lockMode);
		if (ciudads != null && ciudads.length > 0)
			return ciudads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCiudadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return iterateCiudadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCiudadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return iterateCiudadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCiudadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
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
	
	public static java.util.Iterator iterateCiudadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Ciudad as Ciudad");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ciudad", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad createCiudad() {
		return new orm.Ciudad();
	}
	
	public static boolean save(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().saveObject(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().deleteObject(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Ciudad ciudad)throws PersistentException {
		try {
			orm.Contacto[] lContactos = ciudad.contacto.toArray();
			for(int i = 0; i < lContactos.length; i++) {
				lContactos[i].setId_ciudad(null);
			}
			return delete(ciudad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Ciudad ciudad, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Contacto[] lContactos = ciudad.contacto.toArray();
			for(int i = 0; i < lContactos.length; i++) {
				lContactos[i].setId_ciudad(null);
			}
			try {
				session.delete(ciudad);
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
	
	public static boolean refresh(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().refresh(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Ciudad ciudad) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().evict(ciudad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ciudad loadCiudadByCriteria(CiudadCriteria ciudadCriteria) {
		Ciudad[] ciudads = listCiudadByCriteria(ciudadCriteria);
		if(ciudads == null || ciudads.length == 0) {
			return null;
		}
		return ciudads[0];
	}
	
	public static Ciudad[] listCiudadByCriteria(CiudadCriteria ciudadCriteria) {
		return ciudadCriteria.listCiudad();
	}
}

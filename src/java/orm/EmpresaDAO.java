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

public class EmpresaDAO {
	public static Empresa loadEmpresaByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadEmpresaByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa getEmpresaByORMID(int uid) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return getEmpresaByORMID(session, uid);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa loadEmpresaByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadEmpresaByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa getEmpresaByORMID(int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return getEmpresaByORMID(session, uid, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa loadEmpresaByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Empresa) session.load(orm.Empresa.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa getEmpresaByORMID(PersistentSession session, int uid) throws PersistentException {
		try {
			return (Empresa) session.get(orm.Empresa.class, new Integer(uid));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa loadEmpresaByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empresa) session.load(orm.Empresa.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa getEmpresaByORMID(PersistentSession session, int uid, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empresa) session.get(orm.Empresa.class, new Integer(uid), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpresa(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return queryEmpresa(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpresa(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return queryEmpresa(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa[] listEmpresaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return listEmpresaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa[] listEmpresaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return listEmpresaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpresa(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Empresa as Empresa");
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
	
	public static List queryEmpresa(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Empresa as Empresa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empresa", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa[] listEmpresaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmpresa(session, condition, orderBy);
			return (Empresa[]) list.toArray(new Empresa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa[] listEmpresaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmpresa(session, condition, orderBy, lockMode);
			return (Empresa[]) list.toArray(new Empresa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa loadEmpresaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadEmpresaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa loadEmpresaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return loadEmpresaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa loadEmpresaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Empresa[] empresas = listEmpresaByQuery(session, condition, orderBy);
		if (empresas != null && empresas.length > 0)
			return empresas[0];
		else
			return null;
	}
	
	public static Empresa loadEmpresaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Empresa[] empresas = listEmpresaByQuery(session, condition, orderBy, lockMode);
		if (empresas != null && empresas.length > 0)
			return empresas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmpresaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return iterateEmpresaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpresaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession();
			return iterateEmpresaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpresaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Empresa as Empresa");
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
	
	public static java.util.Iterator iterateEmpresaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Empresa as Empresa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empresa", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa createEmpresa() {
		return new orm.Empresa();
	}
	
	public static boolean save(orm.Empresa empresa) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().saveObject(empresa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Empresa empresa) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().deleteObject(empresa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Empresa empresa)throws PersistentException {
		try {
			orm.Contacto[] lContactos = empresa.contacto.toArray();
			for(int i = 0; i < lContactos.length; i++) {
				lContactos[i].setId_empresa(null);
			}
			return delete(empresa);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Empresa empresa, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Contacto[] lContactos = empresa.contacto.toArray();
			for(int i = 0; i < lContactos.length; i++) {
				lContactos[i].setId_empresa(null);
			}
			try {
				session.delete(empresa);
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
	
	public static boolean refresh(orm.Empresa empresa) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().refresh(empresa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Empresa empresa) throws PersistentException {
		try {
			orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().evict(empresa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empresa loadEmpresaByCriteria(EmpresaCriteria empresaCriteria) {
		Empresa[] empresas = listEmpresaByCriteria(empresaCriteria);
		if(empresas == null || empresas.length == 0) {
			return null;
		}
		return empresas[0];
	}
	
	public static Empresa[] listEmpresaByCriteria(EmpresaCriteria empresaCriteria) {
		return empresaCriteria.listEmpresa();
	}
}

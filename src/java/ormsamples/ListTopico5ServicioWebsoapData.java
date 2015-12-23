/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListTopico5ServicioWebsoapData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Contacto...");
		orm.Contacto[] ormContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		int length = Math.min(ormContactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormContactos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ciudad...");
		orm.Ciudad[] ormCiudads = orm.CiudadDAO.listCiudadByQuery(null, null);
		length = Math.min(ormCiudads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormCiudads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empresa...");
		orm.Empresa[] ormEmpresas = orm.EmpresaDAO.listEmpresaByQuery(null, null);
		length = Math.min(ormEmpresas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEmpresas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Contacto by Criteria...");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormContactoCriteria.uid.eq();
		lormContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Contacto[] ormContactos = lormContactoCriteria.listContacto();
		int length =ormContactos== null ? 0 : Math.min(ormContactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormContactos[i]);
		}
		System.out.println(length + " Contacto record(s) retrieved."); 
		
		System.out.println("Listing Ciudad by Criteria...");
		orm.CiudadCriteria lormCiudadCriteria = new orm.CiudadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormCiudadCriteria.uid.eq();
		lormCiudadCriteria.setMaxResults(ROW_COUNT);
		orm.Ciudad[] ormCiudads = lormCiudadCriteria.listCiudad();
		length =ormCiudads== null ? 0 : Math.min(ormCiudads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormCiudads[i]);
		}
		System.out.println(length + " Ciudad record(s) retrieved."); 
		
		System.out.println("Listing Empresa by Criteria...");
		orm.EmpresaCriteria lormEmpresaCriteria = new orm.EmpresaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEmpresaCriteria.uid.eq();
		lormEmpresaCriteria.setMaxResults(ROW_COUNT);
		orm.Empresa[] ormEmpresas = lormEmpresaCriteria.listEmpresa();
		length =ormEmpresas== null ? 0 : Math.min(ormEmpresas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEmpresas[i]);
		}
		System.out.println(length + " Empresa record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTopico5ServicioWebsoapData listTopico5ServicioWebsoapData = new ListTopico5ServicioWebsoapData();
			try {
				listTopico5ServicioWebsoapData.listTestData();
				//listTopico5ServicioWebsoapData.listByCriteria();
			}
			finally {
				orm.Topico5ServicioWebsoapPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

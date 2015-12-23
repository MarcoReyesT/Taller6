/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteTopico5ServicioWebsoapData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			orm.Ciudad lormCiudad = orm.CiudadDAO.loadCiudadByQuery(null, null);
			// Delete the persistent object
			orm.CiudadDAO.delete(lormCiudad);
			orm.Empresa lormEmpresa = orm.EmpresaDAO.loadEmpresaByQuery(null, null);
			// Delete the persistent object
			orm.EmpresaDAO.delete(lormEmpresa);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTopico5ServicioWebsoapData deleteTopico5ServicioWebsoapData = new DeleteTopico5ServicioWebsoapData();
			try {
				deleteTopico5ServicioWebsoapData.deleteTestData();
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

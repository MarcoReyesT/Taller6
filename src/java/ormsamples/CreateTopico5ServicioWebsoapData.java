/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateTopico5ServicioWebsoapData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_empresa, id_ciudad
			orm.ContactoDAO.save(lormContacto);
			orm.Ciudad lormCiudad = orm.CiudadDAO.createCiudad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contacto
			orm.CiudadDAO.save(lormCiudad);
			orm.Empresa lormEmpresa = orm.EmpresaDAO.createEmpresa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contacto, nombre
			orm.EmpresaDAO.save(lormEmpresa);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTopico5ServicioWebsoapData createTopico5ServicioWebsoapData = new CreateTopico5ServicioWebsoapData();
			try {
				createTopico5ServicioWebsoapData.createTestData();
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

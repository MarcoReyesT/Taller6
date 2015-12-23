package capaNegocio;

import java.util.ArrayList;
import java.util.List;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Contacto {

    private int uid;
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    private Ciudad ciudad;
    private Empresa empresa;

    /**
     *
     * @param contacto
     */
    public int agregarContactoCapaNegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Ciudad lormCiudad = orm.CiudadDAO.createCiudad();
            lormCiudad.setNombre(contacto.getCiudad().getNombre());
            orm.CiudadDAO.save(lormCiudad);

            orm.Empresa lormEmpresa = orm.EmpresaDAO.createEmpresa();
            lormEmpresa.setNombre(contacto.getEmpresa().getNombre());
            orm.EmpresaDAO.save(lormEmpresa);
            orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
            lormContacto.setApellido(contacto.getApellido());
            lormContacto.setNombre(contacto.getNombre());
            lormContacto.setMail(contacto.getMail());
            lormContacto.setTelefono(contacto.getTelefono());
            lormContacto.setId_ciudad(lormCiudad);
            lormContacto.setId_empresa(lormEmpresa);
            orm.ContactoDAO.save(lormContacto);
            orm.ContactoDAO.refresh(lormContacto);
            t.commit();
            respuesta = lormContacto.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     *
     * @param contacto
     */
    public int eliminarContactoCapaNegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid());
            orm.ContactoDAO.delete(lormContacto);
            orm.Ciudad lormCiudad = orm.CiudadDAO.loadCiudadByORMID(contacto.getCiudad().getUid());
            orm.CiudadDAO.delete(lormCiudad);
            orm.Empresa lormEmpresa = orm.EmpresaDAO.loadEmpresaByORMID(contacto.getEmpresa().getUid());
            orm.EmpresaDAO.delete(lormEmpresa);

            t.commit();

            return lormContacto.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    /**
     *
     * @param contacto
     */
    public int editarContactoCapaNegocio(Contacto contacto) throws PersistentException {
        int respuesta = 0;
        PersistentTransaction t = orm.Topico5ServicioWebsoapPersistentManager.instance().getSession().beginTransaction();
        try {
            orm.Ciudad lormCiudad = orm.CiudadDAO.loadCiudadByORMID(contacto.getCiudad().getUid());
            lormCiudad.setNombre(contacto.getCiudad().getNombre());
            orm.Empresa lormEmpresa = orm.EmpresaDAO.loadEmpresaByORMID(contacto.getEmpresa().getUid());
            lormEmpresa.setNombre(contacto.getEmpresa().getNombre());
            orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByORMID(contacto.getUid());
            lormContacto.setApellido(contacto.getApellido());
            lormContacto.setMail(contacto.getMail());
            lormContacto.setNombre(contacto.getNombre());
            lormContacto.setTelefono(contacto.getTelefono());
            lormContacto.setId_ciudad(lormCiudad);
            lormContacto.setId_empresa(lormEmpresa);
            orm.ContactoDAO.save(lormContacto);
            t.commit();
            respuesta = lormContacto.getUid();
        } catch (Exception e) {
            t.rollback();
        }
        return respuesta;
    }

    public int getUid() {
        return this.uid;
    }

    /**
     *
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return this.mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return this.telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Ciudad getCiudad() {
        return this.ciudad;
    }

    /**
     *
     * @param ciudad
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    /**
     *
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Contacto> busquedaSimple(String busqueda) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        if (busqueda != null || !busqueda.equals("")) {
            listaContactos = orm.ContactoDAO.queryContacto("Contacto.nombre='" + busqueda + "' or Contacto.apellido='" + busqueda
                    + "' or Contacto.telefono='" + busqueda + "' or Contacto.mail='" + busqueda + "' ", null);
        }
        if (listaContactos != null) {
            for (orm.Contacto contactoOrm : listaContactos) {
                Contacto contactoNegocio = new Contacto();
                Empresa empresaNegocio = new Empresa();
                orm.Empresa empresaOrm = orm.EmpresaDAO.loadEmpresaByORMID(contactoOrm.getId_empresa().getUid());
                empresaNegocio.setNombre(empresaOrm.getNombre());
                empresaNegocio.setUid(empresaOrm.getUid());

                orm.Ciudad ciudadOrm = orm.CiudadDAO.loadCiudadByORMID(contactoOrm.getId_ciudad().getUid());
                Ciudad ciudadNegocio = new Ciudad();
                ciudadNegocio.setNombre(ciudadOrm.getNombre());
                ciudadNegocio.setUid(ciudadOrm.getUid());
                contactoNegocio.setCiudad(ciudadNegocio);
                contactoNegocio.setEmpresa(empresaNegocio);
                contactoNegocio.setNombre(contactoOrm.getNombre());
                contactoNegocio.setApellido(contactoOrm.getApellido());
                contactoNegocio.setTelefono(contactoOrm.getTelefono());
                contactoNegocio.setMail(contactoOrm.getMail());
                listaContacto.add(contactoNegocio);
            }
        }
        return listaContacto;
    }

    public List<Contacto> busquedaAvanzada(Contacto contacto) throws PersistentException {
        List<Contacto> listaContacto = new ArrayList<Contacto>();
        List<orm.Contacto> listaContactos = new ArrayList<orm.Contacto>();
        String query = "";
        if (contacto.getNombre() != null && !contacto.getNombre().equals("")) {
            query += "Contacto.nombre='" + contacto.getNombre() + "' ";
        }
        if ((contacto.getNombre() != null && !contacto.getNombre().equals("")) && (contacto.getApellido() != null && !contacto.getApellido().equals(""))) {
            query += "and ";
        }
        if (contacto.getApellido() != null && !contacto.getApellido().trim().equals("")) {
            query += "Contacto.apellido='" + contacto.getApellido() + "' ";
        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals("")) && (contacto.getTelefono() != null && !contacto.getTelefono().trim().equals(""))) {
            query += "and ";
        }
        if (contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("")) {
            query += "Contacto.telefono='" + contacto.getTelefono() + "' ";
        }
        if (((contacto.getNombre() != null && !contacto.getNombre().trim().equals("")) || contacto.getApellido() != null && !contacto.getApellido().trim().equals("")
                || contacto.getTelefono() != null && !contacto.getTelefono().trim().equals("")) && contacto.getMail() != null && !contacto.getMail().trim().equals("")) {
            query += "and ";
        }
        if (contacto.getMail() != null && !contacto.getMail().trim().equals("")) {
            query += "Contacto.mail='" + contacto.getMail() + "'";
        }

        listaContactos = orm.ContactoDAO.queryContacto(query, null);
        if (listaContactos != null) {
            for (orm.Contacto contactoOrm : listaContactos) {
                Contacto contactoNegocio = new Contacto();
                Empresa empresaNegocio = new Empresa();
                orm.Empresa empresaOrm = orm.EmpresaDAO.loadEmpresaByORMID(contactoOrm.getId_empresa().getUid());
                empresaNegocio.setNombre(empresaOrm.getNombre());
                empresaNegocio.setUid(empresaOrm.getUid());

                orm.Ciudad ciudadOrm = orm.CiudadDAO.loadCiudadByORMID(contactoOrm.getId_ciudad().getUid());
                Ciudad ciudadNegocio = new Ciudad();
                ciudadNegocio.setNombre(ciudadOrm.getNombre());
                ciudadNegocio.setUid(ciudadOrm.getUid());

                contactoNegocio.setCiudad(ciudadNegocio);
                contactoNegocio.setEmpresa(empresaNegocio);
                contactoNegocio.setUid(contactoOrm.getUid());
                contactoNegocio.setNombre(contactoOrm.getNombre());
                contactoNegocio.setApellido(contactoOrm.getApellido());
                contactoNegocio.setTelefono(contactoOrm.getTelefono());
                contactoNegocio.setMail(contactoOrm.getMail());
                listaContacto.add(contactoNegocio);

            }
        }
        
        return listaContacto;
    }

}

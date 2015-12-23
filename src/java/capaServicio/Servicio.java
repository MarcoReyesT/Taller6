/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaServicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import capaNegocio.Ciudad;
import capaNegocio.Contacto;
import capaNegocio.Empresa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.orm.PersistentException;

/**
 *
 * @author Eduardo
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarContactoServicioWeb")
    public String agregarContactoServicioWeb(@WebParam(name = "nombreContacto") String nombreContacto, @WebParam(name = "apellidoContacto") String apellidoContacto, @WebParam(name = "mailContacto") String mailContacto, @WebParam(name = "telefonoContacto") String telefonoContacto, @WebParam(name = "nombreCiudad") String nombreCiudad, @WebParam(name = "nombreEmpresa") String nombreEmpresa) {
        String respuesta = "no se pudo almacenar el contacto";
        Empresa empresa = new Empresa();
        empresa.setNombre(nombreEmpresa);
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre(nombreCiudad);
        Contacto contacto = new Contacto();
        contacto.setApellido(apellidoContacto);
        contacto.setMail(mailContacto);
        contacto.setNombre(nombreContacto);
        contacto.setTelefono(telefonoContacto);
        contacto.setCiudad(ciudad);
        contacto.setEmpresa(empresa);
        try {
            int resultado = contacto.agregarContactoCapaNegocio(contacto);
            if (resultado != 0) {
                respuesta = "creación del contacto exitosa, su uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Priority.FATAL, null, ex);
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarContactoServicioWeb")
    public String editarContactoServicioWeb(@WebParam(name = "uid") int uid, @WebParam(name = "nuevoNombreContacto") String nuevoNombreContacto, @WebParam(name = "nuevoApellidoContacto") String nuevoApellidoContacto, @WebParam(name = "nuevoTelefonoContacto") String nuevoTelefonoContacto, @WebParam(name = "nuevoMailContacto") String nuevoMailContacto, @WebParam(name = "uidEmpresa") int uidEmpresa, @WebParam(name = "nuevoNombreEmpresa") String nuevoNombreEmpresa, @WebParam(name = "uidCiudad") int uidCiudad, @WebParam(name = "nuevoNombreCiudad") String nuevoNombreCiudad) {
        String respuesta = "no se ha editado el contacto";
        capaNegocio.Empresa empresa = new capaNegocio.Empresa();
        empresa.setUid(uidEmpresa);
        empresa.setNombre(nuevoNombreEmpresa);
        Ciudad ciudad = new Ciudad();
        ciudad.setUid(uidCiudad);
        ciudad.setNombre(nuevoNombreCiudad);
        Contacto contacto = new Contacto();
        contacto.setApellido(nuevoApellidoContacto);
        contacto.setUid(uidEmpresa);
        contacto.setNombre(nuevoNombreContacto);
        contacto.setMail(nuevoMailContacto);
        contacto.setTelefono(nuevoTelefonoContacto);
        contacto.setCiudad(ciudad);
        contacto.setEmpresa(empresa);
        try {
            int resultado = contacto.editarContactoCapaNegocio(contacto);
            if (resultado != 0) {
                respuesta = "se ha modificado el contacto cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Priority.FATAL, null, ex);
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE,null,ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarContactoServicioWeb")
    public String eliminarContactoServicioWeb(@WebParam(name = "uidContacto") int uidContacto, @WebParam(name = "uidEmpresa") int uidEmpresa, @WebParam(name = "uidCiudad") int uidCiudad) {
        String respuesta = "no se ha podido eliminar el contacto";
        Empresa empresa = new Empresa();
        empresa.setUid(uidEmpresa);
        Ciudad ciudad = new Ciudad();
        ciudad.setUid(uidCiudad);
        Contacto contacto = new Contacto();
        contacto.setUid(uidContacto);
        contacto.setCiudad(ciudad);
        contacto.setEmpresa(empresa);

        try {
            int resultado = contacto.eliminarContactoCapaNegocio(contacto);
            if (resultado != 0) {
                respuesta = "se ha eliminado el contacto cuyo uid es: " + resultado;
            }
        } catch (PersistentException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Priority.FATAL, null, ex);
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaAvanzada")
    public String busquedaAvanzada(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "telefono") String telefono, @WebParam(name = "mail") String mail) {
        String listaResultado = "";
        List<capaNegocio.Contacto> lista = new ArrayList<capaNegocio.Contacto>();
        capaNegocio.Contacto contacto = new capaNegocio.Contacto();
        if (apellido != null) {
            contacto.setApellido(apellido);
        }else{
            contacto.setApellido("");
        }
        if (nombre != null) {
            contacto.setNombre(nombre);
        }else{
            contacto.setNombre("");
        }
        if (telefono != null) {
            contacto.setTelefono(telefono);
        }else{
            contacto.setTelefono("");
        }
        if (mail != null) {
            contacto.setMail(mail);
        }else{
            contacto.setMail("");
        }
        
        Gson gson = new GsonBuilder().create();
        try {
            lista = contacto.busquedaAvanzada(contacto);
            listaResultado = gson.toJson(lista);
        } catch (PersistentException ex) {
            listaResultado = null;
        }
        return listaResultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "busquedaSimple")
    public String busquedaSimple(@WebParam(name = "textoBusqueda") String textoBusqueda) {
        String listaResultado = "";
        List<Contacto> lista = new ArrayList<Contacto>();
        Gson gson = new GsonBuilder().create();
        try {
            Contacto contacto = new Contacto();
            lista = contacto.busquedaSimple(textoBusqueda);
            listaResultado = gson.toJson(lista);
        } catch (PersistentException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Priority.FATAL, null, ex);
            //Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaResultado;
    }
}

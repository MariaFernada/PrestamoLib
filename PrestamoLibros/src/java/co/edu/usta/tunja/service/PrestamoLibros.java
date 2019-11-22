/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.service;

import co.edu.usta.tunja.ejb.PrestamoFacade;
import java.util.Date;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Maria Fernanda
 */
@WebService(serviceName = "PrestamoLibros")
public class PrestamoLibros {

  @EJB
    private PrestamoFacade _ejbPrestamo;
  
   @WebMethod(operationName = "crearUniversidad")
    public String createPrestamo(@WebParam(name = "FechaIniPrestamo") Date fecha_inicial, @WebParam(name ="fechaFinPrestamo") Date fecha_vencimiento, 
            @WebParam(name ="estadoPrestamo") enum estado_prestamo, @WebParam(name ="id_lib_Prestamo") int id_libro_prestamo,
            @WebParam(name ="cod_per_prestamo") int codigo_persona_prestamo) {
       
        PrestamoLibros entityPrestamoLib= new PrestamoLibros();
       
        entityPrestamoLib.setFechaInicial(fecha_inicial);
        entityPrestamoLib.setFechaVencimiento(fecha_vencimiento);
        entityPrestamoLib.setEstadoPrestamo(estado_prestamo);
        entityPrestamoLib.setIdLibroPrestamo(id_libro_prestamo);
        entityPrestamoLib.setCodigoPersonaPrestamo(codigo_persona_prestamo);
       
       
      
        this._ejbPrestamo.grabar(entityPrestamoLib);
         if (entityprestamoLib!=null) 
             return "creado correctmente";
         return "error al cerar";
             
     					    
    }
 }

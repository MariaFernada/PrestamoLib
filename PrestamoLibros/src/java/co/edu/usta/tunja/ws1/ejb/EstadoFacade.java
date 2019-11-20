/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.ws1.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.usta.tunja.edu.entity.Estado;

/**
 *
 * @author Maria Fernanda
 */
@Stateless
public class EstadoFacade extends Abstract<Estado>{

     @PersistenceContext(unitName = "PrestamoLibrosPU")
   private EntityManager _em;
     
      @Override
    protected EntityManager getAdmEntidad() {
       return this._em;
    }
   
   public EstadoFacade(){
       super(Estado.class);
   }
     
    public EstadoFacade(Class<EstadoFacade> entidad) {
        super(entidad);
    }

     
}

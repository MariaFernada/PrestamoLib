/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.ejb;

import co.edu.usta.tunja.entity.Prestamo;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maria Fernanda
 */
public class PrestamoFacade extends Abstract<Prestamo>{
     @PersistenceContext(unitName = "PrestamoLibrosPU")
    private EntityManager _em;

    @Override
    protected EntityManager getAdmEntidad() {
        return this._em;
    }

    public PrestamoFacade() {
        super(Prestamo.class);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.ws1.ejb;
import com.usta.tunja.edu.entity.Persona;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maria Fernanda
 */
public class PersonaFacade extends Abstract<Persona> {

    @PersistenceContext(unitName = "PrestamoLibrosPU")
    private EntityManager _em;

   
    @Override
    protected EntityManager getAdmEntidad() {
        return this._em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }

}

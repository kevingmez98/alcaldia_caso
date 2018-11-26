/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Usuario;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "casoEstudioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public List<Usuario> iniciarSesion(Usuario e, boolean comoAdmnistrador) {
        List<Usuario> listaResultados = new LinkedList<>();
        String consulta = "SELECT u FROM Usuario u WHERE u.identificacion=?1 AND u.contrasenia=?2";
        Query q = getEntityManager().createQuery(consulta);
        q.setParameter(1, e.getIdentificacion());
        q.setParameter(2, e.getContrasenia());
        if (!comoAdmnistrador) {
            listaResultados = q.getResultList();
        } else {
            if (e.getIdRol().getIdRol() == 1) {
                listaResultados = q.getResultList();
            }
        }
        return listaResultados;

    }

}

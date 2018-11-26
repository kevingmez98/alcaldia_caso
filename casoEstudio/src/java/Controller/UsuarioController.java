/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Usuario;
import Facade.UsuarioFacadeLocal;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Usuario
 */
@Named(value = "usuarioController")
@ViewScoped
public class UsuarioController implements Serializable{
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    
    
    private Usuario usuario;
    
    private boolean sesionAdministrador;
    
    @PostConstruct
    public void iniciar(){
        usuario= new Usuario();
        sesionAdministrador= false;
    }
    
    public void iniciarSesion(){
        try{
            List<Usuario> l= new LinkedList<>();
            l= usuarioEJB.iniciarSesion(usuario, sesionAdministrador);
            
            if(!l.isEmpty()){
                usuario= l.get(0);
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
                String redireccion= usuario.getIdRol().getNombreRol()+"/index.xhtml";
                FacesContext.getCurrentInstance().getExternalContext().redirect(redireccion);
            }else{
                //Se pone mensaje de error de inicio de sesion
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

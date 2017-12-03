package br.com.suafarmaciaonline.dao;

import br.com.suafarmaciaonline.models.Usuario;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author john
 */

@Path("usuarios")
public class UsuariosResource {

    @Context
    private UriInfo context;

    
    public UsuariosResource() {
    }
   
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Usuario getUsuarios() {
        System.out.println("get usuarios..." );
        Dao d = new Dao();
        return (Usuario)d.ler(Usuario.class, 1);
    }
    
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idUsuario}")
    public Usuario getUsuario(@PathParam("idUsuario") String id) {
        System.out.println("get usuario..." + id);
        Dao d = new Dao();
        return (Usuario)d.ler(Usuario.class, Integer.parseInt(id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario addUsuario(Usuario usuario){
        System.out.println("POST Usuario: " + usuario);
        Dao d = new Dao();
        d.salvar(usuario);
        return usuario;
    }
    
    
}

package br.com.suafarmaciaonline.dao;

import br.com.suafarmaciaonline.models.Farmacia;
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

@Path("farmacias")
public class FarmaciasResource {

     @Context
    private UriInfo context;

    
    public FarmaciasResource() {
    }
   
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Farmacia getFarmacias() {
        System.out.println("get farmacias..." );
        Dao d = new Dao();
        return (Farmacia)d.ler(Farmacia.class, 1);
    }
    
    @GET  
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idFarmacia}")
    public Farmacia getFarmacia(@PathParam("idFarmacia") String id) {
        System.out.println("get farmacia..." + id);
        Dao d = new Dao();
        return (Farmacia)d.ler(Farmacia.class, Integer.parseInt(id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Farmacia addFarmacia(Farmacia farmacia){
        System.out.println("POST Farmacia: " + farmacia);
        Dao d = new Dao();
        d.salvar(farmacia);
        return farmacia;
    }
    
}

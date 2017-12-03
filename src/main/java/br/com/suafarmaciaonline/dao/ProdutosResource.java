package br.com.suafarmaciaonline.dao;

import br.com.suafarmaciaonline.models.Produto;
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
 * @author John Frank Eichstaedt
*
 */
@Path("produtos")
public class ProdutosResource {

    @Context
    private UriInfo context;

    public ProdutosResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Produto getProdutos() {
        System.out.println("get clientes...");
        Dao d = new Dao();
        return (Produto) d.ler(Produto.class, 1);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idProduto}")
    public Produto getProduto(@PathParam("idProduto") String id) {
        System.out.println("get produto..." + id);
        Dao d = new Dao();
        return (Produto) d.ler(Produto.class, Integer.parseInt(id));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Produto addProduto(Produto produto) {
        System.out.println("POST Produto: " + produto);
        Dao d = new Dao();
        d.salvar(produto);
        return produto;
    }

}

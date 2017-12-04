package br.com.suafarmaciaonline.dao;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * @author John Frank Eichstaedt
 **/
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.suafarmaciaonline.dao.ClientesResource.class);
        resources.add(br.com.suafarmaciaonline.dao.ContatosResource.class);
        resources.add(br.com.suafarmaciaonline.dao.FarmaciasResource.class);
        resources.add(br.com.suafarmaciaonline.dao.ProdutosResource.class);
        resources.add(br.com.suafarmaciaonline.dao.UsuariosResource.class);
        resources.add(br.com.suafarmaciaonline.services.JWTAutenticarTokenFilter.class);
    }
    
}

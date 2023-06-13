package org.example.models;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Path("produit")
public class ProduitController {

    List<Produit> produits = new ArrayList<>();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produit> getAll(){
        return this.produits;
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String add(Produit produit){
       if (produits.add(produit)){
           return "produit ajouté avec succée";
       }
       return "produit non ajouter";
    }


    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String update(Produit produit){
        int index = produits.indexOf(produit);

        if(index !=-1) {
            produits.set(index, produit);
            return "employé modifié";
        }
        return ("employé non modifié");
    }



    @DELETE()
    @Path("{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String delete(@PathParam("id") Long id){
        int index = produits.indexOf(id);
        Iterator<Produit> it = produits.iterator();
        while(it.hasNext()) {

            if(it.next().getId().equals(id))
            {
                it.remove();
                return "produit deleted";
            }
        }
        return "produit non supprimé";
    }


}

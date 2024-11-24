package com.example.jersey;

import com.example.jersey.Repository.CompteRepository;
import com.example.jersey.model.Compte;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.awt.*;

@Component
@Path("/banque")
public class CompteRestJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;

    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> getCompte(){
        return compteRepository.findAll();
    }

    @Path("/comptes")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Compte addCompte(Compte compte){
        return compteRepository.save(compte);
    }
}

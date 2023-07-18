package com.asking.api_produit.controller;
import com.asking.api_produit.modele.Produit;
import com.asking.api_produit.service.ProduitService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;




@RestController
@RequestMapping("/produit")
@AllArgsConstructor

public class ProduitController 
{
    private final ProduitService produitService;

   

     

    

    @PostMapping(value = "/create")
    public Produit create(@RequestBody Produit produit)
    {
        return produitService.creer(produit);
    }


    @GetMapping(value = "/read")
    public List<Produit> read() 
    {
        return produitService.lire();
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Integer id, @RequestBody Produit produit)
    {
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return produitService.supprimer(id);
    }
    
}

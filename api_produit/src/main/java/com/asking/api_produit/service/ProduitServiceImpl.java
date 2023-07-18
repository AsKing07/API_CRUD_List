package com.asking.api_produit.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.asking.api_produit.modele.Produit;
import com.asking.api_produit.repository.ProduitRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class ProduitServiceImpl implements ProduitService
{
    private final ProduitRepository produitRepository;

    @Override
    public Produit creer(Produit produit) {
       return produitRepository.save(produit);
    }

    @Override
    public List<Produit> lire() 
    {
        return produitRepository.findAll();
    }

    @Override
    public Produit modifier(Integer id, Produit produit) 
    {
        return produitRepository.findById(id)
                        .map(p ->{
                            p.setPrix(produit.getPrix());
                            p.setNom(produit.getNom());
                            p.setDevise(produit.getDevise());
                            p.setFournisseur(produit.getFournisseur());
                            p.setTaxe(produit.getTaxe());
                            p.setDateExpiration(produit.getDateExpiration());
                       return  produitRepository.save(p);
                        }).orElseThrow(() -> new RuntimeException("Produit non trouvé..."));
    }

    @Override
    public String supprimer(Integer id) {
      produitRepository.deleteById(id);
      return "Produit supprimé";
    }
    
}


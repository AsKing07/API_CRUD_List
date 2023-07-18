package com.asking.api_produit.service;
import com.asking.api_produit.modele.Produit;

import java.util.List;



public interface ProduitService 
{
    Produit creer(Produit produit);

    List<Produit> lire();

    Produit modifier(Integer id, Produit produit);

    String supprimer(Integer id);
}
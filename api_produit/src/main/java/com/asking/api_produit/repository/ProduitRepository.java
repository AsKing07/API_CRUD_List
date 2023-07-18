package com.asking.api_produit.repository;

import com.asking.api_produit.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Integer>
{

}

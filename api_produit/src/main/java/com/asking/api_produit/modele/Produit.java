package com.asking.api_produit.modele;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity

@Table(name = "PRODUITS")
@Getter
@Setter
@NoArgsConstructor
public class Produit 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private double prix;
    @Column(length=3)
    private String devise;
    private Integer taxe;
    private Date dateExpiration;
    private String fournisseur;
    
}
package com.ynov.nantes.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.util.Assert;

import com.ynov.nantes.soap.entity.Administrateur;
import com.ynov.nantes.soap.entity.User;

/**
 * Extension du Repository CRUD pour ajouter une méthode métier.
 * 
 * @author Matthieu BACHELIER
 * @since 2020-10
 * @version 1.0
 */
public interface AdministrateurRepository extends JpaRepository<Administrateur, Integer> {

   /// TODO les méthodes pertinents en plus des méthodes CRUD (autogénérées), type findByName

    Administrateur findAdminById(int id);
    Boolean existsAdminByUser(User user);
}
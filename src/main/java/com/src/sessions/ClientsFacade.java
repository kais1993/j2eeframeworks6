/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.sessions;

import com.src.jpa.Clients;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MEDIA CITY
 */
@Stateless
public class ClientsFacade extends AbstractFacade<Clients> {
    @PersistenceContext(unitName = "com.mycompany_j2eeframeworks6_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientsFacade() {
        super(Clients.class);
    }
    
}

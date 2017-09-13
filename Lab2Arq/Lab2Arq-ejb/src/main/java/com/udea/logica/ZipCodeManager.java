/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.logica;

import com.udea.modelo.MicroMarket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author dairo.garcia
 */
@Stateless
@LocalBean
public class ZipCodeManager {

    @PersistenceContext(unitName = "com.udea_Lab2Arq-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

   
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List<MicroMarket> getZipCodes(String parameter) {
        
        Query query=em.createNamedQuery("MicroMarket.findAll");
        return query.getResultList();
    }
}

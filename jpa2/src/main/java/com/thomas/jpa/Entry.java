package com.thomas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.thomas.jpa.model.Engine;
import com.thomas.jpa.model.Vehicule;
import com.thomas.jpa.model.VehiculeId;
import com.thomas.jpa.model.Voiture;

public class Entry {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("carmanager");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		Vehicule v = em.find(Vehicule.class, new VehiculeId("ABC22BB","Peugeot"));
		em.remove(v);
		
		em.getTransaction().commit();
				
		em.close();
		emf.close();
	}
}
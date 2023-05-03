package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class datamanager {

	public static void dataManager() {
		employee e=new employee();
	e.setDepartment("Engineering");
	e.setEmpAddress("Pokhara");
	e.setEmpEmailId("chalisesaroj639@gmail.com");
	e.setEmpFonNumber("9846285132");
	e.setEmpId(5);
	e.setEmpName("Saroj Chalise");
	e.setEmpPosition("Level-7 Mechanical Engineer");
	e.setEmpSalary("45000");
	e.setJoiningdate("2079-06-02");
	e.setSupervisorName("birendra dev bharati");
	
	
	/*
	 * EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	 * EntityManager em=emf.createEntityManager();
	 * 
	 * em.persist(e);
	 */


	}

}

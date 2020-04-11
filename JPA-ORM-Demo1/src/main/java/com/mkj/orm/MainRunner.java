package com.mkj.orm;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory entityManagerFactory =
	          Persistence.createEntityManagerFactory("pu");

	public static void main(String[] args) {
		     try {
	    	  doSave();
	      } finally {
	          entityManagerFactory.close();
	      }
	  }

	  private static void doSave() {
	      System.out.println("1 "+entityManagerFactory);
	      EntityManager em = entityManagerFactory.createEntityManager();
		
	      System.out.println("2 "+em);
	      
	      Opportunity opp = new Opportunity("Cinthiya Somes", 8500);
	      opp.setAccountNumber(101);
	      System.out.println(" 3 "+opp);
	      em.getTransaction().begin();
	      System.out.println(" 4 Transaction started ");
	      em.persist(opp);
	      System.out.println(" 5 Persist called ");
	      em.getTransaction().commit();
	      System.out.println(" 6 commit ");
	      em.close();
	      System.out.println("closed ");
	  }

}

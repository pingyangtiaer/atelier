package no.studios.atelier.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DBTestBase
{
  private EntityManagerFactory emFactory;
  protected EntityManager em;

  protected void setUp() throws Exception
  {
    emFactory = Persistence.createEntityManagerFactory("test-pu");
    em = emFactory.createEntityManager();
  }

}
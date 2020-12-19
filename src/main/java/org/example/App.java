package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rahi");
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        Car car = new Car("ra122wdwda","Arihx");

        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();

    }
}

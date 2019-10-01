package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

public class HibernateMain
{
	
public static void main(String[] args)
{
	
 Configuration c= new Configuration().configure();
 SessionFactory f=c.buildSessionFactory();
 Session s= f.openSession();
 Transaction t= s.beginTransaction();

 Product p= new Product();
 p.setProductId(1001);
 p.setName("Led Tv");
 p.setBrand("sony");
 p.setPrice(30000);

 s.save(p);
 System.out.println("Product is saved");



  t.commit();
  s.close();
}

}
package com.tut.com.tut;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
/**
 * Hello world!
 *
 */
public class App 
{
   // public static void main( String[] args ) throws IOException
    public static void main( String[] args ) 
    {
        System.out.println( "Application Launched..." );
       
        Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory= cfg.buildSessionFactory();
       student st= new student();
       st.setCity("Lucknow");
       st.setName("Amit");
//       st.setDt(new Date());
//       FileInputStream fis= new FileInputStream("src/main/java/1.jpeg");
//       byte [] data= new byte[fis.available()];
//       fis.read(data);
       Session session = factory.openSession();
       Transaction tx=session.beginTransaction();
       session.save(st);
       tx.commit();
       session.close();
       factory.close();
       System.out.println(st);
    }

	}


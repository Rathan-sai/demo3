package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import javax.security.auth.login.Configuration;/\

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        Alien mars = new Alien();

        mars.setId(100);
        mars.setName("pravallika");
        mars.setColor("green");

        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();
        session.save(mars);
    }
}


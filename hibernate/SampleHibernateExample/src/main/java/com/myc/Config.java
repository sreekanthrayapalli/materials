package com.myc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config {

	public static Session getSession() {
		Configuration cfg = new Configuration();

		cfg.configure();// it reads data from hibernate.cfg.xml
		// cfg.configure("filename");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}

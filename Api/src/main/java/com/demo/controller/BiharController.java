package com.demo.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.demo.HibernateORM.HibernateUtil;
import com.demo.model.A;
import com.demo.util.JsonUtil;
@Controller
@RequestMapping("/Bihar")
public class BiharController {
	
	private static final SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
	
	@RequestMapping(value = "/hi",method = RequestMethod.POST)
	public void save(@RequestBody String input)
	{
		 A a = JsonUtil.convertJsonToJavaObject(input, A.class);
		 System.out.println(a.getUid());
		 
		// Session session = sessionFactory.openSession();
		 try {
			 //Transaction tx = session.beginTransaction();
			// session.persist();
				//tx.commit();
				//session.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

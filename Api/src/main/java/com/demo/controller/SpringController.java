package com.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.HibernateORM.HibernateUtil;
import com.demo.model.A;
import com.demo.model.Employee;
import com.demo.util.JsonUtil;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
@Controller
@RequestMapping("/wel")
public class SpringController {
	
	@RequestMapping(value = "/hi",method = RequestMethod.POST)
	public void save(@RequestBody String input)
	{
		//JsonParser jsonParser = new JsonParser();
		//JsonObject objectFromString = jsonParser.parse(input).getAsJsonObject();
		//System.out.println(objectFromString.toString());
		//int id =  objectFromString.get("id").getAsInt();
		//String name =  objectFromString.get("firstName").getAsString();
		//System.out.println(id+name);
		/**
		 * call convert JSON To Java Object
		 */
		//Employee Objresult = JsonUtil.convertJsonToJavaObject(input, Employee.class);
		//System.out.println(Objresult);
		
		 A a = JsonUtil.convertJsonToJavaObject(input, A.class);
		 System.out.println(a.getUid());
		/**
		 * call convert Java Object To JSON
		 */
		 Employee e= new Employee();
		 e.setId(1);
		 e.setFirstName("first");
		 e.setLastName("Last");
		String jsonResult = JsonUtil.convertJavaObjectToJson(e);
		System.out.println(jsonResult);
		
		/**
		 * call convert Java Object Pretty To JSON
		 */
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		jsonResult = JsonUtil.convertJavaObjectPrettyToJson(e);
		System.out.println(jsonResult);
		
	}
	
}

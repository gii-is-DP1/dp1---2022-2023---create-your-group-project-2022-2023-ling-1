package org.springframework.samples.petclinic.web;

import java.util.*;

import org.springframework.samples.petclinic.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	  @GetMapping({"/","/welcome"})
	  public String welcome(Map<String, Object> model) {
		List<Person> persons = new ArrayList<Person>();
		Person marco = new Person();
		marco.setFirstName("Marco");
		marco.setLastName(" Chasco");
		persons.add(marco);
		Person josemi = new Person();
		josemi.setFirstName("Jose Miguel");
		josemi.setLastName(" Garcia");
		persons.add(josemi);
		Person felix = new Person();
		felix.setFirstName("Felix");
		felix.setLastName(" Gudiel");
		persons.add(felix);
		Person enrique = new Person();
		enrique.setFirstName("Enrique");
		enrique.setLastName(" Cabellero");
		persons.add(enrique);
		Person michael = new Person();
		michael.setFirstName("Michael");
		michael.setLastName(" Poelzl");
		persons.add(michael);
		Person niclas = new Person();
		niclas.setFirstName("Niclas");
		niclas.setLastName(" Hulsmann");
		persons.add(niclas);
		model.put("persons", persons);
		model.put("title", "DP1-2022-2023-LING-1");
		model.put("group", "LING-1");
			    

	    return "welcome";
	  }
}

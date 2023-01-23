package com.example.demoporject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
public class SessionController {

	
	@GetMapping("/hey")
	public String hi (HttpSession s)
	{
		s.setAttribute("nbi", 29);
		List<String> strings = new ArrayList<>();
		strings.add("S8713616G");
		strings.add("S8414408H");
		s.setAttribute("boro", strings);
		System.out.println(s.getCreationTime());
		return "yo";
	}
	
	@GetMapping("/yoyo")
	public void hey(HttpSession s)
	{
	    Object s1 = s.getAttribute("boro");
	    List<String> x = (List<String>)s1;
	    
	    
	    for (int i =0; i<x.size(); i++)
	    {
	    	System.out.println(x.get(i));
	    }
	}
}

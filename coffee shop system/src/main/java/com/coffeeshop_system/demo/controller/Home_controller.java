package com.coffeeshop_system.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import java.util.HashMap;

@RestController
public class Home_controller {
	
	@Value("${app.version}")
	private String appversion;
   
	@GetMapping
	@RequestMapping
	public Map getStatus() {
		Map map = new HashMap<String, String>();
		map.put("app-version", appversion);
		return map;
	}
}

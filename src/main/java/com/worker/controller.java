package com.worker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/dockerdemo")
	public String docker() {
		return "welcome to the world of docker";
	}
}

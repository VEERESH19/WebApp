package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {

	@GetMapping("/GoIndex")
	public String Index() {
		return "index.html";
	}

	@GetMapping("/GoHome")
	public String Home() {
		return "home.html";
	}

	@GetMapping("/GoStyleAttribute")
	public String StyleAttribute() {
		return "Attribute.html";
	}

	@GetMapping("/GoHeading")
	public String Heading() {
		return "Heading.html";
	}

	@GetMapping("/GoStyle")
	public String Style() {
		return "Style.html";
	}

	@GetMapping("/Gocss")
	public String css() {
		return "css.html";
	}

	@GetMapping("/table")
	public String table() {
		return "table.html";
	}

}

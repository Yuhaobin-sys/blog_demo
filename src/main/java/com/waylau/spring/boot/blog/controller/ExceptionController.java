package com.waylau.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class ExceptionController {

	@RequestMapping("/403")
	public String hello() {
	    return "403";
	}
 
}
 
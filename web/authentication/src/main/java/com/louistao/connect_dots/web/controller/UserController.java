package com.louistao.connect_dots.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login() {
		return "login url";
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome!";
	}
}

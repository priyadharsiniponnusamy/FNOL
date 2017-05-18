package com.fnol.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/fnol")
public class IndexController {

	@RequestMapping(value = "/userform", method = RequestMethod.GET)
	public String getLogin() {
		return "userform";
	}

}

package com.greglturnquist.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;

@Controller
public class HomeController {

	@ApiOperation(value = "View a list of available products",response = Iterable.class)
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}
// end::code[]
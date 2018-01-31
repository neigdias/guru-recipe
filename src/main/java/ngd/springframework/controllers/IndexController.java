package ngd.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Claudinei Dias on 2018-01-31
 */
@Controller
public class IndexController {

	@RequestMapping({"", "/", "/index"})
	public String getIndexPage(){
		return "index";
	}
}

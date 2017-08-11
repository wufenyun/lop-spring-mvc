/**
 * Package: com.lop.demo.controller
 * Description: 
 */
package com.lop.demo.controller.user;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:  
 * Date: 2017年5月23日 下午3:49:31
 * @author wufenyun 
 */
@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("login")
	public String login(HttpServletRequest req) {
	    Map<String,String> map = req.getParameterMap();
		System.out.println("login"+map.size());
		return null;
	}
}

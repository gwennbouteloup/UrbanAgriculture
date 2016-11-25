package urban.agriculture.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import urban.agriculture.model.User;
import urban.agriculture.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	//@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		List<User> listUsers = userService.list();
		ModelAndView model = new ModelAndView("UserList");
		model.addObject("userList", listUsers);
		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", new User());
		return model;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		// #GB_TO_DO update: replace dao by service
		// int userId = Integer.parseInt(request.getParameter("id"));
		// User user = userService.get(userId);
		// ModelAndView model = new ModelAndView("UserForm");
		// model.addObject("user", user);
		// return model;
		return null;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		// #GB_TO_DO update: replace dao by service
		// int userId = Integer.parseInt(request.getParameter("id"));
		// userDao.delete(userId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User user) {
		// #GB_TO_DO update: replace dao by service
		// userDao.saveOrUpdate(user);
		return new ModelAndView("redirect:/");
	}

}

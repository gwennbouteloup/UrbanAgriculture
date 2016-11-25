package urban.agriculture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import urban.agriculture.model.Business_InstallationType_OnGround;
import urban.agriculture.service.ServiceImpl_Business_InstallationType_OnGround;

@Controller
public class BusinessTypeOnGroundController {
	@Autowired
	private ServiceImpl_Business_InstallationType_OnGround serviceBuinessInstTypeOnGround;

	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		List<Business_InstallationType_OnGround> listBusinessInstTypeOnGround = serviceBuinessInstTypeOnGround.getAll();
		ModelAndView model = new ModelAndView("ViewBusinessTypeOnGroundList");
		model.addObject("viewListBusinessInstTypeOnGround", listBusinessInstTypeOnGround);
		return model;
	}

}

package com.gontuseries.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@ModelAttribute
	public void addingCommonObjects(Model model1) {
		model1.addAttribute("headerMessage", "Gerrit College of Engineering, Germany");
	}
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");

		return model;
	}
	
	//@RequestMapping("/submitAdmissionForm.html")
	//public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name, @RequestParam("studentHobby") String hobby) {

//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);

//		return model;
//	}

//	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
//	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {
//
//		String name = reqPar.get("studentName");
//		String hobby = reqPar.get("studentHobby");
//
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("msg","Details submitted by you:: Name: "+name+ ", Hobby: " + hobby);
//
//		return model;
//	}

	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1) {

		ModelAndView model = new ModelAndView("AdmissionSuccess");

		return model;
	}

}
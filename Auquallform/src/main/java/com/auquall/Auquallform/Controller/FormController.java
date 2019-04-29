package com.auquall.Auquallform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auquall.Auquallform.Model.form;
import com.auquall.Auquallform.serviceinterface.Mailservice;


@Controller
@RequestMapping("contact")
public class FormController {
	
	@Autowired
	Mailservice mailservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public String form(ModelMap map) {
		map.put("contact", new form());
		return "contact/form";
	}
	
	@RequestMapping(value = "send" ,method = RequestMethod.POST)
	public String send(@ModelAttribute("for") form form,ModelMap map) throws Exception {
		
		try {
		String contentString=	"Agent Id:"+form.getAgentId();
		contentString +="</br>User Name:"+form.getUsername();
		contentString +="</br>Request Date:"+form.getDateString();
		contentString +="</br>Request Time:"+form.getTimeString();
		contentString +="</br>Agency Name:"+form.getAgencynameString();
		mailservice.send(form.getEmailString(),"chandanm393@gmail.com",form.getSubjectString(),contentString);
		map.put("msg","Done!");
		}
		catch (Exception e) {
			// TODO: handle exception
			map.put("msg", e.getMessage());
		}
		return "contact/index";
	}
}

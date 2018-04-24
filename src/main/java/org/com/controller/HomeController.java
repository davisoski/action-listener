package org.com.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.com.model.StaticModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	private static final Log LOG = LogFactory.getLog(HomeController.class);

	@GetMapping("/")
	public String home(Model model) {

		StaticModel staticModel = new StaticModel();

		model.addAttribute("modelform", staticModel);

		return "index";
	}

	@PostMapping({ "/saveform" })
	public String saveForm(Model model, @ModelAttribute("modelform") StaticModel staticModel, RedirectAttributes ra) {
		LOG.info("HomeController.saveForm");

		LOG.info("staticModel: " + staticModel.toString());

		return "redirect:/";

	}

}
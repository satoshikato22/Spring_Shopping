package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.bean.productBean;
import com.example.demo.repository.productService;

@Controller
public class ProductController {
	@Autowired
	private productService ps;

	@GetMapping("/product")
	public String getProduct() {

		return "product";
	}

	@PostMapping("/product")
	public String PostProduct(@RequestParam("name") String str,Model model) {
		String name = str;
		productBean pb = ps.findOne(name);
		model.addAttribute("id",pb.getId());
		model.addAttribute("name",pb.getName());
		model.addAttribute("price",pb.getPrice());




		return "product";

	}

}

package com.example.demo.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.productBean;

@Service
public class productService {
	@Autowired
	private productRepository  pr;

	public productBean findOne(String name) {
		Map<String,Object> map = pr.findOne(name);

		int id = (Integer) map.get("id");
		String name1 =  (String) map.get("name");
		int price = (Integer) map.get("price");

		productBean pb = new productBean();
		pb.setId(id);
		pb.setName(name1);
		pb.setPrice(price);

		return pb;

	}
}

package com.example.demo.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class productRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public Map<String,Object> findOne(String name){
		String query = "select "
				+" * "
				+"from product "
				+"where name = ?";

		Map<String,Object> product =
				jdbcTemplate.queryForMap(query,name);
		return product;

	}
}

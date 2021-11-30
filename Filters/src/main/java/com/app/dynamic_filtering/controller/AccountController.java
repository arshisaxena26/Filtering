package com.app.dynamic_filtering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dynamic_filtering.dao.AccountRepository;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository repo;

	@GetMapping("/accounts")
	public MappingJacksonValue getAllAccounts() {

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("accountNumber", "accountHolder",
				"amount");
		FilterProvider filters = new SimpleFilterProvider().addFilter("AccountFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(repo.findAccounts());
		mapping.setFilters(filters);
		return mapping;
	}
}

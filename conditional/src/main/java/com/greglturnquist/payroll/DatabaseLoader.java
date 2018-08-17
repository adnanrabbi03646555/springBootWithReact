package com.greglturnquist.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductRepository repository;

	@Autowired
	public DatabaseLoader(ProductRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.repository.save(new Product("HP",1, "360", "HP Notebook"));
		this.repository.save(new Product("Dell",1, "450", "Dell Notebook"));
		this.repository.save(new Product("Vaio",1, "620", "Vaio Notebook"));
		this.repository.save(new Product("Samsung",1, "490", "Samsung Laptop"));
		this.repository.save(new Product("Asus",1, "380", "Asus Brand"));
		this.repository.save(new Product("Toshiba",1, "540", "Toshiba Brand"));
	}
}
// end::code[]
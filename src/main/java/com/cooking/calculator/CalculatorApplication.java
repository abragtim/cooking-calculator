package com.cooking.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class CalculatorApplication {

	private static final float flour_grams_in_tbsp = 30.3f;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@GetMapping("/flour-to-tbsp")
	public List<Integer> flour_grams_to_tbsp(@RequestParam(value = "grams") int grams) {
		return List.of((int) (grams/flour_grams_in_tbsp));
	}
}

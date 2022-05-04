package com.ibm.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ibm.model.CurrencyConvert;

@RestController
@RequestMapping("/currency")
public class CurrencyConversionController {

	@Value("${url}")
	String url;

	@GetMapping("/{countryCode}/{amount}")
	public ResponseEntity<Double> getConvertedCurrnecyConvertionByCountryCode(@PathVariable String countryCode,
			@PathVariable double amount) {

		ResponseEntity<CurrencyConvert> responseModel = new RestTemplate().getForEntity(url+"currency/"+countryCode, CurrencyConvert.class,
				countryCode);
		CurrencyConvert response = responseModel.getBody();
		CurrencyConvert currencyConvert = new CurrencyConvert(response.getId(), countryCode,
				response.getConversionFactor(), amount, amount * response.getConversionFactor());
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(currencyConvert.getCountryCode()).toUri();
		return ResponseEntity.created(location).body(currencyConvert.getConvertedAmount());
	}

}

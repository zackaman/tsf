package com.task2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalCotroller {
	
	@RequestMapping(value = "/sum",method = RequestMethod.POST)
    public int calculatesum(@RequestParam("num1") int number1,
    		                @RequestParam("num2") int number2) {
		return number1 + number2;
				
	}
	
	@RequestMapping(value = "/sub",method = RequestMethod.POST)
    public int calculatesub(@RequestParam("num1") int number1,
    		                @RequestParam("num2") int number2) {
		return number1 - number2;
				
	}
	
	@RequestMapping(value = "/mul",method = RequestMethod.POST)
    public int calculatemul(@RequestParam("num1") int number1,
    		                @RequestParam("num2") int number2) {
		return number1 * number2;
				
	}
	
	@RequestMapping(value = "/div",method = RequestMethod.POST)
    public int calculatediv(@RequestParam("num1") int number1,
    		                @RequestParam("num2") int number2) {
		return number1 / number2;
				
	}
}

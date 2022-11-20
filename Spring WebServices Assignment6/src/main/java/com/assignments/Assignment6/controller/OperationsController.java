package com.assignments.Assignment6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignments.Assignment6.bean.Operations;

@RestController
	public class OperationsController {

		@GetMapping("/")
		public String showPage() {
			return "Enter the Opeartion to be Performed and Input Numbers";
		}
		
		@PostMapping("/operations")
		public String performOperations(@RequestBody Operations operation) {
			if(operation.getOperation().equals("add"))
				return "Addition of "+operation.getA()+" and "+operation.getB()+" is "+ (operation.getA()+operation.getB());
			if(operation.getOperation().equals("sub"))
				return "Subtraction of "+operation.getA()+" and "+operation.getB()+" is "+ (operation.getA()-operation.getB());
			if(operation.getOperation().equals("mul"))
				return "Multiplication of "+operation.getA()+" and "+operation.getB()+" is "+ (operation.getA()*operation.getB());
			if(operation.getOperation().equals("div"))
				return "Division of "+operation.getA()+" and "+operation.getB()+" is "+ (operation.getA()/operation.getB());
			if(operation.getOperation().equals("squareroot"))
				return "Square Root of "+operation.getA()+" is "+ (Math.sqrt(Double.valueOf(operation.getA())));
			return "Operation Not Supported";
		}
	}


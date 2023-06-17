package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("msg")
	public String getMsg() {
		
		
		return "<b>Hi from MsgController</b>";
	}

}

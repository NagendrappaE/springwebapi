package com.ece.springbootAPI.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ece.springbootAPI.bean.StudentResp;

@RequestMapping
@RestController
public class StudentController {

	@PostMapping("savestudent")
	public StudentResp getStudent() {

		StudentResp resp = new StudentResp();

		resp.setSage(String.valueOf(LocalDate.now()));
		resp.setSalary("500000");
		resp.setSname("NAGENDRA");
		return resp;

	}

}

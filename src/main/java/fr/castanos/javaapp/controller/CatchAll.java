package fr.castanos.javaapp.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CatchAll {
	@Value( "${toto.value}" )
	private String value;

	@RequestMapping(value ={"/", "/**/{[path:[^\\.]*}"})
	public ResponseEntity<String> index(final HttpServletRequest request) {

		return new ResponseEntity<String>("<p>date="+new Date().toString()+"</p><p> toto.value="+value+"</p>", HttpStatus.OK);
	}
}

package com.example.nikhil.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.nikhil.payloads.ApiResponse;
import com.example.nikhil.payloads.ToDoDto;
import com.example.nikhil.service.ToDoService;





@RestController
@RequestMapping("/api/v1/todo")
@CrossOrigin(origins ="http://localhost:3000")
public class ToDoController {

	@Autowired
	ToDoService toDoService;

	@RequestMapping(method = RequestMethod.POST, value = "/")
	public ResponseEntity<ToDoDto> createToDo(@Valid @RequestBody ToDoDto toDoDto) {
		ToDoDto doDto = toDoService.createToDo(toDoDto);
		return new ResponseEntity<ToDoDto>(doDto, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{toDoId}")
	public ResponseEntity<ToDoDto> getToDoById(@PathVariable("toDoId") int toDoId) {
		return new ResponseEntity<ToDoDto>(toDoService.getToDoById(toDoId), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ResponseEntity<List<ToDoDto>> getAllToDos() {
		return new ResponseEntity<List<ToDoDto>>(toDoService.getAllToDos(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{toDoId}")
	public ResponseEntity<ToDoDto> updateToDo(@Valid @RequestBody ToDoDto doDto, @PathVariable("toDoId") int toDoId) {
		return new ResponseEntity<ToDoDto>(toDoService.updateToDo(doDto, toDoId), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{toDoId}")
	public ResponseEntity<ApiResponse> deleteById(@PathVariable("toDoId") int toDoId) {
		toDoService.deleteById(toDoId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("ToDo", String.valueOf(toDoId)), HttpStatus.OK);
	}

}


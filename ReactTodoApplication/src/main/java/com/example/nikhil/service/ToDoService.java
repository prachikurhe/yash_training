package com.example.nikhil.service;

import java.util.List;

import com.example.nikhil.payloads.ToDoDto;







public interface ToDoService {
    public ToDoDto createToDo(ToDoDto todoDto);



   public ToDoDto getToDoById(int toDoId);



   List<ToDoDto> getAllToDos();



   public ToDoDto updateToDo(ToDoDto userDto, int toDoId);
    
    public void deleteById(int toDoId);
}

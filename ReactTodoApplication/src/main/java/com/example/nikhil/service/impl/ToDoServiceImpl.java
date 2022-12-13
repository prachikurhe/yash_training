package com.example.nikhil.service.impl;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nikhil.payloads.ToDoDto;
import com.example.nikhil.repository.ToDoRepository;
import com.example.nikhil.service.ToDoService;
import com.example.nikhil.entities.ToDo;
import com.example.nikhil.exception.ResourceNotFoundException;


@Service
public class ToDoServiceImpl implements ToDoService{
	@Autowired
	ToDoRepository todoRepository;
	
	@Autowired
	ModelMapper modelMapper;
	

	@Override
    public ToDoDto createToDo(ToDoDto todoDto) {
        ToDo toDo = this.modelMapper.map(todoDto, ToDo.class);
        ToDo savedToDo = todoRepository.save(toDo);
        return this.modelMapper.map(savedToDo, ToDoDto.class);
    }



   @Override
    public ToDoDto getToDoById(int toDoId) throws ResourceNotFoundException {
        Optional<ToDo> toDo = todoRepository.findById(toDoId);
        toDo.orElseThrow(() -> new ResourceNotFoundException("toDo", "ID", toDoId));
        return this.modelMapper.map(toDo, ToDoDto.class);
    }



   @Override
    public List<ToDoDto> getAllToDos() {
        return todoRepository.findAll().stream().map(t -> this.modelMapper.map(t, ToDoDto.class))
                .collect(Collectors.toList());
    }



   @Override
    public ToDoDto updateToDo(ToDoDto todoDto, int toDoId) {
        ToDo toDo = todoRepository.findById(toDoId)
                .orElseThrow(() -> new ResourceNotFoundException("toDo", "id", toDoId));
        toDo.setName(todoDto.getName());
        toDo.setDescription(todoDto.getDescription());
        toDo.setCompletionDate(todoDto.getCompletionDate());
        toDo.setDone(todoDto.isDone());
        return this.modelMapper.map(todoRepository.save(toDo), ToDoDto.class);
    }



   @Override
    public void deleteById(int toDoId) {
        todoRepository.findById(toDoId).orElseThrow(() -> new ResourceNotFoundException("toDo", "id", toDoId));
        todoRepository.deleteById(toDoId);



   }


	
}
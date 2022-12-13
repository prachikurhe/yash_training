package com.example.nikhil.controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.nikhil.payloads.ApiResponse;
import com.example.nikhil.payloads.UserDto;
import com.example.nikhil.repository.UserRepository;
import com.example.nikhil.service.FileService;
import com.example.nikhil.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	FileService fileService;
	
	@Value("${project.image}")
	private String path;	
	
	
	@RequestMapping(method = RequestMethod.POST , value="/")
	public ResponseEntity<UserDto>  createUser(@Valid @RequestBody UserDto userDto){
		UserDto user = userService.createUser(userDto);
		return new ResponseEntity<UserDto>(user , HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/{userId}")
	public ResponseEntity<UserDto>  updateUser(@Valid @RequestBody UserDto userDto , @PathVariable("userId") int userId){
		
		return new ResponseEntity<UserDto>(userService.updateUser(userDto, userId) , HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/{userId}")
	public ResponseEntity<ApiResponse>  deleteUser(@PathVariable("userId") int userId){
		userService.deleteById(userId);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse("User", String.valueOf(userId)), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/{userId}")
	public ResponseEntity<UserDto>  getUserById(@PathVariable("userId") int userId){
		
		return new ResponseEntity<UserDto>(userService.getUserById(userId) , HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/" )
	public ResponseEntity<List<UserDto>>  getAllUsers(@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize){
		
		return new ResponseEntity<List<UserDto>>(userService.getAllUsers(pageSize, pageSize) , HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST , value="/image/{userId}")
	public ResponseEntity<UserDto> uploadImageForUser(@RequestParam("image") MultipartFile image , @PathVariable("userId") int userId , HttpServletRequest request){
        UserDto user = userService.getUserById(userId);
        String rootDirectory=request.getSession().getServletContext().getRealPath("/");
		   try {
			   image.transferTo(new File(rootDirectory+"resources\\images\\"+userId+".png"));
		   }catch(Exception ex) {}
		return new ResponseEntity<UserDto>(user , HttpStatus.OK);		
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/image/{userId}"  , produces = MediaType.IMAGE_PNG_VALUE)
	public ResponseEntity<Resource> getImageForUser(@PathVariable("userId") int userId)  throws IOException{
		final ByteArrayResource inputStream = new ByteArrayResource(
				Files.readAllBytes(Paths.get("src/main/webapp/resources/images/"+userId+".png")));
		return ResponseEntity
				.status(HttpStatus.OK)
				.contentLength(inputStream.contentLength())
				.body(inputStream);  
		
	}
	


}
 
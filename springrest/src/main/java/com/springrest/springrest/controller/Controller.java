package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.objects.Objects;
import com.springrest.springrest.services.ObjectsServices;

@RestController
public class Controller {
	@Autowired
	private ObjectsServices objectsService; 
	
	
	
	//get the objects
	@GetMapping("/objects")
	public List<Objects> getObjects(){
		return this.objectsService.getObjects();
		
	}
	
	//get single object
	@GetMapping("/objects/{objectId}")
	public Objects getObject(@PathVariable String objectId) {
		return this.objectsService.getObject(Long.parseLong(objectId));
	}

	//add object
	@PostMapping("/objects")
	public Objects addObject(@RequestBody Objects object) {
		return this.objectsService.addObject(object);
	}
	
	//update object
	@PutMapping("/objects")
	public Objects updateObject(@RequestBody Objects object) {
		return this.objectsService.updateObject(object);
	}
	
	//delete the object
	@DeleteMapping("object/{courseId}")
	public ResponseEntity<HttpStatus> deleteObject(@PathVariable String objectId){
		try {
			this.objectsService.deleteObject(Long.parseLong(objectId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}

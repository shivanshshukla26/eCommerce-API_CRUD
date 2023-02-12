package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.ObjectsDao;
import com.springrest.springrest.objects.Objects;

@Service
public class ObjectsServImpl implements ObjectsServices {

	@Autowired
	private ObjectsDao objectsDao;
	
	public ObjectsServImpl() {
		
	}
	
	
	@Override
	public List<Objects> getObjects() {
		
		return objectsDao.findAll();
	}


	@Override
	public Objects getObject(Long objectId) {
		
		return objectsDao.getOne(objectId);	
	}


	@Override
	public Objects addObject(Objects object) {
		objectsDao.save(object);
		return object;
	}


	@Override
	public Objects updateObject(Objects object) {
		
		objectsDao.save(object);
		return object;
	}


	@Override
	public void deleteObject(long parseLong) {
		Objects entity = objectsDao.getOne(parseLong);
		objectsDao.delete(entity);
		
	}

}

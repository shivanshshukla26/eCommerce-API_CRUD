package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.objects.Objects;

public interface ObjectsServices {
	public List<Objects> getObjects();
	
	public Objects getObject(Long objectId);
	
	public Objects addObject(Objects object);
	
	public Objects updateObject(Objects object);
	
	public void deleteObject(long parseLong);

}

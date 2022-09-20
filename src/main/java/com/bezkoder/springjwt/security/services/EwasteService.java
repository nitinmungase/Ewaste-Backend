package com.bezkoder.springjwt.security.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.EwasteDao;
import  com.bezkoder.springjwt.models.Ewaste;

@Service
public class EwasteService {
	
	@Autowired
	private EwasteDao ewasteDao;

	
	public List<Ewaste> getItems() {
		return ewasteDao.findAll();
	}

	
	public Ewaste addItem(Ewaste item) {
		return ewasteDao.save(item);
	}

	
	public Ewaste updateItem(Ewaste item) {
		 ewasteDao.save(item);
		 return item;
	}

	public void deleteItem(long parseLong) {
		Ewaste enitity = ewasteDao.getOne(parseLong);
		ewasteDao.delete(enitity);
	}
}

package com.springboot.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.persistence.mappers.ItemMapper;
import com.springboot.app.persistence.models.ItemModel;

@Service
public class UpdateItemServiceImpl implements UpdateItemService {
	@Autowired
	ItemMapper pMapper;

	@Override
	public int updateService(List<ItemModel> lista) throws Exception {
	 	int contador= 0;
	 
	 	for (ItemModel obj : lista) {
	 		int y = pMapper.insertMapper(obj);
	 		contador += y;
	 		
		}
		

		

		return contador;
	}
}

package com.springboot.app.services;

import java.util.List;

import com.springboot.app.persistence.models.ItemModel;

public interface InsertItemService {
	
	public int insertService(List<ItemModel> lista) throws Exception;
}

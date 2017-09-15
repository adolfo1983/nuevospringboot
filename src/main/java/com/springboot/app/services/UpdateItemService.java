package com.springboot.app.services;

import java.util.List;

import com.springboot.app.persistence.models.ItemModel;

public interface UpdateItemService {
	public int updateService(List<ItemModel> lista) throws Exception;
}

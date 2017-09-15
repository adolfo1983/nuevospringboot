package com.springboot.app.services;

import java.util.ArrayList;
import java.util.List;

import com.springboot.app.persistence.models.ItemModel;

public interface PruebaService {
	
	public int insertService(List<ItemModel> lista) throws Exception;

}

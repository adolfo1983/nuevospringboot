package com.springboot.app.persistence.mappers;

import java.util.List;

import com.springboot.app.persistence.models.ItemModel;

public interface PruebaMapper {
	
	public int insertMapper(ItemModel obj) throws Exception;
	public int updateMapper(ItemModel obj) throws Exception;
	public int deleteMapper(ItemModel obj) throws Exception;

}

package com.springboot.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springboot.app.persistence.mappers.PruebaMapper;
import com.springboot.app.persistence.models.ItemModel;
	
	@Service
	public class PruebaServiceImpl implements PruebaService {

		@Autowired
		PruebaMapper pMapper;

		@Override
		public int insertService(List<ItemModel> lista) throws Exception {
		 	int contador= 0;
		 
		 	for (ItemModel obj : lista) {
		 		int y = pMapper.insertMapper(obj);
		 		contador += y;
		 		
			}
			

			

			return contador;
		}

}

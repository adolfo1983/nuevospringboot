package com.springboot.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.services.InsertItemService;
import com.springboot.app.services.UpdateItemService;

@Controller
public class UpdateItemController {
	@Autowired
	UpdateItemService pService;

	@ResponseBody
	@RequestMapping(value = "/insertItem",
	                method = RequestMethod.POST,
	                produces = MediaType.APPLICATION_JSON_VALUE)
	public int insert(@RequestBody ItemModel item) throws Exception
	{   
		ItemModel obj2 = new ItemModel();
		 obj2.setNombre("Tekken");
		 obj2.setDescripcion("Juego desarrollado por Namco Bandai");
		 obj2.setUrl("http://cdn2-www.playstationlifestyle.net/assets/uploads/gallery/tekken-7-review/tekken-7-review-01.png");
		 ItemModel obj3 = new ItemModel();
		 obj3.setNombre("God of War 4");
		 obj3.setDescripcion("Juego desarrollado por Sony");
		 obj3.setUrl("https://i.ytimg.com/vi/XXGq_AKsp9s/maxresdefault.jpg");
		 List<ItemModel> lista= new ArrayList<ItemModel>();
		 lista.add(obj2);
		 lista.add(obj3);
		 
		 int y = pService.updateService(lista);
		
		
		System.out.println("Se han insertado " + y + " filas");
	  

	  return y;
	}
}

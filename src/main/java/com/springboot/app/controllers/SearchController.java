package com.springboot.app.controllers;


import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.services.ItemService;
import com.springboot.app.utils.UtilStr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class SearchController
{

  @Autowired
  ItemService iService;


  @ResponseBody
  @RequestMapping(value = "/searchItem",
                  method = RequestMethod.POST,
                  produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ItemModel> test(@RequestBody ItemModel obj) throws Exception
  {   
    List<ItemModel> x = null;
    
    if (UtilStr.removeSpacesAll(obj.getSearch()).length() > 0) 
	{
		x = iService.itemService(obj);

		if (x.size() > 0) 
		{
			x = iService.underlineItemsService(obj, x);
		}
	} 
	else 
	{
		x = iService.itemService(obj);
	}

	return x;
    
  }
  
   @ResponseBody
  @RequestMapping(value = "/searchPesoItem",
                  method = RequestMethod.POST,
                  produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ItemModel> peso(@RequestBody ItemModel obj) throws Exception
  {   
    List<ItemModel> x = iService.pesoItemService(obj);
    

    return x;
  }

  @ResponseBody
  @RequestMapping(value = "/getItemx",
                  method = RequestMethod.POST,
                  produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ItemModel> get(@RequestBody ItemModel obj) throws Exception
  {   
    List<ItemModel> x = iService.getItemService(obj);
    
    

    return x;
  }
  
  
}

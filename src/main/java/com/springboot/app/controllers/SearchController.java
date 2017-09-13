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
    List<ItemModel> y = null;
    
    if (UtilStr.removeSpacesAll(obj.getSearch()).length() > 0) 
	{
		y = iService.itemService(obj);

		if (y.size() > 0) 
		{
			y = iService.underlineItemsService(obj, y);
		}
	} 
	else 
	{
		y = iService.itemService(obj);
	}

	return y;
    
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
  @RequestMapping(value = "/getItem",
                  method = RequestMethod.POST,
                  produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ItemModel> get(@RequestBody ItemModel obj) throws Exception
  {   
    List<ItemModel> x = iService.getItemService(obj);
    

    return x;
  }
  
//  @ResponseBody
//  @RequestMapping(value = "/insertItem",
//                  method = RequestMethod.POST,
//                  produces = MediaType.APPLICATION_JSON_VALUE)
//  public List<ItemModel> insert(@RequestBody List<ItemModel> obj) throws Exception
//  {   
//    List<ItemModel> x = iService.insertItemsService(obj);
//    
//
//    return x;
//  }
}

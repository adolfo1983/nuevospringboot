package com.springboot.app.services;

import com.springboot.app.persistence.mappers.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.utils.UtilStr;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemMapper iMapper;

	@Override
	public List<ItemModel> itemService(ItemModel obj) throws Exception {

		List<ItemModel> x = iMapper.itemMapper(obj);

		

		return x;
	}

	@Override
	public List<ItemModel> pesoItemService(ItemModel obj) throws Exception {

		List<ItemModel> x = iMapper.pesoItemMapper(obj);

		
		return x;
	}

	@Override
	public List<ItemModel> getItemService(ItemModel obj) throws Exception {
		System.out.println("Servicio");
		List<ItemModel> x = iMapper.getItemMapper(obj);

		return x;
	}

	
	
	 @Override
	  public List<ItemModel> underlineItemsService(ItemModel obj, List<ItemModel> items) {
	    String classCss = "resalto";
	    List<ItemModel> listRemove = new ArrayList<>();
	    String objSearch = UtilStr.normalizerStr(UtilStr.
	            replaceSpacesToOneSpace(obj.getSearch()));
	    Pattern pattern = UtilStr.patternCaseInsensitive(objSearch);

	    for (ItemModel item : items)
	    {
	      boolean bln = false;
	      int iElem = 0;
	      String[] elms =
	      {
	        item.getNombre(),
	        item.getDescripcion()
	      };

	      for (String elm : elms)
	      {
	        String elmSearch = UtilStr.normalizerStr(elm);
	        Matcher compare = UtilStr.patternMatcher(pattern, elmSearch);

	        if (compare.find())
	        {
	          elm = elm.substring(compare.start(), compare.end());
	          String replace = compare.replaceAll(UtilStr.spanHtml(elm, classCss));

	          switch (iElem)
	          {
	            case 0:
	              item.setNombre(replace);
	              break;
	            case 1:
	              item.setDescripcion(replace);
	              break;
	          }

	          bln = true;
	        }

	        iElem++;
	      }

	      if (!bln)
	      {
	        listRemove.add(item);
	      }
	    }

	    items.removeAll(listRemove);

	    return items;
	  }
	 
	 

}

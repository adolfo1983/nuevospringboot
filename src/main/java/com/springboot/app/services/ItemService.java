package com.springboot.app.services;

import com.springboot.app.persistence.models.ItemModel;
import java.util.List;


public interface ItemService
{
	/**
	 * Método para buscar items concretos por el nombre o la descripción
	 * @param obj Objeto que contiene la cadena a buscar
	 * @return Lista de objetos que devuelve la consulta
	 * @throws Exception
	 */
  public List<ItemModel> itemService(ItemModel obj) throws Exception;
  
  /**
   * Método para buscar items concretos por el peso
   * @param obj Objeto que contiene la cadena a buscar
   * @return Lista de objetos que devuelve la consulta
   * @throws Exception
   */
  public List<ItemModel> pesoItemService(ItemModel obj) throws Exception;
  
  /**
   * Método que busca todos los items de la base de datos
   * @param obj Objeto que se envía en la petición, en este caso, vacío
   * @return
   * @throws Exception
   */
   public List<ItemModel> getItemService(ItemModel obj) throws Exception;
//   public List<ItemModel> insertItemsService(List<ItemModel> obj) throws Exception;

public List<ItemModel> underlineItemsService(ItemModel obj, List<ItemModel> x);
}
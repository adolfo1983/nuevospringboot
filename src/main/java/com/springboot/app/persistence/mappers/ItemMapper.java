package com.springboot.app.persistence.mappers;

import com.springboot.app.persistence.models.ItemModel;
import java.util.List;

public interface ItemMapper
{
  /**
   * Método para buscar items concretos a través del buscador
   * @param obj Objeto que contiene el o los items a buscar
   * @return Lista de objetos con todas las coincidencias de la búsqueda
   * @throws Exception
   */
  public List<ItemModel> itemMapper(ItemModel obj) throws Exception;
  
  /**
   * Método para buscar items concretos con el peso como referencia
   * @param obj Objeto que contiene la cadena a buscar
   * @return Lista de objetos con todas las coincidencias de la búsqueda
   * @throws Exception
   */
  public List<ItemModel> pesoItemMapper(ItemModel obj) throws Exception;
  
  /**
   * Método para mostrar todos los items de la base de datos
   * @param obj Objeto que se envía en la petición, en este caso, vacío
   * @return Lista de objetos que contiene todos los items de la base de datos
   * @throws Exception
   */
  public List<ItemModel> getItemMapper(ItemModel obj) throws Exception;
  
  /**
   * Método para insertar uno o más items en la base de datos
   * @param obj Objeto que contiene el o los items a insertar en la base de datos
   * @return Número entero que indica el número de filas afectadas en la inserción
   * @throws Exception
   */
  public int insertItemsMapper(ItemModel obj) throws Exception;
  
  /**
   * Método para actualizar la información de uno o más items de la base de datos
   * @param obj Objeto que contiene la información a actualizar
   * @return Número entero que indica el número de filas afectadas en la actualización
   * @throws Exception
   */
  public int updateItemsMapper(ItemModel obj) throws Exception;
  
  /**
   * Método para eliminar uno o más items de la base de datos
   * @param obj Objeto que contiene el item a eliminar de la bas de datos
   * @return Número entero que indica el número de filas afectadas en la eliminación del o de los items
   * @throws Exception
   */
  public int deleteItemsMapper(ItemModel obj) throws Exception;
}
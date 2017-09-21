package com.springboot.app.persistence.mappers;


import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.utils.UtilStr;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemMapperImpl implements ItemMapper
{

  @Autowired
  JdbcTemplate JdbcTemplate;


  @Override
  public List<ItemModel> getItemMapper(ItemModel obj) throws Exception
  {
	  System.out.println("Mapper");
    String sql = " SELECT * " +
                 " FROM items " +
                 " ORDER BY id DESC ";

    return JdbcTemplate.query(sql, new BeanPropertyRowMapper(ItemModel.class));
  }


  @Override
  public List<ItemModel> itemMapper(ItemModel obj) throws Exception
  {
    String sql = " SELECT * " +
                 " FROM items " +
                 " WHERE (nombre LIKE '%" + obj.getNombre() + "%') " +
                 " OR (descripcion LIKE '%" + obj.getDescripcion() + "%') " +
                 " ORDER BY id DESC ";

    return JdbcTemplate.query(sql, new BeanPropertyRowMapper(ItemModel.class));
  }
  
  @Override
  public List<ItemModel> pesoItemMapper(ItemModel obj) throws Exception {

      String sql= "SELECT * "
              + "FROM items "
              + "WHERE id "
              + "IN (SELECT iditem "
              + "FROM pesoitems "
              + "WHERE peso = " + obj.getNombre() + ")";
      
      return JdbcTemplate.query(sql, new BeanPropertyRowMapper(ItemModel.class));
              

  }
  
  @Override
  public int insertMapper(ItemModel obj) throws Exception
  {
    String sql = UtilStr.replaceSpacesToOneSpace(
            " INSERT INTO items " +
            " (nombre, " +
            "  descripcion, " +
            "  url) " +
            " VALUES " +
            " ('" + obj.getNombre() + "'" +
            " ,'" + obj.getDescripcion() + "'" +
            " ,'" + obj.getUrl() + "')");

    return JdbcTemplate.update(sql);
  }


  @Override
  public int updateMapper(ItemModel obj) throws Exception
  {
    String sql = UtilStr.replaceSpacesToOneSpace(
            " UPDATE items     " +
            " SET nombre=     '" + obj.getNombre() + "'" +
            "    ,descripcion='" + obj.getDescripcion() + "'" +
            "    ,url=        '" + obj.getUrl() + "'" +
            " WHERE id=        " + obj.getId());

    return JdbcTemplate.update(sql);
  }


  @Override
  public int deleteMapper(ItemModel obj) throws Exception
  {
    String sql = UtilStr.replaceSpacesToOneSpace(
            " DELETE FROM items " +
            " WHERE id=         " + obj.getId());

    return JdbcTemplate.update(sql);
  }
}



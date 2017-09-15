package com.springboot.app.persistence.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.utils.UtilStr;



@Repository
public class PruebaMapperImpl implements PruebaMapper
{

  @Autowired
  JdbcTemplate JdbcTemplate;
  
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
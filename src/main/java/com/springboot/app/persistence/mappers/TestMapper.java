package com.springboot.app.persistence.mappers;

import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.persistence.models.TestModel;
import java.util.List;
import java.util.Map;


public interface TestMapper
{
  public List<TestModel> testMapper(TestModel obj) throws Exception;
  public List<Map<String, Object>> selectMapper(TestModel obj) throws Exception;
}
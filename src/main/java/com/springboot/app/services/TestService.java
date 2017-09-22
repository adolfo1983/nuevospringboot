package com.springboot.app.services;

import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.persistence.models.TestModel;
import java.util.List;
import java.util.Map;


public interface TestService
{

  public List<TestModel> testService(TestModel obj) throws Exception;
  public List<Map<String, Object>> selectService(TestModel obj) throws Exception;

}

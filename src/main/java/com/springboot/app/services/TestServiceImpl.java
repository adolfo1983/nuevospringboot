package com.springboot.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.app.persistence.mappers.TestMapper;
import com.springboot.app.persistence.models.ItemModel;
import com.springboot.app.persistence.models.TestModel;
import java.util.List;
import java.util.Map;



@Service
public class TestServiceImpl implements TestService
{

  @Autowired
  TestMapper iMapper;


  @Override
  public List<TestModel> testService(TestModel obj) throws Exception
  {
    List<TestModel> x = iMapper.testMapper(obj);
    
    return x;
  }
  
  @Override
  public List<Map<String, Object>> selectService(TestModel obj) throws Exception
  {
	  List<Map<String, Object>> x = iMapper.selectMapper(obj);
    
    return x;
  }

}

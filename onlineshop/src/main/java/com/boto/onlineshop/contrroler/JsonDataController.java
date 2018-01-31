package com.boto.onlineshop.contrroler;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boto.onlineshopbackend.dao.ProdeuctDao;
import com.boto.onlineshopbackend.dto.Prodeuct;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	ProdeuctDao prodeuctDao;

	@RequestMapping(value="/all/products",produces=MediaType.APPLICATION_JSON)
	@ResponseBody
public List<Prodeuct> getAllProduect(){
	return prodeuctDao.ListActiveProdeuct();
	
      }
	

	
	@RequestMapping(value= "/category/{id}/products",produces=MediaType.APPLICATION_JSON)
	@ResponseBody
public List<Prodeuct> getAllProduectByCategoryId(@PathVariable()int id){
	return prodeuctDao.ListActiveProdeuctByCategory(id);
	
      }
	
}

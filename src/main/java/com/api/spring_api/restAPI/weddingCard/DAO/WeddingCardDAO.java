package com.api.spring_api.restAPI.weddingCard.DAO;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WeddingCardDAO {
    List<Map<String,Object>> testDB();
}

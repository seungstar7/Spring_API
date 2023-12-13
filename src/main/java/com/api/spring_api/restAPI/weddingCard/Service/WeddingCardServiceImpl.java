package com.api.spring_api.restAPI.weddingCard.Service;

import com.api.spring_api.restAPI.weddingCard.DAO.WeddingCardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class WeddingCardServiceImpl implements WeddingCardService {

    private final WeddingCardDAO weddingCardDAO;

    @Override
    public String wedding() {
        List<Map<String,Object>> list = weddingCardDAO.testDB();
        list.stream().forEach((it)->{
            System.out.println(it);
        });
        return "service is working";
    }
}

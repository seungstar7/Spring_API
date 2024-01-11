package com.api.spring_api.restAPI.weddingCard.Controller;

import com.api.spring_api.restAPI.weddingCard.Service.WeddingCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowCredentials = "false")
public class WeddingCardController {
    private final WeddingCardService weddingCardService;

    @GetMapping("/weddingCard")
    @ResponseBody
    public List<Map<String,Object>> testCont (){
        List<Map<String,Object>> list = weddingCardService.wedding();
        System.out.println(weddingCardService.wedding());
        return list;
    }
}

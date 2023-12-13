package com.api.spring_api.restAPI.weddingCard.Controller;

import com.api.spring_api.restAPI.weddingCard.Service.WeddingCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/weddingCard")
public class WeddingCardController {
    private final WeddingCardService weddingCardService;

    @GetMapping
    public String testCont (){
        System.out.println(weddingCardService.wedding());
        return weddingCardService.wedding();
    }
}

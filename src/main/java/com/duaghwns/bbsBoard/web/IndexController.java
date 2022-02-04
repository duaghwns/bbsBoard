package com.duaghwns.bbsBoard.web;

import com.duaghwns.bbsBoard.web.dto.IndexResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "indexdddddd";
    }

    @GetMapping("/index/dto")
    public IndexResponseDto indexDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new IndexResponseDto(name,amount);
    }
}

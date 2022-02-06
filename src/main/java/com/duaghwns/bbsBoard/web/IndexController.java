package com.duaghwns.bbsBoard.web;

import com.duaghwns.bbsBoard.web.dto.IndexResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {


    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "views/index";
    }

    @GetMapping("/dto")
    public IndexResponseDto indexDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new IndexResponseDto(name,amount+99);
    }
}

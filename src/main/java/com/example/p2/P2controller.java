package com.example.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class P2controller {
    @GetMapping("/")
    public ModelAndView index(ModelAndView mav){
        mav.setViewName("index");
        mav.addObject("msg","お名前を入力してください");
        return mav;
    }
    @PostMapping("/")
    public ModelAndView send(
            @RequestParam("text1")String str,ModelAndView mav){
        mav.setViewName("index");
        mav.addObject("msg","こんにちは"+ str +"さん");
        mav.addObject("Value",str);
        return mav;
    }
}


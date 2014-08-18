package com.lorren.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lorren.springmvc.vo.UserVO;

@Controller
public class LoginController {
    @RequestMapping(value = "login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, UserVO userVO) {
        String username = userVO.getUsername();
        ModelAndView mv = new ModelAndView("/index/index", "command",
                "LOGIN SUCCESS, " + username);
        return mv;
    }
}
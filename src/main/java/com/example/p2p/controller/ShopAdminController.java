package com.example.p2p.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(value = "/shopadmin", method = RequestMethod.GET)
public class ShopAdminController {
    @GetMapping(value="/shopoperation")
    public String hello() {
        return "/shopoperation";
    }
}

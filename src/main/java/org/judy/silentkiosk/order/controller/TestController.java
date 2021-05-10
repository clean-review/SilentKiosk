package org.judy.silentkiosk.order.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/test")
public class TestController {
    @GetMapping("/chat")
    public void testChat(@ModelAttribute("sno") Long sno){
    }

    @GetMapping("/testFetch")
    public void testFetch(){
    }

    @GetMapping("/test")
    public void testLayout(){

    }
}

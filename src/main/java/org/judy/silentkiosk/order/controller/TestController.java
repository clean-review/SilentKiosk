package org.judy.silentkiosk.order.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.judy.silentkiosk.order.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final OrderService orderService;

    @GetMapping("/chat")
    public void testChat(@ModelAttribute("sno") Long sno){
    }

    @GetMapping("/testFetch")
    public void testFetch(){
    }

    @GetMapping("/test")
    public void testLayout(@ModelAttribute("sno")Long sno, Model model){

        model.addAttribute("sname", orderService.getStoreName(sno));
    }

    @GetMapping("/waiting")
    public void waiting(@ModelAttribute("sno")Long sno){

    }


}

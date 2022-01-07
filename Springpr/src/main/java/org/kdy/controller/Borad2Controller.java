package org.kdy.controller;

import org.kdy.domain.Board2DTO;
import org.kdy.service.Board2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board2")
public class Borad2Controller {
    @Autowired
    private Board2Service service2;

    @GetMapping("list2")
    public void list2(Model model2) {
        System.out.println("board2/list2");
        System.out.println("list결과는"+service2.list2());
        model2.addAttribute("list2", service2.list2());
    }
    @GetMapping("write2")
    public void write2() {
        System.out.println("board2/write2");
    }
    @PostMapping("write2")
    public String write2(Board2DTO board2) {
        service2.write2(board2);
        System.out.println("write post...."+board2);
        return "redirect:/board2/detail2";
    }
    @GetMapping("detail2")
    public void detail2(Board2DTO board2, Model model2) {
        model2.addAttribute("detail2",service2.detail2(board2));
    }
    @GetMapping("modify2")
    public void modify2(Board2DTO board2, Model model2) {
        model2.addAttribute("detail2",service2.detail2(board2));
    }
}

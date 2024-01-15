package org.zerock.guestbook.controller;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/guestbook")
@Log4j2
public class GuestbootController {

@Controller({"/","/List"})
public String List(){
    log.info("List......");

    return "/guestbook/List";
}

}

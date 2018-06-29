package com.jjk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SecController
 *
 * @author jiajunkang
 * @version 1.0.0
 **/
@RestController
public class SecController {

    @RequestMapping("sec")
    public String sec(){
        return "sec";
    }
}

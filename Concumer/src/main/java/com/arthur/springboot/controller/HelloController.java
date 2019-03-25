package com.arthur.springboot.controller;

import com.arthur.springboot.MyCRUD;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Reference(

    )
    private MyCRUD myCRUD;
    String a = "";
}

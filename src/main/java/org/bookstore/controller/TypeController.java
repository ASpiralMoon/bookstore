package org.bookstore.controller;

import org.bookstore.dto.ResponseData;
import org.bookstore.dto.Type;
import org.bookstore.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/5 13:04
 * @modify ...
 */
@Controller
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @ResponseBody
    @RequestMapping("/queryType")
    public ResponseData<Type> queryType() {
        return typeService.queryType();
    }

    @ResponseBody
    @RequestMapping("/addType")
    public ResponseData<Type> addType(@RequestParam("/typeName") String typeName) {
        return typeService.addType(typeName);
    }

    @ResponseBody
    @RequestMapping("/delType")
    public ResponseData<Type> delType(@RequestParam("/typeId")byte typeId){
        return typeService.delType(typeId);
    }

}

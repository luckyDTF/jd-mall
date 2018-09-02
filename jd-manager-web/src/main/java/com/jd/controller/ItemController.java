package com.jd.controller;

import com.jd.pojo.TbContentCategory;
import com.jd.pojo.TbItem;
import com.jd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService service;
    @RequestMapping(value = "/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
        return service.getItemById(itemId);
    }


    public TbContentCategory getContentCategory(int id){
        return null;
    }

}

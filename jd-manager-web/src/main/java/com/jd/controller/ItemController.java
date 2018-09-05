package com.jd.controller;

import com.jd.item.EasyUIDataGridResult;
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

    /**
     * 根据商品Id查询商品
     *
     * @param itemId
     * @return 返回商品json
     */
    @RequestMapping(value = "/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId) {
        return service.getItemById(itemId);
    }

    /**
     * 首页跳转
     *
     * @return
     */
    @RequestMapping(value = "/")
    public String show() {
        return "index";
    }

    /**
     * 返回每页信息
     *
     * @param page
     * @return
     */
    @RequestMapping(value = "/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    /**
     * 分页查询商品
     *
     * @return
     */
    @RequestMapping(value = "/item/list")
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        return service.getItemList(page, rows);
    }
}

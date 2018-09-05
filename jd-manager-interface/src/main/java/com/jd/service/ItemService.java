package com.jd.service;

import com.jd.item.EasyUIDataGridResult;
import com.jd.pojo.TbItem;

import java.util.List;

public interface ItemService {

    TbItem getItemById(long id);

    EasyUIDataGridResult getItemList(int page, int rows);
}

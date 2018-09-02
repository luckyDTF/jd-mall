package com.jd.serviceImpl;

import com.jd.mapper.TbItemMapper;
import com.jd.pojo.TbItem;
import com.jd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper mapper;

    @Override
    public TbItem getItemById(long id) {
        return mapper.selectByPrimaryKey(id);
    }
}

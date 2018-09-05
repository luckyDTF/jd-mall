package com.jd.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jd.item.EasyUIDataGridResult;
import com.jd.mapper.TbItemMapper;
import com.jd.pojo.TbItem;
import com.jd.pojo.TbItemExample;
import com.jd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper mapper;

    @Override
    public TbItem getItemById(long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public EasyUIDataGridResult getItemList(int page, int rows) {
        PageHelper.startPage(page,rows);

        TbItemExample example = new TbItemExample();

        List<TbItem> list = mapper.selectByExample(example);

        PageInfo<TbItem> pageInfo = new PageInfo<>(list);

        EasyUIDataGridResult result = new EasyUIDataGridResult();

        result.setRows(pageInfo.getList());

        result.setTotal(pageInfo.getTotal());

        return result;
    }


}

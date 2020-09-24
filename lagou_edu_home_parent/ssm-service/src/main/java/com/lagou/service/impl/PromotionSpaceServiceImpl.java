package com.lagou.service.impl;

import com.lagou.dao.PromotionSpaceMapper;
import com.lagou.domain.PromotionSpace;
import com.lagou.service.PromotionSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author: wjy
 * @DateTime: 2020/9/15 17:36
 * @ClassName PromotionSpaceServiceImpl
 */
@Service
public class PromotionSpaceServiceImpl implements PromotionSpaceService {

    @Autowired
    private PromotionSpaceMapper promotionSpaceMapper;

    /**
     * 查询全部的广告位
     * @return
     */
    @Override
    public List<PromotionSpace> findAllPromotionSpace()
    {
        return promotionSpaceMapper.findAllPromotionSpace();
    }

    /**
     * 保存广告位
     * @param promotionSpace
     */
    @Override
    public void savePromotionSpace(PromotionSpace promotionSpace) {

        //1.封装数据
        Date date = new Date();
        promotionSpace.setSpaceKey(UUID.randomUUID().toString());
        promotionSpace.setCreateTime(date);
        promotionSpace.setUpdateTime(date);
        promotionSpace.setIsDel(0);

        //2.调用mapper方法
        promotionSpaceMapper.savePromotionSpace(promotionSpace);
    }

    /**
     * 根据ID查询广告位
     * @param id
     * @return
     */
    @Override
    public PromotionSpace findPromotionSpaceById(Integer id) {
        PromotionSpace promotionSpace = promotionSpaceMapper.findPromotionSpaceById(id);
        return promotionSpace;
    }

    /**
     * 修改广告位名称
     * @param promotionSpace
     */
    @Override
    public void updatePromotionSpace(PromotionSpace promotionSpace) {
        promotionSpace.setUpdateTime(new Date());
        promotionSpaceMapper.updatePromotionSpace(promotionSpace);
    }


}

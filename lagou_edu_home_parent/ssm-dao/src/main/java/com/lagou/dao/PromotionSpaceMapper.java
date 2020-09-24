package com.lagou.dao;

import com.lagou.domain.PromotionSpace;

import java.util.List;

public interface PromotionSpaceMapper {

    /**
     * 查询所有的广告位
     * @return
     */
    public List<PromotionSpace> findAllPromotionSpace();

    /**
     * 添加广告位
     */
    public void savePromotionSpace(PromotionSpace promotionSpace);

    /**
     * 根据ID查询广告位信息
     */
    public PromotionSpace findPromotionSpaceById(Integer id);

    /**
     * 更新广告位
     */
    public void updatePromotionSpace(PromotionSpace promotionSpace);

}

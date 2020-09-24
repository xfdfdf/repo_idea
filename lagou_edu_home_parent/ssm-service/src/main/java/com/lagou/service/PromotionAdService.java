package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVO;

public interface PromotionAdService {

    /**
     * 分页查询广告信息
     */
    public PageInfo<PromotionAd> findAllPromotionAdByPage(PromotionAdVO promotionAdVO);


    /**
     * 新增广告
     */
    public void savePromotionAd(PromotionAd promotionAd);

    /**
     * 修改广告
     */
    public void updatePromotionAd(PromotionAd promotionAd);

    /**
     * 修改广告状态
     */
    public void updatePromotionAdStatus(Integer id,Integer status);
}

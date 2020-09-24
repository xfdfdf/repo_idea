package com.lagou.controller;

import com.lagou.domain.PromotionSpace;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wjy
 * @DateTime: 2020/9/15 17:44
 * @ClassName PromotionSpaceController
 */
@RestController
@RequestMapping("/PromotionSpace")
public class PromotionSpaceController {

    @Autowired
    private PromotionSpaceService promotionSpaceService;

    /**
     * 查询广告位列表
     *
     * @return
     */
    @RequestMapping("/findAllPromotionSpace")
    public ResponseResult findAllPromotionSpace() {
        List<PromotionSpace> allPromotionSpace = promotionSpaceService.findAllPromotionSpace();
        ResponseResult responseResult = new ResponseResult(true, 200, "查询所有广告位成功", allPromotionSpace);
        return responseResult;
    }

    /**
     * 添加&更新广告位
     */
    @RequestMapping("/saveOrUpdatePromotionSpace")
    public ResponseResult savePromotionSpace(@RequestBody PromotionSpace promotionSpace) {

        ResponseResult responseResult = null;
        if (null == promotionSpace.getId()) {
            //新增操作
            promotionSpaceService.savePromotionSpace(promotionSpace);
            responseResult = new ResponseResult(true, 200, "添加广告位成功", null);
        } else {
            //更新广告位操作
            promotionSpaceService.updatePromotionSpace(promotionSpace);
            responseResult = new ResponseResult(true, 200, "更新广告位名称成功", null);

        }

        return responseResult;
    }

    /**
     * 根据ID查询广告位信息
     */
    @RequestMapping("/findPromotionSpaceById")
    public ResponseResult findPromotionSpaceById(Integer id) {
        PromotionSpace promotionSpace = promotionSpaceService.findPromotionSpaceById(id);
        return new ResponseResult(true, 200, "查询具体广告位成功", promotionSpace);
    }
}

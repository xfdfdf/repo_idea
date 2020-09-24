package com.lagou.dao;

import com.lagou.domain.ResourceCategory;

import java.util.List;

/**
 * @Author: wjy
 * @DateTime: 2020/9/21 14:12
 * @ClassName ResourceCategoryMapper
 */
public interface ResourceCategoryMapper {
    /**
     * 查询所有的资源分类
     */
    public List<ResourceCategory> findAllResourceCategory();
}

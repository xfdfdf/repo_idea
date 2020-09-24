package com.lagou.service;

import com.lagou.domain.Test;

import java.util.List;

/**
 * @Author: wjy
 * @DateTime: 2020/9/12 21:00
 * @ClassName TestService
 */
public interface TestService {

    /**
     * 对test表进行查询所有
     */
    public List<Test> findAllTest();
}

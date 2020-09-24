package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVO;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wjy
 * @DateTime: 2020/9/16 14:04
 * @ClassName PromotionAdController
 */
@RestController
@RequestMapping("/PromotionAd")
public class PromotionAdController {

    @Autowired
    private PromotionAdService promotionAdService;

    /**
     * 分页广告查询
     */
    @RequestMapping("/findAllPromotionAdByPage")
    public ResponseResult findAllAdByPage( PromotionAdVO promotionAdVO) {
        PageInfo<PromotionAd> pageInfo = promotionAdService.findAllPromotionAdByPage(promotionAdVO);

        ResponseResult responseResult = new ResponseResult(true,200,"广告分页查询成功",pageInfo);
        return responseResult;
    }

    /*
       课程图片上传
    */
    @RequestMapping("/PromotionAdUpload")
    public ResponseResult fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {

        //1.判断接收到的上传文件是否为空
        if(file.isEmpty()) {
            throw new RuntimeException();
        }

        //2.获取项目的部署路径
        String realPath = request.getServletContext().getRealPath("/");
        System.out.println("项目的部署路径：" + realPath);
        String substring = realPath.substring(0,realPath.indexOf("ssm-web"));

        //3.获取原文件名
        String originalFilename = file.getOriginalFilename();

        //生成新文件名
        String newFileName =  System.currentTimeMillis() + originalFilename.substring(originalFilename.lastIndexOf("."));

        //5.进行文件上传
        String uploadPath = substring + "upload\\";
        File filePath = new File(uploadPath, newFileName);

        //如果目录不存在，就创建目录
        if(!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("创建目录 " + filePath + " 成功");
        }
        //上传文件成功
        file.transferTo(filePath);

        //6.将文件名和文件路径返回，进行响应
        Map<String,String> map = new HashMap<>();
        map.put("fileName",newFileName);
        map.put("filePath","http://localhost:8080/upload/" + newFileName);

        ResponseResult responseResult = new ResponseResult(true,200,"响应成功",map);
        return responseResult;

    }

    /**
     * 新建&修改广告接口
     */
    @RequestMapping("/saveOrUpdatePromotionAd")
    public ResponseResult saveOrUpdatePromotionAd(@RequestBody PromotionAd promotionAd) {
        ResponseResult responseResult = null;
        if(null == promotionAd.getId()) {
            //新增操作
            promotionAdService.savePromotionAd(promotionAd);
            responseResult = new ResponseResult(true,200,"增加广告成功",promotionAd);
            return responseResult;
        } else {
            //更新操作
            promotionAdService.updatePromotionAd(promotionAd);
            responseResult = new ResponseResult(true,200,"修改广告成功",promotionAd);
            return responseResult;
        }

    }

    /**
     * 广告动态上下线
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/updatePromotionAdStatus")
    public ResponseResult updatePromotionAdStatus(Integer id,Integer status) {

        promotionAdService.updatePromotionAdStatus(id,status);
        Map<String,Integer> map = new HashMap<>();
        map.put("status",status);
        return new ResponseResult(true,200,"广告动态上下线成功",map);
    }
}

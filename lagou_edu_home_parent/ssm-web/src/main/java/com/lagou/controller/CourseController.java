package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wjy
 * @DateTime: 2020/9/13 15:19
 * @ClassName CourseController
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/findCourseByCondition")
    public ResponseResult findCourseByCondition(@RequestBody CourseVO courseVO) {
        List<Course> list = courseService.findCourseByCondition(courseVO);
        ResponseResult responseResult = new ResponseResult(true,200,"响应成功",list);

        return responseResult;
    }


    /*
         课程图片上传
      */
    @RequestMapping("/courseUpload")
    public ResponseResult fileUpload(@RequestParam("file") MultipartFile file,HttpServletRequest request) throws IOException {

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
     * 新增加课程信息及讲师信息
     * 新增加课程信息和修改课程信息要写在同一个方法中
     */
    @RequestMapping("/saveOrUpdateCourse")
    public ResponseResult saveOrUpdateCourse(@RequestBody CourseVO courseVO) throws InvocationTargetException, IllegalAccessException {

        ResponseResult responseResult = null;
        //新增课程操作
        if(courseVO.getId() == null) {

            //调用service
            courseService.saveCourseOrTeacher(courseVO);
            responseResult = new ResponseResult(true, 200, "新增成功", null);
        }
        else {  //修改课程
            courseService.updateCourseOrTeacher(courseVO);
            responseResult = new ResponseResult(true, 200, "修改成功", null);

        }
        return responseResult;
    }

    /**
     * 根据ID查询具体的课程信息和关联的讲师信息
     */
    @RequestMapping("/findCourseById")
    public ResponseResult findCourseById(Integer id){

        CourseVO courseVO = courseService.findCourseById(id);
        ResponseResult responseResult = new ResponseResult(true, 200, "根据ID查询课程信息成功", courseVO);
        return responseResult;
    }

    /**
     * 课程状态管理
     */

    @RequestMapping("/updateCourseStatus")
    public ResponseResult updateCourseStatus(@RequestParam("id") Integer id,@RequestParam("status") Integer status) {

        //调用service,传递参数，完成课程状态的变更
        courseService.updateCourseStatus(id,status);
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("status",status);
        ResponseResult responseResult = new ResponseResult(true,200,"修改课程状态成功",map);
        return responseResult;

    }

}

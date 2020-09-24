package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wjy
 * @DateTime: 2020/9/15 10:43
 * @ClassName CourseContentController
 */
@RestController
@RequestMapping("/courseContent")
public class CourseContentController {

    @Autowired
    private CourseContentService courseContentService;

    @RequestMapping("/findSectionAndLesson")
    public ResponseResult findSectionAndLessonCourseId(@RequestParam("courseId") Integer courseId) {
        List<CourseSection> sectionList = courseContentService.findSectionAndLessonByCourseId(courseId);
        ResponseResult responseresult = new ResponseResult(true,200,"章节及课时查询成功",sectionList);
        return responseresult;
    }


    /**
     * 回显章节对应的课程信息
     */
    @RequestMapping("/findCourseByCourseId")
    public ResponseResult findCourseByCourseId(Integer courseId) {
        Course course = courseContentService.findCourseByCourseId(courseId);
        ResponseResult responseResult = new ResponseResult(true, 200, "查询课程信息成功", course);
        return responseResult;
    }

    /**
     * 新增&更新章节信息
     */

    @RequestMapping("/saveOrUpdateSection")
    public ResponseResult saveOrUpdateSection(@RequestBody CourseSection courseSection) {
        ResponseResult responseResult = null;
        //判断是否携带了章节ID
        if(courseSection.getId() == null) {
            //新增
            courseContentService.saveSection(courseSection);
            responseResult = new ResponseResult(true,200,"新增章节成功",null);
        } else {
            //修改
            courseContentService.updateSection(courseSection);
            responseResult = new ResponseResult(true,200,"修改章节成功",null);
        }
        return responseResult;
    }

    /**
     * 修改章节状态
     */
    @RequestMapping("/updateSectionStatus")
    public ResponseResult updateSectionStatus(int id,int status) {
        courseContentService.updateSectionStatus(id,status);
        Map<String,Integer> map = new HashMap<>();
        map.put("status",status);
        ResponseResult responseResult = new ResponseResult(true, 200, "修改章节状态成功", map);
        return responseResult;
    }

    /**
     * 新增&更新课时信息
     */

    @RequestMapping("/saveOrUpdateLesson")
    public ResponseResult saveOrUpdateLesson(@RequestBody CourseLesson courseLesson) {
        ResponseResult responseResult = null;
        //判断是否携带了章节ID
        if(courseLesson.getId() == null) {
            //新增
            courseContentService.saveLesson(courseLesson);
            responseResult = new ResponseResult(true,200,"新增课时成功",null);
        } else {
            //修改
            courseContentService.updateLesson(courseLesson);
            responseResult = new ResponseResult(true,200,"修改课时成功",null);
        }
        return responseResult;
    }

    /**
     * 修改课时状态
     */
    @RequestMapping("/updateLessonStatus")
    public ResponseResult updateLessonStatus(int id,int status) {
        courseContentService.updateLessonStatus(id,status);
        Map<String,Integer> map = new HashMap<>();
        map.put("status",status);
        ResponseResult responseResult = new ResponseResult(true, 200, "修改课时状态成功", map);
        return responseResult;
    }
}

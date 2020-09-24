package com.lagou.service.impl;

import com.lagou.dao.CourseContentMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: wjy
 * @DateTime: 2020/9/15 10:35
 * @ClassName CourseContentSrviceImpl
 */
@Service
public class CourseContentServiceImpl implements CourseContentService {

    @Autowired
    private CourseContentMapper courseContentMapper;


    @Override
    public List<CourseSection> findSectionAndLessonByCourseId(Integer id) {
        return courseContentMapper.findSectionAndLessonByCourseId(id);
    }

    @Override
    public Course findCourseByCourseId(int courseId) {
        return courseContentMapper.findCourseByCourseId(courseId);
    }

    @Override
    public void saveSection(CourseSection courseSection) {
        //1.补全信息
        Date date = new Date();
        courseSection.setCreateTime(date);
        courseSection.setUpdateTime(date);

        //调用courseContentMapper方法
        courseContentMapper.saveSection(courseSection);
    }

    @Override
    public void updateSection(CourseSection courseSection) {
        //补全信息
        courseSection.setUpdateTime(new Date());
        //2.调用courseContentMapper方法
        courseContentMapper.updateSection(courseSection);

    }

    @Override
    public void updateSectionStatus(int id,int status) {
        //封装数据
        CourseSection courseSection = new CourseSection();
        courseSection.setUpdateTime(new Date());
        courseSection.setId(id);
        courseSection.setStatus(status);

        //调用mapper
        courseContentMapper.updateSectionStatus(courseSection);
    }



    @Override
    public void saveLesson(CourseLesson courseLesson) {
        //1.补全信息
        Date date = new Date();
        courseLesson.setCreateTime(date);
        courseLesson.setUpdateTime(date);

        //调用courseContentMapper方法
        courseContentMapper.saveLesson(courseLesson);
    }

    @Override
    public void updateLesson(CourseLesson courseLesson) {
        courseLesson.setUpdateTime(new Date());
        courseContentMapper.updateLesson(courseLesson);
    }

    @Override
    public void updateLessonStatus(int id, int status) {


        CourseLesson courseLesson = new CourseLesson();
        courseLesson.setId(id);
        courseLesson.setUpdateTime(new Date());
        courseLesson.setStatus(status);

        //调用mapper
        courseContentMapper.updateLessonStatus(courseLesson);
    }
}

package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface CourseService {

    /**
     * 多条件列表查询
     * @param courseVO
     * @return
     */
    public List<Course> findCourseByCondition(CourseVO courseVO);

    /**
     *添加教师或者课程
     */
    public void saveCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /**
     * 根据ID查询课程信息
     */
    public CourseVO findCourseById(Integer id);

    /**
     * 更新课程及讲师信息
     */
    public void updateCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /**
     * 课程状态变更
     */
    public void updateCourseStatus(int courseId,int status) ;
}

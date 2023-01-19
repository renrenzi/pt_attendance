package com.jj.stu.attendance.dao.dto;

import com.jj.stu.attendance.dao.model.Course;
import lombok.Data;

import java.util.Date;

@Data
public class PageCourseDto {

    private Integer id;

    /**
     * 课程名字
     */
    private String name;

    /**
     * 教师Id
     */
    private Integer teacherId;

    /**
     * 课程时间
     */
    private Date courseDate;

    /**
     * 选课人数
     */
    private Integer selectedNum;

    /**
     * 最大人数
     */
    private Integer maxNum;

    private String info;

    private String teacherName;
}

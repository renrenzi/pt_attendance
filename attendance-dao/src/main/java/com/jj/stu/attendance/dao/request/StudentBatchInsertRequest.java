package com.jj.stu.attendance.dao.request;

import com.jj.stu.attendance.dao.model.Student;
import lombok.Data;

import java.util.List;

/**
 * @author 任人子
 * @date 2022/11/4  - {TIME}
 */
@Data
public class StudentBatchInsertRequest {
    List<Student> studentList;
}
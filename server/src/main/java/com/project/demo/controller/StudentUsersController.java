package com.project.demo.controller;

import com.project.demo.entity.StudentUsers;
import com.project.demo.service.StudentUsersService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 学生用户：(StudentUsers)表控制层
 *
 */
@RestController
@RequestMapping("/student_users")
public class StudentUsersController extends BaseController<StudentUsers, StudentUsersService> {

    /**
     * 学生用户对象
     */
    @Autowired
    public StudentUsersController(StudentUsersService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapstudent_account = new HashMap<>();
        mapstudent_account.put("student_account",String.valueOf(paramMap.get("student_account")));
        List liststudent_account = service.select(mapstudent_account, new HashMap<>()).getResultList();
        if (liststudent_account.size()>0){
            return error(30000, "字段学生账号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}

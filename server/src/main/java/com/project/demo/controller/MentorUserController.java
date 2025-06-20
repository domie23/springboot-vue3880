package com.project.demo.controller;

import com.project.demo.entity.MentorUser;
import com.project.demo.service.MentorUserService;
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
 * 导师用户：(MentorUser)表控制层
 *
 */
@RestController
@RequestMapping("/mentor_user")
public class MentorUserController extends BaseController<MentorUser, MentorUserService> {

    /**
     * 导师用户对象
     */
    @Autowired
    public MentorUserController(MentorUserService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> maptutor_account = new HashMap<>();
        maptutor_account.put("tutor_account",String.valueOf(paramMap.get("tutor_account")));
        List listtutor_account = service.select(maptutor_account, new HashMap<>()).getResultList();
        if (listtutor_account.size()>0){
            return error(30000, "字段导师账号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}

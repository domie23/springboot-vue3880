package com.project.demo.controller;

import com.project.demo.entity.MentorInformation;
import com.project.demo.service.MentorInformationService;
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
 * 导师信息：(MentorInformation)表控制层
 *
 */
@RestController
@RequestMapping("/mentor_information")
public class MentorInformationController extends BaseController<MentorInformation, MentorInformationService> {

    /**
     * 导师信息对象
     */
    @Autowired
    public MentorInformationController(MentorInformationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}

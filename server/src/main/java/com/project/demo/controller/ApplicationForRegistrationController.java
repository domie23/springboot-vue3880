package com.project.demo.controller;

import com.project.demo.entity.ApplicationForRegistration;
import com.project.demo.service.ApplicationForRegistrationService;
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
 * 报名申请：(ApplicationForRegistration)表控制层
 *
 */
@RestController
@RequestMapping("/application_for_registration")
public class ApplicationForRegistrationController extends BaseController<ApplicationForRegistration, ApplicationForRegistrationService> {

    /**
     * 报名申请对象
     */
    @Autowired
    public ApplicationForRegistrationController(ApplicationForRegistrationService service) {
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

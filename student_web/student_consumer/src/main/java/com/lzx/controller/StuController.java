package com.lzx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Controller
@RequestMapping("stu")
public class StuController {
    @Reference
    private IStuService iStuService;



}

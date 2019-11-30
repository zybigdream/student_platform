package com.lzx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.IStuService;
import org.springframework.stereotype.Controller;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Controller
public class StuController {
    @Reference
    private IStuService iStuService;
}

package com.lzx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.ITeaService;
import org.springframework.stereotype.Controller;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Controller
public class TeacherController {
    @Reference
    private ITeaService iTeaService;

}

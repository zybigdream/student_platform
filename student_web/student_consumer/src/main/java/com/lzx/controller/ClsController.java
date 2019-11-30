package com.lzx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.IClsService;
import org.springframework.stereotype.Controller;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Controller
public class ClsController {
    @Reference
    private IClsService iClsService;
}

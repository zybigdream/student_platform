package com.lzx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.Cls;
import com.lzx.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Controller
@RequestMapping("/cls")
public class ClsController {
    @Reference
    private IClsService iClsService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Cls> cls= iClsService.lsit();
        model.addAttribute("cls",cls);
        return "clslist";
    }
    @RequestMapping("/update")
    public String showone(Integer id, Model model){
        Cls cls=  iClsService.selectById(id);
        model.addAttribute("cls",cls);
        return "UpdateClslist";

    }
    @RequestMapping("/update2")
    public String update(Cls cls){
        iClsService.update(cls);
        return "redirect:/cls/list";

    }
    @RequestMapping("/del")
    @ResponseBody
    public int del(Integer id){

        int result=iClsService.delete(id);
        return result;
    }
}

package com.lzx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.Cls;
import com.lzx.IClsService;
import com.lzx.IStuService;
import com.lzx.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Controller
@RequestMapping("/stu")
public class StuController {
    @Reference
    private IStuService stuService;

    @Reference
    private IClsService iClsService;
    
    @RequestMapping("/list")
    public String list(ModelMap map){
        List<Student> studentList = stuService.list(null);
        map.put("studentList", studentList);
        
        
        return "stulist";
    }
    
    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id, ModelMap map){
        stuService.del(id);
        
        return "redirect:/stu/list";
    }
    
    
    @RequestMapping("/toAdd")
    public String toAdd(Model mm){
        List<Cls> clsList=iClsService.lsit();
        mm.addAttribute("clist",clsList);
        return "stu_add";
    }
    
    @RequestMapping("/add")
    public String add(Student student){
        
        stuService.insert(student);
    
        return "redirect:/stu/list";
    }
    
    
    @RequestMapping("/toUpd/{id}")
    public String toUpd(@PathVariable Integer id, ModelMap map){
        Student student = stuService.getById(id);
        map.put("student", student);
        
        return "stu_upd";
    }
    
    @RequestMapping("/upd")
    public String upd(Student student){
        
        stuService.insert(student);
        
        return "redirect:/stu/list";
    }
}

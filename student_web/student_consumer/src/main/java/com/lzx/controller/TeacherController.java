package com.lzx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lzx.ITeaService;
import com.lzx.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * @author zyg
 * @date 2019/11/30
 */
@Controller
@RequestMapping("tec")
public class TeacherController {
    @Reference
    private ITeaService iTeaService;

    @RequestMapping("list")
    public String list(Model mm){
        List<Teacher> list= iTeaService.list();
        mm.addAttribute("teas",list);
        return "teacher";
    }
    @RequestMapping("insert")
    public String insert(){
        return "insertTacher";
    }

    @RequestMapping("tijiao")
    public String tijiao(Teacher teacher){
        iTeaService.insert(teacher);

        return "index";
    }

    @RequestMapping("update")
    public String update(String id,Model mm){
        Teacher teacher=iTeaService.select(id);
        mm.addAttribute("tes",teacher);
        return "UpdateTacher";
    }
    @RequestMapping("tijiaoup")
    public String tijiaoup(Teacher teacher){
        iTeaService.update(teacher);
        return "index";
    }
    @RequestMapping("delete")
    public String delete(int id){
        iTeaService.updateq(id);
        return "index";
    }

}

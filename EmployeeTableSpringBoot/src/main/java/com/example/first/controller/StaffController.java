package com.example.first.controller;

import com.example.first.Staff;
import com.example.first.repository.StaffRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;


@Controller
public class StaffController {
    @Autowired
    StaffRepository staffRepo ;



    @GetMapping("/")
    public String addNewStaffFun(
            Model model
    ){
        model.addAttribute("addNewStaff" , new Staff() );
        return "addNewStaff";
    }

    @GetMapping("/getAllStaff")
    public String getAllStaff(
            Model model
    ){
        model.addAttribute("allStaff" , staffRepo.findAll() );
        return "getAllStaff";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String addStaff(@Valid @RequestBody @ModelAttribute ("addNewStaff") Staff staff, BindingResult result
    ) {
        if (result.hasErrors()) {
            return "addNewStaff";
        }
        staffRepo.save(staff);
        return "redirect:/getAllStaff";
    }

    @RequestMapping(value = "/updated/{id}", method = RequestMethod.GET)
    public String updateStaff(@PathVariable("id") Integer id ,@Valid @RequestBody @ModelAttribute ("newData") Staff staff, BindingResult result
    ) {
        if (result.hasErrors()) {
            return "addNewStaff";
        }
        Staff staff1 = staffRepo.findById(id).get();
        staff1.setName(staff.getName());
        staff1.setPosition(staff.getPosition());
        staff1.setSalary(staff.getSalary());
        staffRepo.save(staff1);
        return "redirect:/getAllStaff";
    }
    @GetMapping("/update/{id}")
    public String updateStaffFun(
            Model model,
            @PathVariable("id") Integer id
    ){
        model.addAttribute("oldStaff" , staffRepo.findById(id).get());
        return "updateForm";
    }

    @RequestMapping(value = "/deleteStaff/{id}", method = RequestMethod.GET)
    public String deleteStaff( @PathVariable("id")  Integer id ){

        Staff staff = staffRepo.findById(id).get();

        staffRepo.delete(staff);
        return "redirect:/getAllStaff";

    }



}








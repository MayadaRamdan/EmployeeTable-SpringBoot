package com.example.first.service;

import com.example.first.Constants;
import com.example.first.Staff;
import com.example.first.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

//@Service
//public class StaffService {
//    @Autowired
//    StaffRepository staffRepository ;
//
//    public List<Staff> getAllStaff(){
//        return staffRepository.findAll();
//    }
//
//    public Staff getStaffByIndex(int index){
//        Optional<Staff> result = staffRepository.findById(index);
//        return result.get();
//    }
//
//    public void addStaff(Staff staff){
//        staffRepository.save(staff);
//    }
//
//    public void updateStaff(Staff staff , int index){
//        Staff staff1 =staffRepository.findById(index).get();
//        staff1.setName(staff.getName());
//        staff1.setPosition(staff.getPosition());
//        staff1.setSalary(staff.getSalary());
//
//       staffRepository.save(staff1);
//    }
//
//
//
//    public int getStaffIndex(int id) {
//        for (int i =0 ; i<getAllStaff().size();i++){
//            if(getStaffByIndex(i).getId()==id)return i;
//        }
//        return  Constants.NO_MATCH;
//    }
//
//    public Staff getStaffById(int id){
//        int index = getStaffIndex(id);
//        return index==Constants.NO_MATCH ? new Staff() :getStaffByIndex(index);
//    }
//
//    public void submitStaff(Staff staff){
//        int index = getStaffIndex(staff.getId());
//        if(index==Constants.NO_MATCH){
//            addStaff(staff);
//        }else {
//            updateStaff(staff, index);
//        }
//    }
//
//}

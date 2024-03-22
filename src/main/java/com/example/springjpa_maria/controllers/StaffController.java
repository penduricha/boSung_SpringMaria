package com.example.springjpa_maria.controllers;

import com.example.springjpa_maria.models.Staff;
import com.example.springjpa_maria.service.impl.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @GetMapping
    public ResponseEntity<List<Staff>> getAllStaffs() {
        List<Staff> staffs = staffService.getListStaff();
        return new ResponseEntity<>(staffs, HttpStatus.OK);
    }

}

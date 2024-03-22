package com.example.springjpa_maria.service.impl;

import com.example.springjpa_maria.models.Staff;
import com.example.springjpa_maria.repositories.StaffRepository;
import com.example.springjpa_maria.service.I_StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements I_StaffService {
    private final StaffRepository staffRepository;
    @Autowired
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    @Override
    public int addStaff(Staff s) {
        return 0;
    }

    @Override
    public List<Staff> getListStaff() {
        List<Staff> listStaff = staffRepository.findAll();
        return listStaff;
    }

    @Override
    public String getString_ListStaff() {
        String s="";
        for(Staff st: getListStaff())
        {
            s+=st.toString()+"\n";
        }
        return s;
    }

}

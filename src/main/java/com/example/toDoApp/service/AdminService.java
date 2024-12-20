package com.example.toDoApp.service;

import com.example.toDoApp.entity.Admin;
import com.example.toDoApp.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Optional<Admin> getAdminByEmail(String email) {
        return Optional.ofNullable(adminRepository.findByEmail(email));
    }

    public void deleteAdmin(Long adminId) {
        adminRepository.deleteById(adminId);
    }
}

package com.controlleur;

import com.model.AdministrateurCom;
import com.model.Panier;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/listeAdmin")
    public List<AdministrateurCom> listAdmin(){
        return  adminService.listAdmin();
    }
    @PostMapping("/ajouterAdmin")
    public List<AdministrateurCom> ajouterAdmin(@RequestBody AdministrateurCom admin){
        try{
            adminService.ajoutAdmin(admin);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listAdmin();
    }

    @DeleteMapping("/deleteAdmin/{id}")
    public List<AdministrateurCom> deleteAdmin(@PathVariable int id){
        try{
            adminService.supprimerAdmin(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  listAdmin();
    }
    @PutMapping("/modifierAdmin/{id}")
    public void updateAdmin(@PathVariable("id") int id, @RequestBody AdministrateurCom admin) {

        try {
            AdministrateurCom adminModify = adminService.getAdmin(id);

            adminModify.setNomAdmin(admin.getNomAdmin());
            adminModify.setMotPasseAdmin(admin.getMotPasseAdmin());

            adminService.ajoutAdmin(adminModify);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

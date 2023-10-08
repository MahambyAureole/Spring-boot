package commerce.service;

import commerce.model.AdministrateurCom;
import commerce.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;
    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void ajoutAdmin(AdministrateurCom adminComm){
            adminRepository.save(adminComm);
    }

    public List<AdministrateurCom> listAdmin(){
       return adminRepository.findAll();
    }

    public void supprimerAdmin(int id){
        adminRepository.deleteById(id);
    }
    public AdministrateurCom getAdmin(int id){
        return adminRepository.findById(id).get();
    }
}

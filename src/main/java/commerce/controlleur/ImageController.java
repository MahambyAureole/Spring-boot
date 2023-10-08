package commerce.controlleur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@RestController
@RequestMapping("/api/images")
public class ImageController {
    @Value("${upload.path}")
    private String uploadPath; // Répertoire de stockage des images

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            // Vérifiez si le répertoire de stockage existe, sinon créez-le
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            // Générez un nom de fichier unique
            String fileName = UUID.randomUUID().toString() + "-" + file.getOriginalFilename();

            // Stockez le fichier dans le répertoire de stockage
            File destination = new File(uploadDir, fileName);
            file.transferTo(destination);

            // Renvoyez l'URL de l'image
            String imageUrl = "/uploads/" + fileName; // L'URL dépend de votre configuration serveur
            return ResponseEntity.ok(imageUrl);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}


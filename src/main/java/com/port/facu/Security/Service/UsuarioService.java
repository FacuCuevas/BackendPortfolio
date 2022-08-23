
package com.port.facu.Security.Service;

import com.port.facu.Security.Entity.Usuario;
import com.port.facu.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
   @Autowired
   iUsuarioRepository iusuarioRepository;
   
   public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
       return iusuarioRepository.findByNombreUsuario(nombreUsuario);
   }
   
   public boolean existByNombreUsuario(String nombreUsuario){
       return iusuarioRepository.existByNombreUsuario(nombreUsuario);
   }
   
   public boolean existByNombreEmail(String email){
       return iusuarioRepository.existByEmail(email);
   } 
   public void save(Usuario usuario){
       iusuarioRepository.save(usuario);
   }
}

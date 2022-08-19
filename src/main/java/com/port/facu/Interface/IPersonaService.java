package com.port.facu.Interface;

import com.port.facu.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista perosna
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto lo buscamos por ID
    public void deletePersona(Long id); 
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}

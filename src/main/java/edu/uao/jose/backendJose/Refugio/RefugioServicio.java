package edu.uao.jose.backendJose.Refugio;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RefugioServicio {

    private final RefugioRepositorio refugioRepo;


    public void createRefugio(Refugios refugios){
        refugioRepo.save(refugios);


    }
    public Refugios buscarPorId(Integer idRefugio) {
        return refugioRepo.findById(idRefugio).orElse(null);
    }

    public void eliminarPorId(Integer idRefugio) {
        refugioRepo.deleteById(idRefugio);
    }

    public void actualizarRefugio(Integer idRefugio, Refugios refugioActualizado) {
        Refugios refugioExistente = refugioRepo.findById(idRefugio).orElse(null);
        if (refugioExistente != null) {
            refugioExistente.setNombreRefugio(refugioActualizado.getNombreRefugio());
            refugioExistente.setIdDueno(refugioActualizado.getIdDueno());
            refugioExistente.setNombreDueno(refugioActualizado.getNombreDueno());
            refugioExistente.setDireccion(refugioActualizado.getDireccion());
            refugioExistente.setPoblacionMax(refugioActualizado.getPoblacionMax());
            refugioRepo.save(refugioExistente);
        }
    }


}

package edu.uao.jose.backendJose.Refugio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/refugios")
@RequiredArgsConstructor
public class RefugioController {

    private final RefugioServicio refugioServicio;



    @PostMapping
    public void createRefugios(@RequestBody Refugios refugios){
        refugioServicio.createRefugio(refugios);

    }

    @GetMapping("/{idRefugio}")
    public Refugios buscarPorId(@PathVariable Integer idRefugio) {
        return refugioServicio.buscarPorId(idRefugio);
    }

    @PutMapping("/{idRefugio}")
    public void actualizarRefugio(@PathVariable Integer idRefugio, @RequestBody Refugios refugioActualizado) {
        refugioServicio.actualizarRefugio(idRefugio, refugioActualizado);
    }

    @DeleteMapping("/{idRefugio}")
    public void eliminarRefugio(@PathVariable Integer idRefugio){
        refugioServicio.eliminarPorId(idRefugio);
    }

}

package edu.uao.jose.backendJose.Refugio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefugioRepositorio extends JpaRepository <Refugios, Integer>{

}

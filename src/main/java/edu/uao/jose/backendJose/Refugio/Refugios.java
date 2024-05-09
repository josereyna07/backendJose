package edu.uao.jose.backendJose.Refugio;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Refugios {
    @Id
    @GeneratedValue
    private Integer idRefugio;
    @Basic
    private String nombreRefugio;
    private Integer idDueno;
    private String nombreDueno;
    private String direccion;
    private Integer poblacionMax;


}

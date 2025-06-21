package com.api.weather.Weather.tempo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity(name = "tempo")
public class Tempo {

    private String descricao;
    private Double temp;
    private Double tempMin;
    private Double tempMax;
    private Double velocidade;
    private Double humidade;

    public Double getHumidade() {
        return humidade;
    }

    public void setHumidade(Double humidade) {
        this.humidade = humidade;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Tempo(Weather weather) {
        double numK = 273;
        this.descricao = weather.dadosDescricao().get(0).description();
        this.temp = weather.dadosTemps().tempNow() - numK;
        this.tempMin = weather.dadosTemps().tempMin() - numK;
        this.tempMax = weather.dadosTemps().tempMax()- numK;
        this.velocidade = weather.dadosVento().velocidade() * 3.6;
        this.humidade = weather.dadosTemps().humidity();
    }

    public Tempo() {

    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Tempo{" +
                "descricao='" + descricao + '\'' +
                ", temp=" + temp +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", velocidade=" + velocidade +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

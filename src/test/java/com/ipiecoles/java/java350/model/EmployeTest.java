package com.ipiecoles.java.java350.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class EmployeTest {

    @Test
    void getNombreAnneeAnciennete_dateEmbaucheNull() {
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(null);
        //When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(0);
    }

    @Test
    void getNombreAnneeAnciennete_dateEmbauchePlus2(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().plusYears(2));
        //When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(0);
    }

    @Test
    void getNombreAnneeAnciennete_dateEmbaucheMoins3(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().minusYears(3));
        //When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(3);
    }

    @Test
    void getNombreAnneeAnciennete_dateEmbaucheAuj(){
        //Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now());
        //When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        //Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(0);
    }
}
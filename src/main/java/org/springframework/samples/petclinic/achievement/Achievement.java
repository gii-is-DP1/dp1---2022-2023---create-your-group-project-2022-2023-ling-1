package org.springframework.samples.petclinic.achievement;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.*;
@Entity
@Getter
@Setter
@Table(name="achievements")
public class Achievement extends BaseEntity{
    
    @NotEmpty
    @Column(name = "name")
    private String name;


    @NotEmpty
    @Column(name = "description")
    private String description;
    


    
    
}

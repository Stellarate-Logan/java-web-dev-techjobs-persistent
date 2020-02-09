package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @Size(min = 1, max = 250, message = "Object must not be more then 250 char")
    @NotBlank(message = "location must not be empty")
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer(String location) {this.location = location;}

    public Employer() {}

    public  String getLocation() {return location;}

    public void setLocation(String location) {
        this.location = location;
    }

}

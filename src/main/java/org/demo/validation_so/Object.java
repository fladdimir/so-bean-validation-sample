package org.demo.validation_so;

import javax.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "object", indexes = { @Index(name = "primary", columnList = "idObject") })

public class Object {

    @Id
    @GeneratedValue
    @Column(name = "idObject")
    private int idObject;

    public int getidObject() {
        {
            return idObject;
        }
    }

    public void SetidObject(int idObject) {

        this.idObject = idObject;
    }

    @Column(name = "NoObject")
    @ObjectValid
    @Size(min = 4, max = 14)
    public String NoObject;

    public String getNoObject() {
        {
            return NoObject;
        }
    }

    public void SetNoObject(String NoObject) {

        this.NoObject = NoObject;
    }

    public Object(String NoObject) {
        this.NoObject = NoObject;
    }

}

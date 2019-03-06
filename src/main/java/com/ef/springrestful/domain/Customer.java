package com.ef.springrestful.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data    // Getter ve Setter metodlar annotation ile oluşturuldu
@Entity  // Database dosyası olduğunu annotation ile belirtildi
public class Customer {

    //Build, Execution, Deployment > Compiler > Annotation Processors

    @Id // Id değeri olduğunu belirtildi
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id değerinin otomatik olması sağlandı
    private Long id;
    private String name;
    private String username;
    private String address;
    private String phone;
    private String email;
    private String company;

}

/* CTRL + ALT + L = Format Document
* Domain:(class)
* Repository:(interface)
* Service: (interface)
* ServiceImpl: (class)
* Boostrap: (Class)
* Controllers: (class)
* */

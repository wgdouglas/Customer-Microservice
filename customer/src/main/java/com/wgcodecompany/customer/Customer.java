package com.wgcodecompany.customer;

//every SubModule already has lombok in it
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer { //this class is the model for our microservice

    @Id
    @SequenceGenerator( // @Id will be based off of this
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}

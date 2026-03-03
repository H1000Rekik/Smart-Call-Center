package tn.esprit.hamza_rekik_arctic10.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ProjectDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long detailsId;

    Double budget;

    String client;

}

package com.squadron.merchantintegration.model;
import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Merchant {

        @NotBlank(message = "Merchant name is required")
        private String name1;

        @Email(message = "Email should be valid")
        private String email1;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String email;
        private boolean active;
}

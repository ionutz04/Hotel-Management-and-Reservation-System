package com.iground.eu.facultate.HMR.model;

import org.springframework.data.annotation.Id;

public record Guest(@Id Long id, String firstName, String lastName, String email, String phone,
                    String preferences) {
}

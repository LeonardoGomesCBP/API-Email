package com.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.models.EmailModel;

public interface emailRepository extends JpaRepository<EmailModel, Long> {

}

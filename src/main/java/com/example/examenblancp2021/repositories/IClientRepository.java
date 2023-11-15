package com.example.examenblancp2021.repositories;

import com.example.examenblancp2021.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientRepository extends CrudRepository<Client,Long> {
}

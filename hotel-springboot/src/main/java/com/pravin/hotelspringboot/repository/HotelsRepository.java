package com.pravin.hotelspringboot.repository;
import com.pravin.hotelspringboot.model.*;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsRepository extends MongoRepository<Hotels, String> {

}

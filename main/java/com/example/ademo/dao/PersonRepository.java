package com.example.ademo.dao;/*
 * Created by ZHANG on 2018/7/21
 */

import com.example.ademo.Person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}

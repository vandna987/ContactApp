package com.monocept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monocept.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}

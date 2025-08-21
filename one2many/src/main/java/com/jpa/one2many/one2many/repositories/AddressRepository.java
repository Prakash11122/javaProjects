package com.jpa.one2many.one2many.repositories;

import com.jpa.one2many.one2many.entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Addresses, Integer> {
}

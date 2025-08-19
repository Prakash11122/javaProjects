package com.jpa.one2one.one2one.repository;

import com.jpa.one2one.one2one.entity.Addresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Addresses,Integer> {
}

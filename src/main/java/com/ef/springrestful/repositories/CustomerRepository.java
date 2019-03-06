package com.ef.springrestful.repositories;

import com.ef.springrestful.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //-> Repository dosyası olduğu annotation ile belirtildi
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

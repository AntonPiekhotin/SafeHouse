package org.safehouse.authservice.repository;

import org.safehouse.authservice.model.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
	Optional<Guest> findByEmail(String email);
	boolean existsByEmail(String email);
	List<Guest> findAll();
}

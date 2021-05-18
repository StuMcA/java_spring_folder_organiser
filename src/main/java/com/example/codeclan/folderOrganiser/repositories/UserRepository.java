package com.example.codeclan.folderOrganiser.repositories;

import com.example.codeclan.folderOrganiser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

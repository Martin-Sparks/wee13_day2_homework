package com.example.codeclan.Filing_System.respositories;

import com.example.codeclan.Filing_System.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}

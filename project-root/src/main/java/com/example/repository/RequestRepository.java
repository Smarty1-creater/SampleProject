// project-root/src/main/java/com/example/repository/RequestRepository.java
package com.example.repository;

import com.example.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    // Define any custom query methods if needed
}

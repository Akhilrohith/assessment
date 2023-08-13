package za.co.investec.assessment.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.co.investec.assessment.model.Client;

@Repository
public interface ClientJpaRepository extends JpaRepository<Client, Long> {
    @Query("select c from Client c where c.firstName = ?1")
    Client searchByFirstName(String firstName);
    
}

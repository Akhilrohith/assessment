package za.co.investec.assessment.respository;

import org.springframework.data.repository.CrudRepository;
import za.co.investec.assessment.model.Client;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
}

package za.co.investec.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.investec.assessment.model.Client;
import za.co.investec.assessment.respository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(client -> clients.add(client));
        return clients;
    }
}

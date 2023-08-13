package za.co.investec.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import za.co.investec.assessment.model.Client;
import za.co.investec.assessment.service.ClientService;

import java.util.List;

@RestController
public class ClientsController {
    @Autowired
    ClientService clientService;

    @GetMapping("/clients")
    private ResponseEntity<List<Client>> getAllClients(){
        return new ResponseEntity<>(clientService.getAllClients(), HttpStatus.OK);
    }

    @GetMapping("/client")
    public ResponseEntity<Client> getClientByParam(@RequestParam String firstName) {
        return new ResponseEntity<>(clientService.getClientByFirstName(firstName), HttpStatus.OK);
    }
}

package za.co.investec.assessment.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String physicalAddress;
    private String idNumber;

    public Client(String firstName, String lastName, String mobileNumber, String physicalAddress, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.physicalAddress = physicalAddress;
        this.idNumber = idNumber;
    }
}

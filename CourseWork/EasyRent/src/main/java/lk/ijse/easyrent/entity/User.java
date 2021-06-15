package lk.ijse.easyrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pazindu Shane
 * @created 14/06/2021 - 7:33 PM
 * @project EasyRent
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    private String nic;
    private String email;
    private String password;
    private String idPhoto;
    private String address;
    private String contact;
}

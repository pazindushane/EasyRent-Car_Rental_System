package lk.ijse.easyrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pazindu Shane
 * @created 14/06/2021 - 7:33 PM
 * @project EasyRent
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String nic;
    private String email;
    private String password;
    private String idPhoto;
    private String address;
    private String contact;
}

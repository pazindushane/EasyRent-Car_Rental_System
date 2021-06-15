package lk.ijse.easyrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

/**
 * @author Pazindu Shane
 * @created 15/06/2021 - 3:11 PM
 * @project EasyRent
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarDTO {

    @Id
    private String registrationNo;
    private String brand;
    private String type;
    private String frontImage;
    private int numberOfPassengers;
    private String transmissionType;
    private String fuelType;
    private String color;
    private double dailyRate;
    private double monthlyRate;
    private int freeMileagePerDay;
    private int freeMileagePerMonth;
    private double pricePerKm;
    private int kmMeterValue;
    private String lastReturnDate;
    private String isAvailable;
    private String isDamaged;
    private String underMaintenance;
}

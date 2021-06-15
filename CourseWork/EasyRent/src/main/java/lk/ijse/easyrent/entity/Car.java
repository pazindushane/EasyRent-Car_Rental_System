package lk.ijse.easyrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pazindu Shane
 * @created 15/06/2021 - 3:16 PM
 * @project EasyRent
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

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

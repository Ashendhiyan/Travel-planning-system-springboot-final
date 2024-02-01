
package com.ipsoft.vehicleservice.repo;

import com.ipsoft.vehicleservice.dto.VehicleDTO;
import com.ipsoft.vehicleservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleREPO extends JpaRepository<Vehicle, String > {
    boolean existsByVehicleRegId(String vehicleRegId);
    List<Vehicle> findAllByVehicleCategory(String category);
    boolean existsByVehicleCategory(String category);
    List<Vehicle> findAllByVehicleCategoryAndVehicleSeatCapacityAndTransmissionTypeAndVehicleFueltype(
            String category,
            int seatCapacity,
            String transmissionType,
            String fuelType
    );
    @Query(value = "SELECT COUNT(*) FROM Vehicle",nativeQuery=true)
    int getCountOfVehicles();

    @Query(value = "SELECT vehicleId FROM Vehicle ORDER BY vehicleId DESC LIMIT 1",nativeQuery = true)
    String getLastIndex();
}

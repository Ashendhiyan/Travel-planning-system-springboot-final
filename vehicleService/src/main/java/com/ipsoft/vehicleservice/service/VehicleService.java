

package com.ipsoft.vehicleservice.service;

import com.ipsoft.vehicleservice.dto.VehicleDTO;
import com.ipsoft.vehicleservice.dto.VehicleGetDTO;

import java.util.List;


public interface VehicleService {
        void saveVehicle(VehicleDTO vehicleDTO);
        VehicleGetDTO getVehicleById(String registrationNumber);

        void updateVehicle(VehicleDTO vehicleDTO);

        void deleteVehicle(String registrationNumber);

        List<VehicleGetDTO> getAllVehicles();
        List<VehicleGetDTO> getAllVehiclesByCategory(String capacity);
        List<VehicleGetDTO> getAllVehiclesByCategorySeatCapacityTransmissionTypeFuelType(
                String category,
                int seatCapacity,
                String transmissionType,
                String fuelType
        );
        int getCountOfVehicles();

        String getLastIndex();
}


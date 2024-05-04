package com.Prasanth.CarRental.repo;

import com.Prasanth.CarRental.model.CreateRentalVehical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateRentalVehicalRepo extends JpaRepository<CreateRentalVehical, Long> {

}

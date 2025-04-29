// VehicleJpaRepository.java
public interface VehicleJpaRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByVehicleTypeId(Long typeId);
}

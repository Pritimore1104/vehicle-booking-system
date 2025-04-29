// VehicleTypeJpaRepository.java
public interface VehicleTypeJpaRepository extends JpaRepository<VehicleType, Long> {
    List<VehicleType> findByWheels(int wheels);
}

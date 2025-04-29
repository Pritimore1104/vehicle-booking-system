// BookingJpaRepository.java
public interface BookingJpaRepository extends JpaRepository<Booking, Long> {
    boolean existsByVehicleAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
        Vehicle vehicle, LocalDate endDate, LocalDate startDate
    );
}

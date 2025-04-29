@SpringBootApplication
public class BookingSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookingSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner run(VehicleTypeJpaRepository typeRepo, VehicleJpaRepository vehicleRepo) {
        return args -> {
            VehicleType suv = typeRepo.save(new VehicleType("SUV", 4));
            VehicleType sedan = typeRepo.save(new VehicleType("Sedan", 4));
            VehicleType cruiser = typeRepo.save(new VehicleType("Cruiser", 2));

            vehicleRepo.save(new Vehicle("XUV700", true, suv));
            vehicleRepo.save(new Vehicle("City", true, sedan));
            vehicleRepo.save(new Vehicle("Royal Enfield", true, cruiser));
        };
    }
}

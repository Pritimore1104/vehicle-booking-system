DROP TABLE IF EXISTS booking;
DROP TABLE IF EXISTS vehicle;
DROP TABLE IF EXISTS vehicle_type;

CREATE TABLE vehicle_type (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    wheels INT NOT NULL
);

CREATE TABLE vehicle (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    available BOOLEAN NOT NULL,
    vehicle_type_id BIGINT,
    CONSTRAINT fk_vehicle_type FOREIGN KEY (vehicle_type_id) REFERENCES vehicle_type(id)
);

CREATE TABLE booking (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    start_date DATE,
    end_date DATE,
    vehicle_id BIGINT,
    CONSTRAINT fk_vehicle FOREIGN KEY (vehicle_id) REFERENCES vehicle(id)
);

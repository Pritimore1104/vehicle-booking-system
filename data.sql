-- Vehicle Types
INSERT INTO vehicle_type (name, wheels) VALUES ('Hatchback', 4);
INSERT INTO vehicle_type (name, wheels) VALUES ('SUV', 4);
INSERT INTO vehicle_type (name, wheels) VALUES ('Sedan', 4);
INSERT INTO vehicle_type (name, wheels) VALUES ('Cruiser', 2);

-- Vehicles
INSERT INTO vehicle (name, available, vehicle_type_id) VALUES ('i20', true, 1);
INSERT INTO vehicle (name, available, vehicle_type_id) VALUES ('XUV700', true, 2);
INSERT INTO vehicle (name, available, vehicle_type_id) VALUES ('City', true, 3);
INSERT INTO vehicle (name, available, vehicle_type_id) VALUES ('Royal Enfield', true, 4);

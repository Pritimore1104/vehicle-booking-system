import axios from 'axios';

const API = axios.create({ baseURL: 'http://localhost:8080/api' });

export const getVehicleTypes = (wheels) => API.get(`/vehicle-types?wheels=${wheels}`);
export const getVehicles = (typeId) => API.get(`/vehicles?typeId=${typeId}`);
export const bookVehicle = (data) => API.post('/bookings', data);

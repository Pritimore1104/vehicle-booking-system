import React, { createContext, useState, useContext } from 'react';

const FormContext = createContext();
export const useForm = () => useContext(FormContext);

export const FormProvider = ({ children }) => {
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    wheels: null,
    vehicleTypeId: null,
    vehicleId: null,
    startDate: null,
    endDate: null,
  });

  return (
    <FormContext.Provider value={{ formData, setFormData }}>
      {children}
    </FormContext.Provider>
  );
};

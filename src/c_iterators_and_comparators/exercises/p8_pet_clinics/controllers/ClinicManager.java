package c_iterators_and_comparators.exercises.p8_pet_clinics.controllers;

import c_iterators_and_comparators.exercises.p8_pet_clinics.models.Clinic;
import c_iterators_and_comparators.exercises.p8_pet_clinics.models.Pet;

import java.util.HashMap;
import java.util.Map;

public class ClinicManager implements IClinicManager{

    private Map<String, Pet> pets;
    private Map<String, Clinic> clinics;

    public ClinicManager() {
        this.pets = new HashMap<>();
        this.clinics = new HashMap<>();
    }

    @Override
    public void createPet(String name, int age, String type) {
        Pet pet = new Pet(name, age, type);
        this.pets.put(pet.getName(), pet);
    }

    @Override
    public void createClinic(String name, int rooms) {
        try{
            Clinic clinic = new Clinic(name,rooms);
            this.clinics.put(clinic.getName(), clinic);
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    @Override
    public boolean add(String petName, String clinicName) {
        Pet pet = this.pets.get(petName);
        Clinic clinic = this.clinics.get(clinicName);
        if(pet == null || clinic == null){
            //todo
            System.out.println("Invalid Operation!");
            return false;
        }
        return clinic.add(pet);
    }

    @Override
    public boolean release(String clinicName) {
        Clinic clinic = this.clinics.get(clinicName);
        return clinic.releasePet();
    }

    @Override
    public boolean hasEmptyRooms(String name) {
        Clinic clinic = this.clinics.get(name);
        return clinic.hasEmptyRooms();
    }

    @Override
    public String print(String clinicName) {
        return this.clinics.get(clinicName).toString();
    }

    @Override
    public String print(String clinicName, int room) {
        return this.clinics.get(clinicName).getRoom(room - 1).toString();
    }
}

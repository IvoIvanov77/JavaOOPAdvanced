package c_iterators_and_comparators.exercises.p8_pet_clinics.controllers;

public interface IClinicManager {

    void createPet(String name, int sge, String type);
    void createClinic(String name, int rooms);
    boolean add(String petName, String clinicName);
    boolean release(String clinicName);
    boolean hasEmptyRooms(String name);
    String print(String clinicName);
    String print(String clinicName, int room);

//    Release {clinic's name}
//        HasEmptyRooms {clinic’s name}
//        Print {clinic's name}
//            Print {clinic's name} {room}

}

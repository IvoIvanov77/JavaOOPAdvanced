package c_iterators_and_comparators.exercises.p8_pet_clinics.models;

import c_iterators_and_comparators.exercises.p8_pet_clinics.iterators.AccommodationIterator;
import c_iterators_and_comparators.exercises.p8_pet_clinics.iterators.ReleaseIterator;

import java.util.Iterator;

public class Clinic implements Iterable<Room>{

    private String name;
    private Room[] rooms;
    private boolean isReleaseIterator;
    private String iteratorType;

    public Clinic(String name, int roomsCount) {
        this.setName(name);
        this.setRooms(roomsCount);
        this.isReleaseIterator = false;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }


    private void setRooms(int roomsCount) {
        if(roomsCount % 2 == 0){
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.rooms = new Room[roomsCount];
        for (int i = 0; i < roomsCount; i++) {
            rooms[i] = new Room();
        }
    }

    @Override
    public Iterator<Room> iterator() {
        if(isReleaseIterator){
            return new ReleaseIterator<>(this.rooms);
        }
        return new AccommodationIterator<>( this.rooms);

    }

    public boolean add(Pet pet){
        this.isReleaseIterator = false;
        for (Room room : this) {
            if(room.addPet(pet)){
                return true;
            }
        }
        return false;
    }

    public boolean releasePet(){
        this.isReleaseIterator = true;
        for (Room room : this) {
            if(room.release()){
                return true;
            }
        }
        return false;
    }

    public boolean hasEmptyRooms(){
        for (Room room : rooms) {
            if(room.isEmpty()){
                return true;
            }
        }
        return false;
    }

    public Room getRoom(int index){
        return this.rooms[index];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(this.rooms[0].toString());
        for (int i = 1; i < this.rooms.length; i++) {
            builder.append("\n").append(this.rooms[i].toString());
        }
        return builder.toString();
    }
}

package c_iterators_and_comparators.exercises.p8_pet_clinics.models;

public class Room {

    private Pet pet;

    public boolean addPet(Pet pet){
        if(this.pet != null){
            return false;
        }
        this.pet = pet;
        return true;
    }

    public Pet getPet() {
        return pet;
    }

    public boolean release(){
        if(this.isEmpty()){
            return false;
        }
        this.pet = null;
        return true;
    }

    public boolean isEmpty(){
        return this.pet == null;
    }

    @Override
    public String toString() {
        if(this.isEmpty()){
            return "Room empty";
        }
        return this.pet.toString();
    }
}

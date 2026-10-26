package edu.frederick.cmsc131;
import java.util.UUID;

public class Patient {


    private UUID patientId;


// this creates a random UUID and assigns it up top

    public Patient(){
        this.patientId = UUID.randomUUID();
    }

    public UUID getPatientId(){
        return UUID.fromString(patientId.toString());
        //this turns the id into a string so the orginal stays the same 


    }


    public String toString(){

        return patientId.toString();

        //this is for debugging the code
    }

}








































    


//patient pat = new patient() arguements in here
//device[]
//0public static patient malepatient(severity) 
//return new patient(sevirtiy,id);
//factory makes objects (for example making an object thats a patient with a case of food posioning)
// the patient class is in charge of ids and where they come from 
// slash your mind slash your foes slash your friends slash everyone HATE ALL SLASH SLASH SLASH SLASH ASHASL SHLASH SHLASH SLASH SLASH SLAH SHAL SHALSD SHALLGHALSHLDHSSHLDA SHLASHDAKLSHLADHSLSHASLDSAHDL
// CLASS PAITENT 
//private int id; 
//public int get id(){return id;}
//Ro *m +q then wrap around which equals to r1 thats how computers generate numbers 
//next double 
//nextInt(max)
//uniform random number 
//random rng = new random(); you can pass a number inside of it which is the "seed"
// public static random(rng)
//public static setrandom()

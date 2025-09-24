package se.jensen.elias.dicegame;

public class Player { //Klass som används för att skapa Player objekt
    private String firstName;
    private String lastName;
    private int score;

    public Player() { //sätter startvärdet på score till 0
        this.score = 0;
    }

    public String getFirstName() {//getter för att hämta första namn

        return firstName;
    }
    //Setter som kollar om Stringen är tom. Om dne är tom kastas en exemption
    public void setFirstName(String firstName) {
        /*
        if sats som körs om den mottagna stringen är tom
        trim()tar bort mellanslag och isEmpty() kollar om strängen är tom
        null kollar om det ens finns en string över huvud taget
        */
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Firstname cannot be empty");
        }
        this.firstName = firstName;//om inga fel hittas så sparas strängen
    }
    //Samma som ovan fast för efternamn
    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("LastName cannot be empty");
        }
        this.lastName = lastName;
    }
    //getter till score för att hämta värdet
    public int getScore() {

        return score;
    }
    //setter metod som sparar värdet av de två tärningarna
    public void setScore(int score) {

        this.score += score;
    }
    //returnerar fulla namnet med ett mellanrum
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

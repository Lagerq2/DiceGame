package se.jensen.elias.dicegame;

public class Player {
    private String firstName;
    private String lastName;
    private int score;

    public Player() {
        this.score = 0;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void addScore(int score) {
        this.score += score;
    }
    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }
}

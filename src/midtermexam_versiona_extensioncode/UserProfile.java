/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */


public class UserProfile 
{
    public enum Genres{Comedy,Drama,Action,Mystery};
    private String userID;//the userID
    private Genres genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public UserProfile(Genres genres, String givenID, String givenGenre)
    {
        userID = givenID;
        Genres genre;
        
        
    }
    
    public UserProfile()
    {
        
    }

      public UserProfile(Genres genres) {
       this.genre = genre;
    }
        
    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public Genres getGenre() {
        return this.genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(Genres genres) {
        this.genre = genre;
    }
    
   
    
    
    
    
    
}//end class

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.com;

/**
 *
 * @author knafi
 */
public class textBook {
    private String title;
    private String author;
    private String publisher;
    
    public textBook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    // Copy Constructor
    public textBook(textBook txtbk){
        this.title = txtbk.title;
        this.author = txtbk.author;
        this.publisher = txtbk.publisher;
    }
    
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getPublisher(){
        return this.publisher;
    }
}

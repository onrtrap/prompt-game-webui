package proj.promptgame.prompthandler.model;

import jakarta.persistence.*;

/**
 * JPA Entity Bean which represents the data in the prompts table in the database.
 * Lombok implements getters, setters
 * and NoArgs and AllArgs constructors for us.
 */
@Entity
//@Data
@Table(name = "prompts")
public class Prompt {
    //optional = false in Basic necessitates that all columns are necessary to save to the database


    //Id automatically added in database; used for sorting
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //Prompt topic, i.e "Sports", "Gaming", etc.

    @Column(name = "topic")
    private String topic;

    //Prompt activity, i.e "Question", "Truth", "Dare", etc. Used for in-game sorting.
    @Column(name = "activity")
    private String activity;

    //Measure of how personal or discomforting a prompt could potentially be.  1-10. Used for in-game sorting.
    @Column(name = "intensity")
    private int intensity;


    //The text of the prompt. Used solely in game.
    @Column(name = "text")
    private String text;

    public Prompt(){

    }
    public Prompt(long id, String topic, String activity, int intensity, String text) {
        this.id = id;
        this.topic = topic;
        this.activity = activity;
        this.intensity = intensity;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

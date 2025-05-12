package proj.promptgame.prompthandler.model;

import jakarta.persistence.*;
import lombok.*;

//@Data
public class PromptDto {

    private Long id;

    //Prompt topic, i.e "Sports", "Gaming", etc.


    private String topic;

    //Prompt activity, i.e "Question", "Truth", "Dare", etc. Used for in-game sorting.

    private String activity;

    //Measure of how personal or discomforting a prompt could potentially be.  1-10. Used for in-game sorting.

    private int intensity;


    //The text of the prompt. Used solely in game.

    private String text;


    public PromptDto(long id, String topic, String activity, int intensity, String text) {
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

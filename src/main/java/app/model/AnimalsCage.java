package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Qualifier("dog")
    @Autowired
    private Animal animal;

    @Autowired
    private Timer timer;

    @Bean
    public Timer timer() {
        return new Timer();
    }
    public Timer getTimer() {
        return timer;
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }


}

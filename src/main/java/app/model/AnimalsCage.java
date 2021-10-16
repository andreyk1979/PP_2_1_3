package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    /*    private final Timer timer;
        private final Animal animal;

        @Autowired
        public AnimalsCage(@Qualifier("dog") Animal animal, @Qualifier("timer")Timer timer) {
            this.timer = timer;
            this.animal = animal;*/
    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    @Qualifier("timer")
    private Timer timer;



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }

}

package dnr2i.models.entity;

public class DogEntity extends TimeEntity {

    private enum DogEvent {

        COUCHE("Dog is sleeping"),
        LEVE("Dog is standing up"),
        ABBOIE("Dog : wouf!"),
        MANGE("Dog is eating..."),
        JOUE("Dog is playing with a bone"),
        FAIT_LE_BEAU("good dog ! good dog !");

        private String dogActionPossible;

        DogEvent(String dogActionPossible) {
            this.dogActionPossible = dogActionPossible;
        }

        public String getDogActionPossible() {
            return dogActionPossible;
        }
    }

    public DogEntity() {

        createEvent();

    }

    @Override
    public void createEvent() {

    }

}

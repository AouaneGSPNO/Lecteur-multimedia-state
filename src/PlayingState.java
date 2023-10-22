public class PlayingState implements State {
    @Override
    public void play() {
        System.out.println("Lecture déjà en cours");
    }

    @Override
    public void pause() {
        System.out.println("Lecture en pause");
    }

    @Override
    public void stop() {
        System.out.println("Lecture arrêtée");
    }

    @Override
    public void lock() {
        System.out.println("Lecteur verrouillé pendant la lecture");
    }

    @Override
    public void unlock() {
        System.out.println("Lecteur déverrouillé pendant la lecture");
    }
}
public class ReadyState implements State {
    @Override
    public void play() {
        System.out.println("Lecture en cours");
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
        System.out.println("Lecteur verrouillé");
    }

    @Override
    public void unlock() {
        System.out.println("Lecteur déjà déverrouillé");
    }
}
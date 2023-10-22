class LockedState implements State {
    @Override
    public void play() {
        System.out.println("Verrouillé, impossible de lire");
    }

    @Override
    public void pause() {
        System.out.println("verrouillé, impossible de mettre en pause");
    }

    @Override
    public void stop() {
        System.out.println("Verrouillé, impossible d'arrêter");
    }

    @Override
    public void lock() {
        System.out.println("Lecteur déjà verrouillé");
    }

    @Override
    public void unlock() {
        System.out.println("Lecteur déverrouillé");
    }
}
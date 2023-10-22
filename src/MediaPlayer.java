public class MediaPlayer {
    private State state;

    public MediaPlayer() {
        state = new ReadyState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play();
    }

    public void pause() {
        state.pause();
    }

    public void stop() {
        state.stop();
    }

    public void lock() {
        state.lock();
    }

    public void unlock() {
        state.unlock();
    }
}
public interface State {
    void play();
    void pause();
    void stop();
    void lock();
    void unlock();
}

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        System.out.println("************ ETATS DU LECTEUR ***************");
        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.stop();
        mediaPlayer.lock();
        mediaPlayer.unlock();
        mediaPlayer.play();
        mediaPlayer.lock();
    }
}

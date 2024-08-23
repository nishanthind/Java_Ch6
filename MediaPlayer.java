// Program in Java to implement multiple inheritance using interfaces.
interface Audio {
  void play();
}
interface Video {
  void play(int starttime);
}
class MediaPlayer implements Audio, Video {
  public void play() {
    System.out.println("Playing audio...");
  }
  public void play(int starttime) {
    System.out.println("Playing video from time " + starttime + "...");
  }
  public static void main(String[] args) {
    MediaPlayer mediaPlayer = new MediaPlayer();
    mediaPlayer.play(); // Playing audio...
    mediaPlayer.play(10); // Playing video from time 10...
  }
}


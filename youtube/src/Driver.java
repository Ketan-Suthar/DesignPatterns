public class Driver {
    public static void main(String[] args) {
        IYouTubeLib youTubeLib = new CachedYouTubeLib(new YouTubeLib());
        youTubeLib.listVideos();
        var video = youTubeLib.downloadVideo("yt1");
        System.out.println("Downloaded video: " + video);
        video = youTubeLib.downloadVideo("yt1");
        System.out.println("Downloaded video: " + video);
        video = youTubeLib.downloadVideo("yt1");
        System.out.println("Downloaded video: " + video);
    }
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YouTubeLib implements IYouTubeLib {

    private static Map<String, String> videos = null;

    public YouTubeLib() {
        videos = new HashMap<>();
        videos.put("yt1", "Video 1");
        videos.put("yt2", "Video 2");
        videos.put("yt3", "Video 3");
    }

    @Override
    public void listVideos() {
        for(final var video: videos.keySet()) {
            System.out.println("Video id: " + video + ", title: " + videos.get(video));
        }
    }

    @Override
    public String downloadVideo(final String id) {
        System.out.println("Downloading video with id: " + id);
        if(videos.containsKey(id)) {
            return videos.get(id);
        }
        return null;
    }
}

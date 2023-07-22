import java.util.HashMap;
import java.util.Map;

public class CachedYouTubeLib implements IYouTubeLib {
    private static Map<String, String> cachedVideos;

    private final IYouTubeLib youTubeLib;

    public CachedYouTubeLib(final IYouTubeLib youTubeLib) {
        this.youTubeLib = youTubeLib;
        cachedVideos = new HashMap<>();
    }

    @Override
    public void listVideos() {
        youTubeLib.listVideos();
    }

    @Override
    public String downloadVideo(final String id) {
        if(!cachedVideos.containsKey(id)){
            cachedVideos.put(id, youTubeLib.downloadVideo(id));
        }
        return cachedVideos.get(id);
    }
}

package mediaLibrary;

class AudioPlayer implements PlayableMedia, MediaInfo, MediaLoader {
    // Implementation skipped for brevity
    public void play() { /* Play audio */ }
    public void display() { /* Empty or exception-throwing method - not applicable for audio */ }
    public void printInfo() { /* Print audio file info */ }
    public void loadMedia(String filename) { /* Load audio file */ }
}

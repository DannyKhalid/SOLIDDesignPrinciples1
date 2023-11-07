package mediaLibrary;

class ImageViewer implements DisplayableMedia, MediaInfo, MediaLoader{
    // Implementation skipped for brevity
    public void play() { /* Empty or exception-throwing method - not applicable for images */ }
    public void display() { /* Display image */ }
    public void printInfo() { /* Print image file info */ }
    public void loadMedia(String filename) { /* Load image file */ }
}
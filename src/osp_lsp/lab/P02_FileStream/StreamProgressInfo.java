package osp_lsp.lab.P02_FileStream;

public class StreamProgressInfo {
    private Streamable streamable;

    // If we want to stream a music file, we can't
    public StreamProgressInfo(Streamable file) {
        this.streamable = file;
    }

    public int calculateCurrentPercent() {
        return (this.streamable.getBytesSent() * 100) / this.streamable.getLength();
    }
}

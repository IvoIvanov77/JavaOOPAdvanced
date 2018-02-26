package osp_lsp.exercises.models.files;

import osp_lsp.exercises.contracts.File;

public class LogFile implements File {

    private StringBuilder builder;
    private int size;

    public LogFile() {
        this.builder = new StringBuilder();
        this.size = 0;
    }

    @Override
    public void write(String message) {
        builder.append(message);
    }

    @Override
    public int getSize() {
        return this.builder.toString().replaceAll("[^a-zA-Z]", "").chars().sum();
    }
}

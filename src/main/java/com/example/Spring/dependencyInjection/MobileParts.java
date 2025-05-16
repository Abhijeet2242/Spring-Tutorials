package com.example.Spring.dependencyInjection;

public class MobileParts {
    private String Camera;
    private boolean isSterio;
    private String processor;

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setSterio(boolean sterio) {
        isSterio = sterio;
    }

    public boolean getSterio() {
        return isSterio;
    }
}

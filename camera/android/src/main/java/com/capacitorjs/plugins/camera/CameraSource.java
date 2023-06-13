package com.capacitorjs.plugins.camera;

public enum CameraSource {
    PROMPT("PROMPT"),
    CAMERA("CAMERA"),
    PHOTOS("PHOTOS"),
    VIDEOCAMERA("VIDEOCAMERA");

    private String source;

    CameraSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }
}

package Chapter_08.detector;

import Chapter_08.camera.SppedCam;
import Chapter_08.camera.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SppedCam sppedCam = new SppedCam();
        sppedCam.setDetector(new AccidentDetector());
        sppedCam.setReporter(new VideoReporter());
        sppedCam.detect();
        sppedCam.report();
    }
}

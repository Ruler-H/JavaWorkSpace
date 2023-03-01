package Chapter_08.camera;

import Chapter_08.camera.reporter.Reportable;
import Chapter_08.detector.Detectable;

public class SppedCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void detect() {
        detector.detect();
    }

    public void report() {
        reporter.report();
    }
}

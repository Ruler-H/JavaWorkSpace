package Chapter_08;

import Chapter_08.camera.FactoryCam;
import Chapter_08.camera.reporter.NormalReporter;
import Chapter_08.camera.reporter.Reportable;
import Chapter_08.camera.reporter.VideoReporter;
import Chapter_08.detector.AdvancedFireDetector;
import Chapter_08.detector.Detectable;
import Chapter_08.detector.FireDetector;

public class _02_Interface {
    public static void main(String[] args) {
        // 상속은 단일만 가능 (extends)

        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}

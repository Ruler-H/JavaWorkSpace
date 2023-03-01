package Chapter_07;

import Chapter_07.camera.FactoryCam;
import Chapter_07.camera.SpeedCamera;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        FactoryCam factoryCam = new FactoryCam();
        SpeedCamera speedCamera = new SpeedCamera();

        factoryCam.recordVideo();
        System.out.println("-------------------");
        speedCamera.takePicture();
    }
}

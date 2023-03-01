package Chapter_07;

import Chapter_07.camera.Camera;
import Chapter_07.camera.FactoryCam;
import Chapter_07.camera.SpeedCamera;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCamera speedCamera = new SpeedCamera();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCamera.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCamera.takePicture();

        factoryCam.detectFire();
        speedCamera.checkSpeed();
        speedCamera.recognizeLicensePlate();
    }
}

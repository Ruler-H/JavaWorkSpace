package Chapter_07;

import Chapter_07.camera.Camera;
import Chapter_07.camera.FactoryCam;
import Chapter_07.camera.SpeedCamera;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다.)
        // class Teacher extends Person : 선생님 (선생님은 사람이다.)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCamera();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCamera();

        for (Camera camera1 : cameras) {
            camera1.showMainFeature();
        }

        System.out.println("-----------------");
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recorgnizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCamera) {
            ((SpeedCamera) speedCam).checkSpeed();
            ((SpeedCamera) speedCam).recognizeLicensePlate();
        }

//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new SpeedCamera();
//        objs[2] = new FactoryCam();
    }
}

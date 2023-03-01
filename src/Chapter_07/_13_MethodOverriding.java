package Chapter_07;

import Chapter_07.camera.Camera;
import Chapter_07.camera.FactoryCam;
import Chapter_07.camera.SpeedCamera;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCamera speedCamera = new SpeedCamera();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCamera.showMainFeature();
    }
}

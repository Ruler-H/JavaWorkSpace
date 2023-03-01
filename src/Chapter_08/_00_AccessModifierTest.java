package Chapter_08;

import Chapter_07.*;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolution = // default
        // b1.price = // private
        // b1.color = "블랙"; // protected

        BlackBox b2 = new BlackBox();
    }
}

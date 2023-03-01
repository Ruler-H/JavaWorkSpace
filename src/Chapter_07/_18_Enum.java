package Chapter_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN, FEB, MAR, ...
        // 옷 사이즈 : S, M, L, XL, ...
        // OS 종류 : WIN10, WIN11, MACOS, LINUX, ...
        // 해상도 : HD, FHD, QHD, UHD, ...

        Resoultion resoultion = Resoultion.HD;
        System.out.println("resoultion = " + resoultion);

        resoultion = resoultion.FHD;
        System.out.println("resoultion = " + resoultion);

        System.out.print("동영상 녹화 품질 : ");
        switch (resoultion) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resoultion = Resoultion.valueOf("UHD");
        System.out.println("resoultion = " + resoultion);

        for (Resoultion value : Resoultion.values()) {
            System.out.println("value = " + value + " : " + value.ordinal());
        }

        System.out.println("------------------");

        for (Resoultion value : Resoultion.values()) {
            System.out.println("value = " + value.name() + " : " + value.getWidth());
        }
    }
}

enum Resoultion {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resoultion(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

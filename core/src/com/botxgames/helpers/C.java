package com.botxgames.helpers;

public class C {

    private static final int PPM = 10;

    public static float ppm(float value_in_meters) {
        return value_in_meters * PPM;
    }

    public static float mpp(float value_in_pixels) {
        return value_in_pixels / PPM;
    }

    public static float percentOf(float percentage, float amount) {
        return (amount * percentage) / 100f;
    }

    public static class Assets {
        public static final String SPLASH_IMG = "splash.png";
    }

}

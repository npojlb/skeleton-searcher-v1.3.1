package dev.yym.skeletonsearcher;

public enum SphereBand {
    R250_150(150, 250, "250–150", 0xFF9A9A),
    R150_100(100, 150, "150–100", 0x2547C7),
    R100_50(50, 100, "100–50", 0xFFE45C),
    R50_25(25, 50, "50–25", 0x55FF55),
    R50_0(0, 50, "50–0", 0x55CCFF);

    private final int innerRadius;
    private final int outerRadius;
    private final String label;
    private final int textColor;

    SphereBand(int innerRadius, int outerRadius, String label, int textColor) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.label = label;
        this.textColor = textColor;
    }

    public int innerRadius() {
        return innerRadius;
    }

    public int outerRadius() {
        return outerRadius;
    }

    public String label() {
        return label;
    }

    public int textColor() {
        return textColor;
    }

    public static SphereBand fromRadii(int inner, int outer) {
        for (SphereBand band : values()) {
            if (band.innerRadius == inner && band.outerRadius == outer) {
                return band;
            }
        }
        return null;
    }
}

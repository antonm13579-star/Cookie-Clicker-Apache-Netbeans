/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mike4
 */
public class Prestige {

    public long prestigepoints = 0;
    public long prestigerequirement = 1_000_000;
    public double prestigemultiplier = 1.0;

    private final double basecost = 1_000_000;
    private final double multiplier = 1.75;

    public boolean canPrestige(long clickcount) {
        return clickcount >= prestigerequirement;
    }

    public void applyPrestige() {
        prestigepoints++;
        prestigerequirement = (long)(basecost * Math.pow(multiplier, prestigepoints));
        prestigerequirement += 1_000_000;
        prestigemultiplier = 1.0 + (prestigepoints * 0.5);
    }
}


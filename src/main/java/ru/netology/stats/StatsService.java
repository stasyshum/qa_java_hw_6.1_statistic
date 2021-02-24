package ru.netology.stats;

public class StatsService {

    private int[] statistic;

    public void setStatistics(int[] statistic) {
        this.statistic = statistic;
    }

    public void clearStatistics() {
        statistic = null;
    }

    public long getSummary() {
        if (statistic != null) {
            long sum = 0;
            for (int s : statistic) {
                sum += s;
            }
            return sum;
        } else {
            return 0;
        }
    }

    public double getMean() {
        if (statistic != null) {
            return getSummary() / statistic.length;
        } else {
            return 0;
        }
    }

    public int getHightMonthSale() {
        if (statistic != null) {
            int max = statistic[0];
            int mounth = 0;
            for (int i = 0; i < statistic.length; i++) {
                int current = statistic[i];
                if (current >= max) {
                    max = current;
                    mounth = i;
                }
            }
            return mounth;
        } else {
            return 0;
        }
    }

    public int getMinimalMonthSale() {
        if (statistic != null) {
            int min = statistic[0];
            int mounth = 0;
            for (int i = 0; i < statistic.length; i++) {
                int current = statistic[i];
                if (current <= min) {
                    min = current;
                    mounth = i;
                }
            }
            return mounth;
        } else {
            return 0;
        }
    }

    public int getUnderMeanSale() {
        if (statistic != null) {

            int undermeanmounth = 0;
            for (int i = 0; i < statistic.length; i++) {
                int current = statistic[i];
                if (current < getMean()) {
                    undermeanmounth++;
                }
            }
            return undermeanmounth;
        } else {
            return 0;
        }
    }

    public int getOverMeanSale() {
        if (statistic != null) {

            int overmeanmounth = 0;
            for (int i = 0; i < statistic.length; i++) {
                int current = statistic[i];
                if (current > getMean()) {
                    overmeanmounth++;
                }
            }
            return overmeanmounth;
        } else {
            return 0;
        }
    }
}

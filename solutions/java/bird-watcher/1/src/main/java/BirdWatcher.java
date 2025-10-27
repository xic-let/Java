
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsPerDay = {0, 2, 5, 3, 7, 8, 4};
            return birdsPerDay;
    }

    public int getToday() {
        int weekCount = birdsPerDay.length;
        int dayCount = birdsPerDay[weekCount - 1];
        return dayCount;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds: birdsPerDay){
            if (birds == 0){
                return true;
            }    
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            total += birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds: birdsPerDay){
            if (birds >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}

public class Lasagna {
    public int expectedMinutesInOven(){
        int totalMinutes = 40;
        return totalMinutes;
    }
    public int remainingMinutesInOven(int actualMinutesCooking){
        int expectedCookingTime = expectedMinutesInOven();
        return (expectedCookingTime - actualMinutesCooking);
        
    }
    public int preparationTimeInMinutes(int numberLayers) {
        int totalTime;
        totalTime = (numberLayers*2);
        return totalTime;
    }
    public int totalTimeInMinutes(int numberLayers, int totalMinutes){
        int preparationTime = preparationTimeInMinutes(numberLayers);
        int timeInOven = totalMinutes;
        int totalCookingTime = (preparationTime + timeInOven);
        return totalCookingTime;
    }
}
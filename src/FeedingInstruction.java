public class FeedingInstruction {
    private String foodType;
    private String feedingSchedule;
    private String quantity;

    public FeedingInstruction(String foodType, String feedingSchedule, String quantity) {
        this.foodType = foodType;
        this.feedingSchedule = feedingSchedule;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getFoodType() { return foodType; }
    public void setFoodType(String foodType) { this.foodType = foodType; }

    public String getFeedingSchedule() { return feedingSchedule; }
    public void setFeedingSchedule(String feedingSchedule) { this.feedingSchedule = feedingSchedule; }

    public String getQuantity() { return quantity; }
    public void setQuantity(String quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "FeedingInstruction{" +
                "foodType='" + foodType + '\'' +
                ", feedingSchedule='" + feedingSchedule + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

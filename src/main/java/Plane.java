public enum Plane {

    BOEING747(6, 1200.00),
    AIRBUS130(4, 800.00);

    private int capacity;
    private double totalWeight;

    Plane(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}

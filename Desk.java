class Desk implements Furniture {
    private String name;
    private double weight;
    private double volume;
    
    public Desk(String name, double weight, double volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }
    
    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getWeight() {
        return weight;
    }
    
    @Override
    public double getVolume() {
        return volume;
    }
}
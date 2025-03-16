class Cabinet implements Furniture {
    private String name;
    private double weight;
    private double volume;
    private boolean isAssembled;
    
    public Cabinet(String name, double weight, double volume, boolean isAssembled) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.isAssembled = isAssembled;
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
    
    public boolean isAssembled() {
        return isAssembled;
    }
}
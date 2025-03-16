class Bookshelf implements Furniture {
    private String name;
    private double weight;
    private double volume;
    private String material;
    
    public Bookshelf(String name, double weight, double volume, String material) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.material = material;
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
    
    public String getMaterial() {
        return material;
    }
}
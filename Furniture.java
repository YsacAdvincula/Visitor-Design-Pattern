interface Furniture {
    void accept(ShippingCostVisitor visitor);
    String getName();
    double getWeight();
    double getVolume();
}
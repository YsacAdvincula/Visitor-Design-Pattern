class DistanceBasedShippingVisitor implements ShippingCostVisitor {
    private double totalCost = 0;
    private double distance;
    
    public DistanceBasedShippingVisitor(double distance) {
        this.distance = distance;
    }
    
    @Override
    public void visit(Desk desk) {
        double cost = 10.0 + (desk.getWeight() * 0.4) + (distance * 0.05);
        totalCost += cost;
        System.out.println("Distance-based shipping cost for " + desk.getName() + " (" + distance + " miles): $" + String.format("%.2f", cost));
    }
    
    @Override
    public void visit(Cabinet cabinet) {
        double cost = cabinet.getWeight() * 0.9 + (distance * 0.08);
        if (cabinet.isAssembled()) {
            cost += 20.0;
        }
        totalCost += cost;
        System.out.println("Distance-based shipping cost for " + cabinet.getName() + " (" + distance + " miles): $" + String.format("%.2f", cost));
    }
    
    @Override
    public void visit(Bookshelf bookshelf) {
        double cost = bookshelf.getVolume() * 0.07 + bookshelf.getWeight() * 0.75 + (distance * 0.06);
        if (bookshelf.getMaterial().equalsIgnoreCase("leather")) {
            cost += 60.0;
        }
        totalCost += cost;
        System.out.println("Distance-based shipping cost for " + bookshelf.getName() + " (" + distance + " miles): $" + String.format("%.2f", cost));
    }
    
    @Override
    public double getTotalCost() {
        return totalCost;
    }
}
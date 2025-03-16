class ExpressShippingVisitor implements ShippingCostVisitor {
    private double totalCost = 0;
    
    @Override
    public void visit(Desk desk) {
        double cost = 20.0 + (desk.getWeight() * 1.5);
        totalCost += cost;
        System.out.println("Express shipping cost for " + desk.getName() + ": $" + String.format("%.2f", cost));
    }
    
    @Override
    public void visit(Cabinet cabinet) {
        double cost = cabinet.getWeight() * 2.0;
        if (cabinet.isAssembled()) {
            cost += 35.0;
        }
        totalCost += cost;
        System.out.println("Express shipping cost for " + cabinet.getName() + ": $" + String.format("%.2f", cost));
    }
    
    @Override
    public void visit(Bookshelf bookshelf) {
        double cost = bookshelf.getVolume() * 0.1 + bookshelf.getWeight() * 1.8;
        if (bookshelf.getMaterial().equalsIgnoreCase("leather")) {
            cost += 75.0;
        }
        totalCost += cost;
        System.out.println("Express shipping cost for " + bookshelf.getName() + ": $" + String.format("%.2f", cost));
    }
    
    @Override
    public double getTotalCost() {
        return totalCost;
    }
}

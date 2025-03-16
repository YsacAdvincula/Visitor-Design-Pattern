class StandardShippingVisitor implements ShippingCostVisitor {
    private double totalCost = 0;
    
    @Override
    public void visit(Desk desk) {
        double cost = 20.0 + (desk.getWeight() * 0.6);
        totalCost += cost;
        System.out.println("Standard shipping cost for " + desk.getName() + ": $" + String.format("%.2f", cost));
    }
    
    @Override
    public void visit(Cabinet cabinet) {
        double cost = cabinet.getWeight() * 0.8;
        if (cabinet.isAssembled()) {
            cost += 30.0;
        }
        totalCost += cost;
        System.out.println("Standard shipping cost for " + cabinet.getName() + ": $" + String.format("%.2f", cost));
    }
    
    @Override
    public void visit(Bookshelf bookshelf) {
        double cost = bookshelf.getVolume() * 0.06 + bookshelf.getWeight() * 0.7;
        if (bookshelf.getMaterial().equalsIgnoreCase("leather")) {
            cost += 60.0;
        }
        totalCost += cost;
        System.out.println("Standard shipping cost for " + bookshelf.getName() + ": $" + String.format("%.2f", cost));
    }
    
    @Override
    public double getTotalCost() {
        return totalCost;
    }
}

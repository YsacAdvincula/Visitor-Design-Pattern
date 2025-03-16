public class FurnitureShipping {
    public static void main(String[] args) {
        Furniture desk = new Desk("Glass Desk", 15.5, 0.5);
        Furniture cabinet = new Cabinet("Wooden Cabinet", 45.0, 2.0, true);
        Furniture bookshelf = new Bookshelf("Wooden Bookshelf", 85.0, 4.5, "leather");
        
        Furniture[] shoppingCart = {desk, cabinet, bookshelf};
        
        System.out.println("\n====================== Standard Shipping ======================");
        ShippingCostVisitor standardShipping = new StandardShippingVisitor();
        for (Furniture item : shoppingCart) {
            item.accept(standardShipping);
        }
        System.out.println("\nTotal standard shipping cost: $" + standardShipping.getTotalCost());
        
        System.out.println("\n====================== Express Shipping ======================");
        ShippingCostVisitor expressShipping = new ExpressShippingVisitor();
        for (Furniture item : shoppingCart) {
            item.accept(expressShipping);
        }
        System.out.println("\nTotal express shipping cost: $" + expressShipping.getTotalCost());
        
        System.out.println("\n============================ Distance-Based Shipping ============================");
        ShippingCostVisitor distanceShipping = new DistanceBasedShippingVisitor(300);
        for (Furniture item : shoppingCart) {
            item.accept(distanceShipping);
        }
        System.out.println("\nTotal distance-based shipping cost: $" + distanceShipping.getTotalCost());
    }
}

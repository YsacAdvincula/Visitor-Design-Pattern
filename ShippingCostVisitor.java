interface ShippingCostVisitor {
    void visit(Desk desk);
    void visit(Cabinet cabinet);
    void visit(Bookshelf bookshelf);
    double getTotalCost();
}
public class WebShop {

    private ShoppingCart shoppingCart = null;

    public enum InfoRequest{
        ShowPurchasePrice,
        ShowRetailPrice,
        ShowShippingCosts
    }


    /**
     * Preferred method to buy products
     */
    public void buyStuff()
    {
        this.shoppingCart = new ShoppingCart();

        //Test data
        this.shoppingCart.getItems().add(new Milk(9,"Skim Milk", 5, 1 , 1000));
        this.shoppingCart.getItems().add(new Milk(10,"Whole Milk", 5.5, 1 , 1000));
        this.shoppingCart.getItems().add(new TShirt(100.0,"Fruit of the loom",10.5,150));
        this.shoppingCart.getItems().add(new IPad(2000,"IPad Air", 1950.0));
    }


    /**
     * Show purchase information to the customer
     */
    public void webShopUI(InfoRequest info)
    {
        switch (info)
        {
            case ShowPurchasePrice:
                double totPrice = 0;
               //Add magic here, step 3
                System.out.println("Purchase Price : " + totPrice);
                break;
            case ShowRetailPrice:
                System.out.println("Retail Price");
            break;
            case ShowShippingCosts:
                double ShipCost = 40;
				//Add magic here , step 3
				//Add magic here, step 4
                System.out.println("Shipping Costs: " + ShipCost);
                break;

        }

    }


}

package learn.java;

public class WarehouseDemo {

	public static void main(String[] args) {

		Warehouse bangalore = new Warehouse();
		Warehouse hyderabad = new Warehouse();
		Warehouse chennai = new Warehouse();
		
		bangalore.setWareHouseID(101);
		bangalore.setTotalArea(1000.25f);
		bangalore.setLocation("Bangalore");
		bangalore.setWorkers(new String[] {"bruce wayne", "tony stark"});
		
		
		System.out.println(bangalore);
		
		WarehouseCRUD warehouse = new WarehouseCRUD();
		warehouse.createWarehouse();

	}
}

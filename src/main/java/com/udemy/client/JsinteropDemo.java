package com.udemy.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.udemy.client.chartjs.ChartConfiguration;
import com.udemy.client.chartjs.DataConfiguration;
import com.udemy.client.chartjs.DataSetConfiguration;
import com.udemy.client.router.Router;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLCanvasElement;

public class JsinteropDemo implements EntryPoint {
  public void onModuleLoad() {

    InventoryItem item1 = new InventoryItem("abc", 10, 20);
    InventoryItem item2 = new InventoryItem("cde", 15, 50);
    InventoryItem item3 = new InventoryItem("fgh", 20, 70);

    Inventory inventory = new Inventory();
    inventory.addItem(item1);
    inventory.addItem(item2);
    inventory.addItem(item3);

    inventory.evaluate((items) -> {
      boolean isGood = 1000 < items.stream().peek(item -> GWT.log("id: " + item.getId() + " quantity: " + item.getQuantity() + "price " + item.getUnitPrice()))
                    .mapToDouble(InventoryItem::getTotalItemValue)
                    .sum();
      if(isGood)
         GWT.log("Stock is good");
      else
        GWT.log("Stock needs reprovisioning");
    });

    GWT.log(LocalStorage.isPresent("xxxx")+"");

    LocalStorage.setItem("test", "test");

    GWT.log(LocalStorage.isPresent("test")+"");


    HTMLCanvasElement canvasElement = (HTMLCanvasElement) DomGlobal.document.getElementById("myChart");

    ChartConfiguration chartConfiguration = new ChartConfiguration();
    chartConfiguration.type = "bar";

    DataConfiguration dataConfiguration = new DataConfiguration();
    dataConfiguration.labels = new String[]{"inventory item1", "inventory item2", "inventory item3"};

    DataSetConfiguration dataSetConfiguration = new DataSetConfiguration();
    dataSetConfiguration.label = "number of inventory items";
    dataSetConfiguration.data = new Number[]{12, 23, 3};
    dataSetConfiguration.backgroundColor = new String[]{"green", "blue", "yellow"};
    dataSetConfiguration.borderWidth = 1;

    dataConfiguration.datasets = new DataSetConfiguration[]{dataSetConfiguration};
    chartConfiguration.data = dataConfiguration;

    //new Chart(canvasElement, chartConfiguration);

    /* -------------------------------- */

/*    HTMLButtonElement button = (HTMLButtonElement) DomGlobal.document.createElement("button");
    button.textContent = "This is a cool button";

    button.onclick = (e) -> {GWT.log("working"); return null;};

    DomGlobal.document.body.appendChild(button);*/

    Router.init();

  }
}